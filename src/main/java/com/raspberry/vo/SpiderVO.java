package com.raspberry.vo;

import com.raspberry.base.BaseVO;

/**
* @author zyl
* @date 2016年12月1日 
* @describe
*/
public class SpiderVO <E> extends BaseVO<E> {
	
    private String name;//用户名
    private String identity;//身份
    private String location;//所在地
    private int sex;//性别
    private String school;//学校
    private String major;//专业
    private int agree;//赞同数
    private int thanks;//感谢数
    private int followPerson;//关注者
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getAgree() {
		return agree;
	}
	public void setAgree(int agree) {
		this.agree = agree;
	}
	public int getThanks() {
		return thanks;
	}
	public void setThanks(int thanks) {
		this.thanks = thanks;
	}
	public int getFollowPerson() {
		return followPerson;
	}
	public void setFollowPerson(int followPerson) {
		this.followPerson = followPerson;
	}
    
}
