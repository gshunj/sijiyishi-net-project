package com.sijiyishi.beans.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sijiyishi.beans.pojos.base.BasePo;

@Table(name = "t_user")
public class User extends BasePo {
	/**
	 * 自增id
	 */
	@Id
	@GeneratedValue(generator = "JDBC")
	private Long id;

	/**
	 * 用户名
	 */
	private String name;

	/**
	 * 手机号
	 */
	private String telphone;

	/**
	 * 邮件
	 */
	private String email;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 昵称
	 */
	private String nickname;

	/**
	 * 用户状态(1 正常 2已锁定)
	 */
	private Short status;

	/**
	 * 创建时间
	 */
	@Column(name = "create_time")
	private Date createTime;

	/**
	 * 更新时间
	 */
	@Column(name = "update_time")
	private Date updateTime;

	/**
	 * 用户头像地址
	 */
	@Column(name = "portrait_url")
	private String portraitUrl;

	/**
	 * 获取自增id
	 * 
	 * @return id - 自增id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 设置自增id
	 * 
	 * @param id
	 *            自增id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取用户名
	 * 
	 * @return name - 用户名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置用户名
	 * 
	 * @param name
	 *            用户名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取手机号
	 * 
	 * @return telphone - 手机号
	 */
	public String getTelphone() {
		return telphone;
	}

	/**
	 * 设置手机号
	 * 
	 * @param telphone
	 *            手机号
	 */
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	/**
	 * 获取邮件
	 * 
	 * @return email - 邮件
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 设置邮件
	 * 
	 * @param email
	 *            邮件
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 获取密码
	 * 
	 * @return password - 密码
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 设置密码
	 * 
	 * @param password
	 *            密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 获取昵称
	 * 
	 * @return nickname - 昵称
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * 设置昵称
	 * 
	 * @param nickname
	 *            昵称
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	/**
	 * 获取创建时间
	 * 
	 * @return create_time - 创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置创建时间
	 * 
	 * @param createTime
	 *            创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 获取更新时间
	 * 
	 * @return update_time - 更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 设置更新时间
	 * 
	 * @param updateTime
	 *            更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 获取用户头像地址
	 * 
	 * @return portrait_url - 用户头像地址
	 */
	public String getPortraitUrl() {
		return portraitUrl;
	}

	/**
	 * 设置用户头像地址
	 * 
	 * @param portraitUrl
	 *            用户头像地址
	 */
	public void setPortraitUrl(String portraitUrl) {
		this.portraitUrl = portraitUrl;
	}
}