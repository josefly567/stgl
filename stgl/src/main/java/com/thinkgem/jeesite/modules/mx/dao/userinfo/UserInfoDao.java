/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.mx.dao.userinfo;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.mx.entity.userinfo.UserInfo;

/**
 * 管理用户信息，包括社团考评DAO接口
 * @author sfdotz
 * @version 2017-12-16
 */
@MyBatisDao
public interface UserInfoDao extends CrudDao<UserInfo> {


    UserInfo selectByNumber(String number);
	
}