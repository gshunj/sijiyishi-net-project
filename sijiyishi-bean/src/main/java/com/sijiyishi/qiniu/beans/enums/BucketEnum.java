/**
 * 
 */
package com.sijiyishi.qiniu.beans.enums;

/**
 * @author 作者 jgshun
 * @version 创建时间：2016-7-15 下午4:03:01 类说明
 */
public enum BucketEnum {

	/**
	 * "sijiyishi-img", "图片存储"
	 */
	IMG("sijiyishi-img", "图片存储"),
	/**
	 * "sijiyishi-audio", "音频存储"
	 */
	AUDIO("sijiyishi-audio", "音频存储"),
	/**
	 * "sijiyishi-video", "视频存储"
	 */
	VIDEO("sijiyishi-video", "视频存储");

	private String value;
	private String msg;

	private BucketEnum(String value, String msg) {
		this.value = value;
		this.msg = msg;
	}

	public String getValue() {
		return value;
	}

	public String getMsg() {
		return msg;
	}
}
