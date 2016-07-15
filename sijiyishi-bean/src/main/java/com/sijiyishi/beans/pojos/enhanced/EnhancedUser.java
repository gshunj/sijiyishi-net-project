/**
 * 
 */
package com.sijiyishi.beans.pojos.enhanced;

import java.util.Date;

import com.sijiyishi.beans.enums.foruser.StatusEnumForUser;
import com.sijiyishi.beans.pojos.User;
import com.sijiyishi.beans.pojos.enhanced.base.BaseEnhanced;

/**
 * @author 作者 jgshun
 * @version 创建时间：2016-7-15 下午4:46:25 类说明
 */
public class EnhancedUser extends BaseEnhanced {
	public EnhancedUser(User user) {
		if (user.getId() != null) {
			this.id = user.getId();
		}

		this.name = user.getName();
		this.telphone = user.getTelphone();
		this.email = user.getEmail();
		this.password = user.getPassword();
		this.nickname = user.getNickname();
		if (user.getStatus() != null) {
			this.status = StatusEnumForUser.getStatusEnumByCode(user
					.getStatus());
		}

		this.createTime = user.getCreateTime();
		this.updateTime = user.getUpdateTime();
		this.portraitUrl = user.getPortraitUrl();
	}

	public EnhancedUser() {

	}

	private long id;
	private String name;
	private String telphone;
	private String email;
	private String password;
	private String nickname;
	private StatusEnumForUser status;
	private Date createTime;
	private Date updateTime;
	private String portraitUrl;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public StatusEnumForUser getStatus() {
		return status;
	}

	public void setStatus(StatusEnumForUser status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getPortraitUrl() {
		return portraitUrl;
	}

	public void setPortraitUrl(String portraitUrl) {
		this.portraitUrl = portraitUrl;
	}

}
