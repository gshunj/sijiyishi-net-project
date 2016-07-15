package com.sijiyishi.beans.enums.forusersession;

/**
 * 登录类型
 * 
 * @author jgshun
 */
public enum TypeEnumForUserSession {
	SIJIYISHI((short) 0), QQ((short) 1), WEIBO((short) 2);

	private TypeEnumForUserSession(short value) {
		this.value = value;
	}

	private short value;

	public short getValue() {
		return value;
	}

	public static TypeEnumForUserSession getByValue(short value) {
		for (TypeEnumForUserSession item : TypeEnumForUserSession.values()) {
			if (value == item.getValue()) {
				return item;
			}
		}
		return SIJIYISHI;
	}
}
