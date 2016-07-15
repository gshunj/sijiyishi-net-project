/**
 * 
 */
package com.sijiyishi.qiniu.beans.sijiyishi2qiniu.request;

import com.sijiyishi.qiniu.beans.enums.BucketEnum;

/**
 * @author 作者 jgshun
 * @version 创建时间：2016-7-15 下午2:03:32 类说明
 */
public class ListURLRequest {
	/**
	 * 指定空间 必填
	 */
	private BucketEnum bucket;
	/**
	 * 本次列举的条目数，范围为1-1000。 默认值为1000。
	 */
	private int limit = 1000;
	/**
	 * 指定前缀，只有资源名匹配该前缀的资源会被列出。 默认值为空字符串。
	 */
	private String prefix;
	/**
	 * 指定目录分隔符，列出所有公共前缀（模拟列出目录效果）。 默认值为空字符串。
	 */
	private String delimiter;
	/**
	 * 上一次列举返回的位置标记，作为本次列举的起点信息。 默认值为空字符串。
	 */
	private String marker;

	public BucketEnum getBucket() {
		return bucket;
	}

	public void setBucket(BucketEnum bucket) {
		this.bucket = bucket;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getDelimiter() {
		return delimiter;
	}

	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}

	public String getMarker() {
		return marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
	}

}
