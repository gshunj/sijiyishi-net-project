/**
 * 
 */
package com.sijiyishi.beans.enums;

/**
 * @author 作者 jgshun
 * @version 创建时间：2016-7-15 下午4:16:53 类说明
 */
public enum PlatformEnum {

	/**
	 * 1, "安卓", true
	 */
	ANDROID((short) 1, "安卓", true),
	/**
	 * 2, "iPhone", true
	 */
	IPHONE((short) 2, "iPhone", true),
	/**
	 * 3, "iPad", true
	 */
	IPAD((short) 3, "iPad", true),
	/**
	 * 4, "PC", false
	 */
	PC((short) 4, "PC", false),
	/**
	 * 5, "WAP", true
	 */
	WAP((short) 5, "WAP", true),
	/**
	 * 6, "WINDOWS_PHONE", true
	 */
	WINDOWS_PHONE((short) 6, "WINDOWS_PHONE", true),
	/**
	 * 7, "MANAGER_SYSTEM", true
	 */
	MANAGER_SYSTEM((short) 7, "MANAGER_SYSTEM", true),
	/**
	 * 998, "OTHER_MOBILE", true
	 */
	OTHER_MOBILE((short) 998, "OTHER_MOBILE", true),
	/**
	 * 999, "未知", false
	 */
	UNKNOWN((short) 999, "未知", false);

	private short value;
	private String msg;
	private boolean mobile;

	PlatformEnum(short value, String msg, boolean mobile) {
		this.value = value;
		this.msg = msg;
		this.mobile = mobile;
	}

	public short getValue() {
		return value;
	}

	public String getMsg() {
		return msg;
	}

	public boolean isMobile() {
		return mobile;
	}

	public static PlatformEnum getPlatformEnumByValue(short value) {
		for (PlatformEnum _Enum : PlatformEnum.values()) {
			if (_Enum.getValue() == value) {
				return _Enum;
			}
		}
		return null;
	}

}
