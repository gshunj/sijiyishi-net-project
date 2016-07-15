package com.sijiyishi.context.beans.vo;

import java.io.Serializable;
import java.util.Date;

import com.sijiyishi.beans.enums.ServerTypeEnum;
import com.sijiyishi.beans.pojos.enhanced.EnhancedUser;
import com.sijiyishi.beans.pojos.enhanced.EnhancedUserSession;

/**
 * 用户上下文
 * 
 * @author jgshun
 * 
 */
public class UserContext implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -570053247155552233L;

	private EnhancedUser enhancedUser;// 用户
	private long userId;// 用户id
	private String account;// 账户名
	private String operator;// 当前操作
	private Date operatorDate;
	private ServerTypeEnum serverType;// 服务程序类型
	private EnhancedUserSession enhancedUserSession;

	public EnhancedUser getEnhancedUser() {
		return enhancedUser;
	}

	public void setEnhancedUser(EnhancedUser enhancedUser) {
		if (enhancedUser != null) {
			this.userId = enhancedUser.getId();
		}
		this.enhancedUser = enhancedUser;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getOperatorDate() {
		return operatorDate;
	}

	public void setOperatorDate(Date operatorDate) {
		this.operatorDate = operatorDate;
	}

	public ServerTypeEnum getServerType() {
		return serverType;
	}

	public void setServerType(ServerTypeEnum serverType) {
		this.serverType = serverType;
	}

	public EnhancedUserSession getEnhancedUserSession() {
		return enhancedUserSession;
	}

	public void setEnhancedUserSession(EnhancedUserSession enhancedUserSession) {
		this.enhancedUserSession = enhancedUserSession;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
