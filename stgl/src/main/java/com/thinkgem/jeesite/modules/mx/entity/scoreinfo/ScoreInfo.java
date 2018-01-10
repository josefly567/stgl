/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.mx.entity.scoreinfo;

import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotNull;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 分数明细Entity
 * @author sfdotz
 * @version 2017-12-16
 */
public class ScoreInfo extends DataEntity<ScoreInfo> {
	
	private static final long serialVersionUID = 1L;
	private String type;		// type
	private String describe;		// describe
	private String number;		// number
	private Integer score;		// score
	
	public ScoreInfo() {
		super();
	}

	public ScoreInfo(String id){
		super(id);
	}

	@Length(min=1, max=1, message="type长度必须介于 1 和 1 之间")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
	@Length(min=1, max=20, message="number长度必须介于 1 和 20 之间")
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	@NotNull(message="score不能为空")
	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
	
}