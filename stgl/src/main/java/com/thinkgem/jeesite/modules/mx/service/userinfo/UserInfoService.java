/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.mx.service.userinfo;

import java.util.List;

import com.thinkgem.jeesite.modules.sys.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.mx.entity.userinfo.UserInfo;
import com.thinkgem.jeesite.modules.mx.dao.userinfo.UserInfoDao;

/**
 * 管理用户信息，包括社团考评Service
 * @author sfdotz
 * @version 2017-12-16
 */
@Service
@Transactional(readOnly = true)
public class UserInfoService extends CrudService<UserInfoDao, UserInfo> {

	@Autowired
	private UserInfoDao userInfoDao;

	public UserInfo get(String id) {
		return super.get(id);
	}
	
	public List<UserInfo> findList(UserInfo userInfo) {
		return super.findList(userInfo);
	}
	
	public Page<UserInfo> findPage(Page<UserInfo> page, UserInfo userInfo) {
		return super.findPage(page, userInfo);
	}
	
	@Transactional(readOnly = false)
	public void save(UserInfo userInfo) {
		super.save(userInfo);
	}
	
	@Transactional(readOnly = false)
	public void delete(UserInfo userInfo) {
		super.delete(userInfo);
	}

	/**
	 * 通过学号查询
	 * @param number
	 * @return
	 */
	public UserInfo findByNumber(String number ){
		return userInfoDao.selectByNumber(number);
	}

	public  void updaUserInfo(UserInfo userInfo){
		userInfoDao.update(userInfo);
	}


}