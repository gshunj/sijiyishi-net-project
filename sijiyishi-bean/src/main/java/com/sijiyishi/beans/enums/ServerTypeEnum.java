package com.sijiyishi.beans.enums;

/**
 * 服务程序类型
 * 
 * @author jgshun
 * 
 */
public enum ServerTypeEnum {
	/**
	 * (short) 1, "四季一时web端"
	 */
	SIJIYISHI_WEB((short) 1, "四季一时web端", true, false),
	/**
	 * (short) 1, "四季一时web端"
	 */
	SIJIYISHI_WAP((short) 2, "四季一时wap端", true, false),
	/**
	 * (short) 3, "四季一时app端"
	 */
	SIJIYISHI_APP((short) 3, "四季一时app端", true, false),
	/**
	 * (short) 4, "四季一时管理平台"
	 */
	SIJIYISHI_MANAGER((short) 4, "四季一时管理平台", false, true);

	private short value;
	private String msg;
	private boolean isSijiyishiServer;// 是否是四季一时常用程序:即面向用户的程序
	private boolean isSijiyishiManagerServer;// 是否是四季一时管理服务程序

	private ServerTypeEnum(short value, String msg, boolean isSijiyishiServer,
			boolean isSijiyishiManagerServer) {
		this.value = value;
		this.msg = msg;
		this.isSijiyishiServer = isSijiyishiServer;
		this.isSijiyishiManagerServer = isSijiyishiManagerServer;
	}

	public static ServerTypeEnum getAccessTypeEnumByValue(short value) {
		for (ServerTypeEnum _Enum : ServerTypeEnum.values()) {
			if (_Enum.getValue() == value) {
				return _Enum;
			}
		}
		return null;
	}

	public short getValue() {
		return value;
	}

	public void setValue(short value) {
		this.value = value;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isSijiyishiServer() {
		return isSijiyishiServer;
	}

	public void setSijiyishiServer(boolean isSijiyishiServer) {
		this.isSijiyishiServer = isSijiyishiServer;
	}

	public boolean isSijiyishiManagerServer() {
		return isSijiyishiManagerServer;
	}

	public void setSijiyishiManagerServer(boolean isSijiyishiManagerServer) {
		this.isSijiyishiManagerServer = isSijiyishiManagerServer;
	}

}
