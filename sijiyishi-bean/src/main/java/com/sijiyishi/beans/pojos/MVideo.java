package com.sijiyishi.beans.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sijiyishi.beans.pojos.base.BasePo;

@Table(name = "m_video")
public class MVideo extends BasePo {
	/**
	 * 主键id
	 */
	@Id
	@GeneratedValue(generator = "JDBC")
	private Long id;

	/**
	 * 视频标题
	 */
	private String title;

	/**
	 * 播放地址key
	 */
	@Column(name = "v_key")
	private String vKey;

	/**
	 * 创建时间
	 */
	@Column(name = "create_time")
	private Date createTime;

	/**
	 * 更新时间
	 */
	@Column(name = "update_time")
	private Date updateTime;

	/**
	 * 封面地址
	 */
	@Column(name = "cover_url")
	private String coverUrl;

	/**
	 * 获取主键id
	 * 
	 * @return id - 主键id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 设置主键id
	 * 
	 * @param id
	 *            主键id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取视频标题
	 * 
	 * @return title - 视频标题
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 设置视频标题
	 * 
	 * @param title
	 *            视频标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 获取播放地址key
	 * 
	 * @return v_key - 播放地址key
	 */
	public String getvKey() {
		return vKey;
	}

	/**
	 * 设置播放地址key
	 * 
	 * @param vKey
	 *            播放地址key
	 */
	public void setvKey(String vKey) {
		this.vKey = vKey;
	}

	/**
	 * 获取创建时间
	 * 
	 * @return create_time - 创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置创建时间
	 * 
	 * @param createTime
	 *            创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 获取更新时间
	 * 
	 * @return update_time - 更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 设置更新时间
	 * 
	 * @param updateTime
	 *            更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 获取封面地址
	 * 
	 * @return cover_url - 封面地址
	 */
	public String getCoverUrl() {
		return coverUrl;
	}

	/**
	 * 设置封面地址
	 * 
	 * @param coverUrl
	 *            封面地址
	 */
	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}
}