/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author Flouny.Caesar
 * @version 2.0
 * @date 2014-11-26
 */
package com.goujia.website.base.utils;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import com.goujia.website.base.constants.base.SysConstants;
import com.goujia.website.base.constants.image.IPPY;
import com.goujia.website.base.constants.image.ResPPE;
import com.goujia.website.base.constants.image.Resolution;
import com.goujia.website.base.constants.image.Tag;
import com.goujia.website.base.utils.encrypt.SHA256;
import com.goujia.website.base.utils.thread.ThreadPool;

/**
 * 存储 实现
 * @author Flouny.Caesar
 *
 */
public class ImageHelper {
	
	private final static Logger LOG = LoggerFactory.getLogger(ImageHelper.class);
	private final static String WATER_MARK_PATH="/uploaded/111888/watermark.png";
	/**
	 * 上传Banner图片 (只是网站大Banner的图片)
	 * 
	 * @param pic
	 * @return
	 * @throws IOException
	 */
	public Image addTpsPic(String path, MultipartFile pic) throws IOException {
		Image image = getStores(getIPPY(path, Tag.tps.name()), pic);
		
		storeBig(pic, image.getOriginal());
		storeThumbnail(pic, image.getThumbnails());

		return image;
	}

	/**
	 * 上传内部图片 (运营、设计或公司内部其他部门上传的图片)
	 * 
	 * @param pic
	 * @return
	 * @throws IOException
	 */
	public Image addImgextraPic(String path, MultipartFile pic) throws IOException {
		Image image = getStores(getIPPY(path, Tag.imgextra.name()), pic);
		
		storeBig(pic, image.getOriginal());
		storeThumbnail(pic, image.getThumbnails());

		return image;
	}

