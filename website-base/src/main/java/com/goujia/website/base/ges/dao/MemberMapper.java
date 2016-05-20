package com.goujia.website.base.ges.dao;

import java.util.List;

import com.goujia.website.base.entity.system.User;
import com.goujia.website.base.ges.entity.Member;
import com.goujia.website.base.ges.vo.MemberVO;



public interface MemberMapper {
    /**
     *  方法描述：添加用户
     * @param member
     * @return
     * @author zhaoyonglian 15-7-9
     */
    public int create(Member member);
    
    /**
     *  方法描述：修改用户信息
     * @param member
     * @return
     * @author  zhaoyonglian 15-7-14
     */
    public int update(Member member);
    
    /**
     *  方法描述：用户详情
     * @param memberVO
     * @return
     * @author zhaoyonglian 15-7-9
     */
    public  Member selectForMember(MemberVO memberVO);

    /**
     *  方法描述：根据邮箱或登录名获取会员信息
     * @param account
     * @return
     * @author  zhaoyonglian 15-7-9
     */
    public Member selectForMemberByAccount(String account);
    
    /**
     * 方法描述：查询用户信息
     * @param id
     * @return
     * @author  zhaoyonglian 15-7-9
     */
    public Member queryById(Integer id);
    public List<User> findAll();
}