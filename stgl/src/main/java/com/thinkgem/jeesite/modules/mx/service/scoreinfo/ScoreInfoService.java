/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.mx.service.scoreinfo;

import java.util.List;

import com.thinkgem.jeesite.modules.sys.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.mx.entity.scoreinfo.ScoreInfo;
import com.thinkgem.jeesite.modules.mx.dao.scoreinfo.ScoreInfoDao;

/**
 * 分数明细Service
 * @author sfdotz
 * @version 2017-12-16
 */
@Service
@Transactional(readOnly = true)
public class ScoreInfoService extends CrudService<ScoreInfoDao, ScoreInfo> {

	@Autowired
	private UserDao userDao;

	public ScoreInfo get(String id) {
		return super.get(id);
	}
	
	public List<ScoreInfo> findList(ScoreInfo scoreInfo) {
		return super.findList(scoreInfo);
	}
	
	public Page<ScoreInfo> findPage(Page<ScoreInfo> page, ScoreInfo scoreInfo) {
		return super.findPage(page, scoreInfo);
	}
	
	@Transactional(readOnly = false)
	public void save(ScoreInfo scoreInfo) {
		super.save(scoreInfo);
	}
	
	@Transactional(readOnly = false)
	public void delete(ScoreInfo scoreInfo) {
		super.delete(scoreInfo);
	}

	/**
	 * 加分
	 */
	public void addScore(ScoreInfo scoreInfo){


	}

	/**
	 * 扣分
	 */
	public void minusScore(ScoreInfo scoreInfo){

	}
	
}