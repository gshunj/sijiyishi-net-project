package com.sijiyishi.context.beans.vo;

import java.io.Serializable;
import java.util.Date;

import com.sijiyishi.beans.pojos.enhanced.EnhancedUserSession;

/**
 * @author jgshun
 * @date 2016-4-13 下午3:18:51
 * @version 1.0
 */
public class UserToken implements Serializable {

	public UserToken() {
		super();
	}

	public UserToken(Date time, String token, String uid, String sign) {
		super();
		this.time = time;
		this.token = token;
		this.uid = uid;
		this.sign = sign;
	}

	public UserToken(EnhancedUserSession enhancedUserSession) {
		super();
		this.time = enhancedUserSession.getTime();
		this.token = enhancedUserSession.getToken();
		this.uid = enhancedUserSession.getUid();
		this.sign = enhancedUserSession.getSign();
	}

	private Date time;
	private String token;
	private String uid;
	private String sign;
	private RememberMe rm;

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token
	 *            the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * @param uid
	 *            the uid to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * @return the sign
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * @param sign
	 *            the sign to set
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}

	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * @return the rm
	 */
	public RememberMe getRm() {
		return rm;
	}

	/**
	 * @param rm
	 *            the rm to set
	 */
	public void setRm(RememberMe rm) {
		this.rm = rm;
	}

}
