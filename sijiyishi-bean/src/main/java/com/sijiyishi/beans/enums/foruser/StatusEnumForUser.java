package com.sijiyishi.beans.enums.foruser;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/**
 * 用户状态
 * 
 * @author jgshun
 * 
 */
public enum StatusEnumForUser {
	/**
	 * 1 有效
	 */
	VALID((short) 1, "正常"),
	/**
	 * 0 无效
	 */
	INVALID((short) 0, "无效"),
	/**
	 * 2 锁定
	 */
	LOCKED((short) 2, "锁定");

	private short code;
	private String msg;

	private StatusEnumForUser(short code, String msg) {
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

	public static StatusEnumForUser getStatusEnumByCode(short code) {
		for (StatusEnumForUser statusEnum : StatusEnumForUser.values()) {
			if (statusEnum.getCode() == code) {
				return statusEnum;
			}
		}
		return StatusEnumForUser.INVALID;
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
