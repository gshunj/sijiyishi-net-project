package com.sijiyishi.beans.enums.forusersession;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/**
 * 登录状态
 * 
 * @author jgshun
 * 
 */
public enum StatusEnumForUserSession {
	/**
	 * 1 有效
	 */
	VALID((short) 1, "有效"),
	/**
	 * 0 无效
	 */
	INVALID((short) 0, "无效"),
	/**
	 * 2 被挤下线
	 */
	OFFLINE((short) 2, "被挤下线");

	private short code;
	private String msg;

	private StatusEnumForUserSession(short code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public short getCode() {
		return code;
	}

	public void setCode(short code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public static StatusEnumForUserSession getStatusEnumByCode(short code) {
		for (StatusEnumForUserSession statusEnum : StatusEnumForUserSession
				.values()) {
			if (statusEnum.getCode() == code) {
				return statusEnum;
			}
		}
		return StatusEnumForUserSession.INVALID;
	}

	@Override
	public String toString() {
		if (this != null) {
			Map<String, Object> allMap = new HashMap<String, Object>();
			allMap.put("code", this.code);
			allMap.put("msg", this.msg);

			String result = JSONObject.toJSONString(allMap);
			result = result.replaceAll("\"", "'");
			return result;
		}
		return super.toString();
	}

}
