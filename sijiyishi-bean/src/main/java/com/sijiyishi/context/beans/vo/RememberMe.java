package com.sijiyishi.context.beans.vo;

import java.io.Serializable;

import com.sijiyishi.beans.pojos.enhanced.EnhancedUserSession;

/**
 * @author jgshun
 * @date 2016-4-15 上午11:06:38
 * @version 1.0
 */
public class RememberMe implements Serializable {
	public RememberMe(boolean rm, EnhancedUserSession ser) {
		this.ser = ser;
		this.rm = rm;
	}

	public RememberMe(EnhancedUserSession ser) {
		this.ser = ser;
	}

	public RememberMe() {
		super();
	}

	private EnhancedUserSession ser;
	private boolean rm;

	/**
	 * @return the ser
	 */
	public EnhancedUserSession getSer() {
		return ser;
	}

	/**
	 * @param ser
	 *            the ser to set
	 */
	public void setSer(EnhancedUserSession ser) {
		this.ser = ser;
	}

	/**
	 * @return the rm
	 */
	public boolean isRm() {
		return rm;
	}

	/**
	 * @param rm
	 *            the rm to set
	 */
	public void setRm(boolean rm) {
		this.rm = rm;
	}

}
