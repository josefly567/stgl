/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.mx.dao.scoreinfo;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.mx.entity.scoreinfo.ScoreInfo;

/**
 * 分数明细DAO接口
 * @author sfdotz
 * @version 2017-12-16
 */
@MyBatisDao
public interface ScoreInfoDao extends CrudDao<ScoreInfo> {
	
}