	/**
	 * 上传用户图片 (外部用户自己上传的图片)
	 * 
	 * @param pic
	 * @return
	 * @throws IOException
	 */
	public Image addUploadedPic(String path, MultipartFile pic) throws IOException {
		Image image = getStores(getIPPY(path, Tag.uploaded.name()), pic);
		
		storeBig(pic, image.getOriginal());
		storeThumbnail(pic, image.getThumbnails());
		
		return image;
	}
	/**
	 * 上传用户图片 (外部用户自己上传的图片)
	 * 
	 * @param pic
	 * @return
	 * @throws IOException
	 */
	public Image addUploadedPic(String path, MultipartFile pic,int width,int height) throws IOException {
		Image image = getStores(getIPPY(path, Tag.uploaded.name()), pic);
		storeBig(pic, image.getOriginal());
		storeThumbnail(pic, image.getThumbnails());
		
		return image;
	}
	/**
	 * 上传用户图片 (外部用户自己上传的图片,读InputStream)
	 * 
	 * @param pic
	 * @return
	 * @throws IOException
	 */
	public Image addUploadedPic(String path, MultipartFile pic,int width,int height,BufferedImage bi,Integer uploadType) throws IOException {
		Image image = getStores(getIPPY(path, Tag.uploaded.name()), pic,bi);
		image.getOriginal().setWatermarkPath(path+WATER_MARK_PATH);
		storeBig(bi, image.getOriginal());
		/*
		if(SysConstants.upload_pictory_size_map.containsKey(uploadType)){
			for(Rectangle rec:SysConstants.upload_pictory_size_map.get(uploadType)){
				BufferedImage tmp=cutImage(bi,rec.getWidth(),rec.getHeight());
				if(tmp!=null)
					ImageIO.write(tmp,image.getOriginal().getExt(), new File(
						image.getOriginal().getFullPath()));
			}
		}
		*/
		return image;
	}
	/**
	 * 生成大图
	 * 
	 * @param pic
	 * @param resPPE
	 */
	private void storeBig(MultipartFile pic, ResPPE resPPE) {
		try {
			BufferedImage img = javax.imageio.ImageIO
					.read(pic.getInputStream());
			if (img.getWidth() > 1920 || img.getHeight() > 1000) {
				OutputStream os = new FileOutputStream(resPPE.getFullPath());
				Thumbnails.of(pic.getInputStream()).size(1920, 1000)
						.toOutputStream(os);
			} else {
				FileUtil.copyInputStreamToFile(pic.getInputStream(), new File(
						resPPE.getFullPath()));
			}

		} catch (IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
	/**
	 * 生成大图(读InputStream)
	 * 
	 * @param pic
	 * @param resPPE
	 */
	private void storeBig(BufferedImage img,ResPPE resPPE) {
		try {
//			if (img.getWidth() > 1920 || img.getHeight() > 1000) {
//				OutputStream os = new FileOutputStream(resPPE.getFullPath());
//				Thumbnails.of(img).size(1920, 1000)
//						.toOutputStream(os);
//			} else {
				markImageByIcon(resPPE,img);
//			}

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	/**
	 * 生成缩略图
	 * 
	 * @param pic
	 * @param stores
	 * @throws IOException
	 */
	private void storeThumbnail(final MultipartFile pic,
			final List<ResPPE> stores) throws IOException {
		ThreadPool threadPool = new ThreadPool(3);
		
		for (final ResPPE resppe : stores) {
			if (resppe.getWidth() > 0 && resppe.getHeight() > 0) {
				threadPool.execute(new Runnable() {
					/*@Override*/
					public void run() {
						try {
							BufferedImage img = javax.imageio.ImageIO.read(pic.getInputStream());
							Integer width = img.getWidth();
							Integer height = img.getHeight();
							Integer res_width = resppe.getWidth();
							Integer res_height = resppe.getHeight();
							
//							if(((float)res_height/(float)res_width > 1 &&(float)res_height > height) || ((float)res_height/(float)res_width < 1 &&(float)res_width > width))
//							{
//								Thumbnails.of(pic.getInputStream()).toFile(resppe.getFullPath());
//							}
							
							if((float)res_height/(float)res_width > 1){
								if(width > height){
									Thumbnails
									.of(pic.getInputStream())
									.sourceRegion(
											Positions.CENTER,
											res_width*height/res_height,
											height)
									.size(res_width,res_height)
									.toFile(resppe.getFullPath());
								}else{
									if((float)width/(float)height>(float)res_width/(float)res_height){
										Thumbnails
										.of(pic.getInputStream())
										.sourceRegion(
												Positions.CENTER,
												width,
												res_height*width/res_width)
										.size(res_width,res_height)
										.toFile(resppe.getFullPath());
									}else{
										Thumbnails
										.of(pic.getInputStream())
										.sourceRegion(
												Positions.CENTER,
												res_width*height/res_height,
												height)
										.size(res_width,res_height)
										.toFile(resppe.getFullPath());
									}
								}
							}else if((float)res_height/(float)res_width < 1){
								if(width < height){
									Thumbnails
									.of(pic.getInputStream())
									.sourceRegion(
											Positions.CENTER,
											width,
											res_height*width/res_width)
									.size(res_width,res_height)
									.toFile(resppe.getFullPath());
								}else{
									if((float)width/(float)height>(float)res_width/(float)res_height){
										Thumbnails
										.of(pic.getInputStream())
										.sourceRegion(
												Positions.CENTER,
												res_width*height/res_height,
												height)
										.size(res_width,res_height)
										.toFile(resppe.getFullPath());
									}else{
										Thumbnails
										.of(pic.getInputStream())
										.sourceRegion(
												Positions.CENTER,
												width,
												res_height*width/res_width)
										.size(res_width,res_height)
										.toFile(resppe.getFullPath());
									}
									
								}
							}else{
								if(width < height){
									Thumbnails
									.of(pic.getInputStream())
									.sourceRegion(
											Positions.CENTER,
											width,
											width)
									.size(res_width,res_height)
									.toFile(resppe.getFullPath());
								}else{
									Thumbnails
									.of(pic.getInputStream())
									.sourceRegion(
											Positions.CENTER,
											height,
											height)
									.size(res_width,res_height)
									.toFile(resppe.getFullPath());
								}
							}
							
						} catch (IOException e) {
							LOG.error(e.getMessage(), e);
						}
					}
				});
			}
		}
		threadPool.waitFinish(); // 等待所有任务执行完毕
		threadPool.closePool();
	}
	/**
	 * 生成缩略图(传BufferedImage)
	 * 
	 * @param pic
	 * @param stores
	 * @throws IOException
	 */
	private void storeThumbnail(final BufferedImage img,
			final List<ResPPE> stores) throws IOException {
		ThreadPool threadPool = new ThreadPool(3);
		
		for (final ResPPE resppe : stores) {
			if (resppe.getWidth() > 0 && resppe.getHeight() > 0) {
				threadPool.execute(new Runnable() {
					/*@Override*/
					public void run() {
						try {
							Integer width = img.getWidth();
							Integer height = img.getHeight();
							Integer res_width = resppe.getWidth();
							Integer res_height = resppe.getHeight();
							
//							if(((float)res_height/(float)res_width > 1 &&(float)res_height > height) || ((float)res_height/(float)res_width < 1 &&(float)res_width > width))
//							{
//								Thumbnails.of(pic.getInputStream()).toFile(resppe.getFullPath());
//							}
							
							if((float)res_height/(float)res_width > 1){
								if(width > height){
									Thumbnails
									.of(img)
									.sourceRegion(
											Positions.CENTER,
											res_width*height/res_height,
											height)
									.size(res_width,res_height)
									.toFile(resppe.getFullPath());
								}else{
									if((float)width/(float)height>(float)res_width/(float)res_height){
										Thumbnails
										.of(img)
										.sourceRegion(
												Positions.CENTER,
												width,
												res_height*width/res_width)
										.size(res_width,res_height)
										.toFile(resppe.getFullPath());
									}else{
										Thumbnails
										.of(img)
										.sourceRegion(
												Positions.CENTER,
												res_width*height/res_height,
												height)
										.size(res_width,res_height)
										.toFile(resppe.getFullPath());
									}
								}
							}else if((float)res_height/(float)res_width < 1){
								if(width < height){
									Thumbnails
									.of(img)
									.sourceRegion(
											Positions.CENTER,
											width,
											res_height*width/res_width)
									.size(res_width,res_height)
									.toFile(resppe.getFullPath());
								}else{
									if((float)width/(float)height>(float)res_width/(float)res_height){
										Thumbnails
										.of(img)
										.sourceRegion(
												Positions.CENTER,
												res_width*height/res_height,
												height)
										.size(res_width,res_height)
										.toFile(resppe.getFullPath());
									}else{
										Thumbnails
										.of(img)
										.sourceRegion(
												Positions.CENTER,
												width,
												res_height*width/res_width)
										.size(res_width,res_height)
										.toFile(resppe.getFullPath());
									}
									
								}
							}else{
								if(width < height){
									Thumbnails
									.of(img)
									.sourceRegion(
											Positions.CENTER,
											width,
											width)
									.size(res_width,res_height)
									.toFile(resppe.getFullPath());
								}else{
									Thumbnails
									.of(img)
									.sourceRegion(
											Positions.CENTER,
											height,
											height)
									.size(res_width,res_height)
									.toFile(resppe.getFullPath());
								}
							}
							
						} catch (IOException e) {
							LOG.error(e.getMessage(), e);
						}
					}
				});
			}
		}
		threadPool.waitFinish(); // 等待所有任务执行完毕
		threadPool.closePool();
	}

	/**
	 * 返回需要存储的图片路径
	 * 
	 * @param ippy
	 * @param pic
	 * @return
	 */
	private Image getStores(IPPY ippy, MultipartFile pic) {
		Image ppes = new Image();

		try {
			// String newPicName =
			// SHA256.encrypt(pic.getOriginalFilename()).substring(0, 24);
			String newPicName = SHA256.encrypt(
					String.valueOf(new Date().getTime())).substring(0, 24);
			BufferedImage sourceImg = javax.imageio.ImageIO.read(pic
					.getInputStream());
			String ext = FilenameUtils.getExtension(pic.getOriginalFilename());

			setOriginal(ippy, ppes, newPicName, ext);
			setThumbs(ippy, ppes, newPicName, sourceImg, ext);

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}

		return ppes;
	}
	/**
	 * 返回需要存储的图片路径 (读input)
	 * 
	 * @param ippy
	 * @param pic
	 * @return
	 */
	private Image getStores(IPPY ippy, MultipartFile pic,BufferedImage sourceImg) {
		Image ppes = new Image();

		try {
			// String newPicName =
			// SHA256.encrypt(pic.getOriginalFilename()).substring(0, 24);
			String newPicName = SHA256.encrypt(
					String.valueOf(new Date().getTime())).substring(0, 15);
			String ext = FilenameUtils.getExtension(pic.getOriginalFilename());

			setOriginal(ippy, ppes, newPicName, ext);
			setThumbs(ippy, ppes, newPicName, sourceImg, ext);

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}

		return ppes;
	}

	/**
	 * 设置缩略图
	 * 
	 * @param ippy
	 * @param image
	 * @param newPicName
	 * @param sourceImg
	 * @param ext
	 */
	private void setThumbs(IPPY ippy, Image image, String newPicName,
			BufferedImage sourceImg, String ext) {
		List<Resolution> res = getFilters(sourceImg.getWidth(),
				sourceImg.getHeight());
		List<ResPPE> newThumbs = new ArrayList<ResPPE>();
		for (Resolution r : res) {
			ResPPE resPPE = new ResPPE();
			resPPE.setWidth(r.getWidth());
			resPPE.setHeight(r.getHeight());

			String scale = r.getWidth() + "x" + r.getHeight();
			resPPE.setScale(scale);
			resPPE.setExt(ext);
			resPPE.setRelaDirPath(ippy.getRelative());
			resPPE.setPicName(newPicName);

			String fullPath = ippy.getFull() + "/" + newPicName + "_" + scale
					+ "." + ext;
			resPPE.setFullPath(fullPath);

			newThumbs.add(resPPE);
		}

		image.setThumbnails(newThumbs);
	}

	/**
	 * 设置原图
	 * 
	 * @param ippy
	 * @param image
	 * @param newPicName
	 * @param ext
	 */
	private void setOriginal(IPPY ippy, Image image, String newPicName,
			String ext) {
		ResPPE resPPE = new ResPPE();
		resPPE.setExt(ext);
		resPPE.setRelaDirPath(ippy.getRelative());
		resPPE.setPicName(newPicName);

		String fp = ippy.getFull() + "/" + newPicName + "." + ext;
		resPPE.setFullPath(fp);

		image.setOriginal(resPPE);
	}

	/**
	 * 返回比例尺
	 * 
	 * @param width
	 * @param height
	 * @return
	 */
	private List<Resolution> getFilters(int width, int height) {
		Resolution[] resolutions = Resolution.values();
		int iEqual = width + height;
		List<Resolution> tmpList = new ArrayList<Resolution>();
		for (int i = 0; i < resolutions.length; i++) {
			Resolution resolution = resolutions[i];
			int rEqual = resolution.getWidth() + resolution.getHeight();

			if (rEqual <= iEqual) {
				tmpList.add(resolution);
			}
		}

		List<Resolution> results = new ArrayList<Resolution>();
		for (int j = 0; j < tmpList.size(); j++) {
			Resolution resolution = tmpList.get(j);
			if (resolution.getWidth() <= width
					&& resolution.getHeight() <= height) {
				results.add(resolution);
			}
		}

		return results;
	}

	/**
	 * 返回图片路径
	 * 
	 * @param tag
	 * @return
	 */
	private IPPY getIPPY(String path, String tag) {
		File rd = new File(path); // 根目录
		if (!rd.exists()) {
			rd.mkdir();
		}
		LOG.warn("root_path"+rd.getPath());

		File td = new File(rd.getPath() + "/" + tag); // 一级目录
		if (!td.exists()) {
			td.mkdir();
		}
		LOG.warn("one_path"+td.getPath());
		String timestamp = String.valueOf(new Date().getTime()).substring(0, 6); // 二级目录
		File sd = new File(td.getPath() + "/" + timestamp);
		if (!sd.exists()) {
			sd.mkdir();
		}
		LOG.warn("two_path"+sd.getPath());
		IPPY ippy = new IPPY();
		ippy.setFull(sd.getPath());
		ippy.setRelative(tag + "/" + timestamp);
		LOG.warn("ippy_rel"+ippy.getRelative());
		return ippy;
	}
	public BufferedImage cutImage(BufferedImage bi,int width,int height){
    	if (null == bi || 0 == width || 0 == height) {
            return null; 
        }   
    	BufferedImage target=null;
    	int origWidth=bi.getWidth();
    	int origHeight=bi.getHeight();
    	if(origWidth<width || origHeight<height)
    		return null;
    	double tmpWidth=height*1.0/origHeight*width;
    	int newWidth=(int)Math.ceil(tmpWidth);
    	java.awt.Image image=null;
    	if(newWidth>=width){
    		image=bi.getScaledInstance(newWidth, height, BufferedImage.SCALE_SMOOTH);
    		
    	}
    	else{
    		double tmpHeight=width*1.0/origWidth*height;
    		int newHeight=(int)Math.ceil(tmpHeight);
    		image=bi.getScaledInstance(width, newHeight, BufferedImage.SCALE_SMOOTH);
    	}
    	origWidth=image.getWidth(null);
    	origHeight=image.getHeight(null);
    	int startX=origWidth/2-width/2;
    	int startY=origHeight/2-height/2;
    	int endX=origWidth/2+width/2;
    	int endY=origHeight/2+height/2;
    	target = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    	Graphics g = target.getGraphics();
    	g.drawImage(image, 0, 0, width, height, startX, startY,endX, endY, null);
    	return target;
    }
	public void markImageByIcon(ResPPE res, BufferedImage srcImg 
            ) {     
        OutputStream os = null;     
        try {     
            BufferedImage buffImg = new BufferedImage(srcImg.getWidth(null),     
                    srcImg.getHeight(null), BufferedImage.TYPE_INT_RGB);   
            // 得到画笔对象     
            // Graphics g= buffImg.getGraphics();     
            Graphics2D g = buffImg.createGraphics();     
    
            // 设置对线段的锯齿状边缘处理     
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,     
                    RenderingHints.VALUE_INTERPOLATION_BILINEAR);     
    
            g.drawImage(srcImg.getScaledInstance(srcImg.getWidth(null), srcImg     
                    .getHeight(null), java.awt.Image.SCALE_SMOOTH), 0, 0, null);     
    
            // 水印图象的路径 水印一般为gif或者png的，这样可设置透明度    
            BufferedImage img = ImageIO.read(new File(res.getWatermarkPath()));     
            float alpha = 0.2f; // 透明度
            g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP,     
                    alpha));
            // 表示水印图片的位置
            //计算水印的位置,水印右下角离图片右下角右下各20个像素
            int srcWidth=srcImg.getWidth();
            int srcHeigh=srcImg.getHeight();
            int iconHeight=img.getHeight(null);
            int iconWidth=img.getWidth(null);
            int x=srcWidth-iconWidth;
            int y=srcHeigh-iconHeight;
            g.drawImage(img, x-20, y-20, null);
            g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));     
            g.dispose();     
            os = new FileOutputStream(res.getFullPath());     
            // 生成图片     
            ImageIO.write(buffImg, res.getExt(), os);
        } catch (Exception e) {     
            e.printStackTrace();     
        } finally {     
            try {     
                if (null != os)     
                    os.close();     
            } catch (Exception e) {     
                e.printStackTrace();     
            }     
        }     
    }   
	public Image addUploadedAvatar(String path, MultipartFile pic) throws Exception{
		Image image = getAvatarStores(getIPPY(path, Tag.uploaded.name()), pic);
		for(Rectangle rec:SysConstants.avatarSizeList){
			Thumbnails.of(pic.getInputStream()).size(rec.getWidth(), rec.getHeight()).toFile(getThumPath(image.getOriginal(), rec.getWidth(),rec.getHeight()));
		}
		Rectangle big=SysConstants.avatarSizeList.get(0);
		Thumbnails.of(pic.getInputStream()).size(big.getWidth(),big.getHeight()).toFile(getStorePath(image.getOriginal()));
		return image;
	}
	private Image getAvatarStores(IPPY ippy, MultipartFile pic) {
		Image image = new Image();

		try {
			// String newPicName =
			// SHA256.encrypt(pic.getOriginalFilename()).substring(0, 24);
			String newPicName = SHA256.encrypt(
					String.valueOf(new Date().getTime())).substring(0, 24);
			String ext = FilenameUtils.getExtension(pic.getOriginalFilename());
			ResPPE resPPE = new ResPPE();
			resPPE.setExt(ext);
			resPPE.setRelaDirPath(ippy.getRelative());
			resPPE.setPicName(newPicName);
			resPPE.setFullPath(ippy.getFull());
			image.setOriginal(resPPE);

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}

		return image;
	}
	private String getThumPath(ResPPE resPPE,int width,int height){
		StringBuffer sb=new StringBuffer();
		sb.append(resPPE.getFullPath());
		sb.append(File.separator);
		sb.append(resPPE.getPicName());
		sb.append("_");
		sb.append(width);
		sb.append("_");
		sb.append(height);
		sb.append(".");
		sb.append(resPPE.getExt());
		return sb.toString();
	}
	private String getStorePath(ResPPE resPPE){
		StringBuffer sb=new StringBuffer();
		sb.append(resPPE.getFullPath());
		sb.append(File.separator);
		sb.append(resPPE.getPicName());
		sb.append(".");
		sb.append(resPPE.getExt());
		return sb.toString();
	}
	
}