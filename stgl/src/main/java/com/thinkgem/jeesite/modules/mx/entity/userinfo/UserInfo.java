/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.mx.entity.userinfo;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 管理用户信息，包括社团考评Entity
 * @author sfdotz
 * @version 2017-12-16
 */
public class UserInfo extends DataEntity<UserInfo> {
	
	private static final long serialVersionUID = 1L;
	private Integer age;		// 年龄
	private String clazz;		// 班级
	private String number;		// 学号
	private String sex;		// 性别
	private String email;		// 邮箱
	private String work;		// 工作
	private String honour;		// 荣誉
	private String introduction;		// 自我介绍
	private String company;		// 公司
	private Integer mxScore;		// 考评
	private String location;		// 位置
	private String homeplace;		// 家乡
	private Integer beginMxScore;		// 开始 考评
	private Integer endMxScore;		// 结束 考评
	/**
	 * 姓名
	 */
	private String name; //

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserInfo() {
		super();
	}

	public UserInfo(String id){
		super(id);
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Length(min=1, max=255, message="班级长度必须介于 1 和 255 之间")
	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	
	@Length(min=1, max=255, message="学号长度必须介于 1 和 255 之间")
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	@Length(min=0, max=1, message="性别长度必须介于 0 和 1 之间")
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Length(min=0, max=255, message="邮箱长度必须介于 0 和 255 之间")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Length(min=0, max=255, message="工作长度必须介于 0 和 255 之间")
	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	
	public String getHonour() {
		return honour;
	}

	public void setHonour(String honour) {
		this.honour = honour;
	}
	
	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
	@Length(min=0, max=255, message="公司长度必须介于 0 和 255 之间")
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public Integer getMxScore() {
		return mxScore;
	}

	public void setMxScore(Integer mxScore) {
		this.mxScore = mxScore;
	}
	
	@Length(min=0, max=255, message="位置长度必须介于 0 和 255 之间")
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	@Length(min=0, max=255, message="家乡长度必须介于 0 和 255 之间")
	public String getHomeplace() {
		return homeplace;
	}

	public void setHomeplace(String homeplace) {
		this.homeplace = homeplace;
	}
	
	public Integer getBeginMxScore() {
		return beginMxScore;
	}

	public void setBeginMxScore(Integer beginMxScore) {
		this.beginMxScore = beginMxScore;
	}
	
	public Integer getEndMxScore() {
		return endMxScore;
	}

	public void setEndMxScore(Integer endMxScore) {
		this.endMxScore = endMxScore;
	}
		
}