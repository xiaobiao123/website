/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project
 * @author Flouny.Caesar
 * @version 2.0
 * @date 2014-11-26
 */
package com.goujia.website.base.utils;

import java.io.File;
import java.io.IOException;
import java.security.AccessController;
import java.security.SecureRandom;

import org.apache.commons.io.FileUtils;

import sun.security.action.GetPropertyAction;

/**
 * 文件工具
 * 
 * @author Flouny.Caesar
 *
 */
public class FileUtil extends FileUtils {
	
	public static File createTempFile(String prefix, String suffix) throws IOException {
		
		return createTempFile(prefix, suffix, null);
	}
	
	public static File createTempFile(String prefix, String suffix, File directory) throws IOException {
//		if (prefix.length() < 3)  throw new IllegalArgumentException("Prefix string too short");
//        if (suffix == null) suffix = ".tmp";

        File tmpdir = (directory != null)?directory:TempDirectory.location();
        File f;
        try {
        	do {
        		f = TempDirectory.generateFile(prefix, suffix, tmpdir);
            } while (f.exists());
        	if (!f.createNewFile())
        		throw new IOException("Unable to create temporary file");
        } catch (SecurityException se) {
        	if (directory == null)
                throw new SecurityException("Unable to create temporary file");
        	
            throw se;
        }
        
        return f;
	}
	
	private static class TempDirectory {
		private TempDirectory() {
			// ...
		}
		
		private static final File tmpdir = new File(AccessController.doPrivileged(new GetPropertyAction("java.io.tmpdir")));
		
		static File location() {
			
			return tmpdir;
        }
		
		private static final SecureRandom random = new SecureRandom();
		
		static File generateFile(String prefix, String suffix, File dir) throws IOException {
			long n = random.nextLong();
			if (n == Long.MIN_VALUE) {
				n = 0;
			} else {
				n = Math.abs(n);
            }
			
			prefix = (new File(prefix)).getName();
			String name = prefix + Long.toString(n) + suffix;
            File f = new File(dir, name);
            if (!name.equals(f.getName())) {
            	if (System.getSecurityManager() != null) {
            		throw new IOException("Unable to create temporary file");
            	} else {
            		throw new IOException("Unable to create temporary file, " + f);
            	} 
            }
            
            return f;
        }
    }
}