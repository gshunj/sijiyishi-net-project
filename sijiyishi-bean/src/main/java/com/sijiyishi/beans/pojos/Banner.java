package com.sijiyishi.beans.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sijiyishi.beans.pojos.base.BasePo;

@Table(name = "t_banner")
public class Banner extends BasePo {
	/**
	 * 自增id
	 */
	@Id
	@GeneratedValue(generator = "JDBC")
	private Long id;

	/**
	 * 图片地址
	 */
	@Column(name = "cover_url")
	private String coverUrl;

	/**
	 * 状态(0待发布 1已发布 2下线)
	 */
	private Integer status;

	/**
	 * 创建时间
	 */
	@Column(name = "create_time")
	private Date createTime;

	/**
	 * 开始时间
	 */
	@Column(name = "start_time")
	private Date startTime;

	/**
	 * 结束时间
	 */
	@Column(name = "end_time")
	private Date endTime;

	/**
	 * 创建者
	 */
	@Column(name = "create_user")
	private Long createUser;

	/**
	 * 更新时间
	 */
	@Column(name = "update_time")
	private Date updateTime;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 跳转url
	 */
	private String url;

	/**
	 * 发布的平台 1 所有平台 2web和wap 3android和ios 4web 5 wap 6android 7ios
	 */
	private Integer platform;

	/**
	 * 获取自增id
	 * 
	 * @return id - 自增id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 设置自增id
	 * 
	 * @param id
	 *            自增id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取图片地址
	 * 
	 * @return cover_url - 图片地址
	 */
	public String getCoverUrl() {
		return coverUrl;
	}

	/**
	 * 设置图片地址
	 * 
	 * @param coverUrl
	 *            图片地址
	 */
	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}

	/**
	 * 获取状态(0待发布 1已发布 2下线)
	 * 
	 * @return status - 状态(0待发布 1已发布 2下线)
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 设置状态(0待发布 1已发布 2下线)
	 * 
	 * @param status
	 *            状态(0待发布 1已发布 2下线)
	 */
	public void setStatus(Integer status) {
		this.status = status;
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
	 * 获取开始时间
	 * 
	 * @return start_time - 开始时间
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * 设置开始时间
	 * 
	 * @param startTime
	 *            开始时间
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * 获取结束时间
	 * 
	 * @return end_time - 结束时间
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * 设置结束时间
	 * 
	 * @param endTime
	 *            结束时间
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * 获取创建者
	 * 
	 * @return create_user - 创建者
	 */
	public Long getCreateUser() {
		return createUser;
	}

	/**
	 * 设置创建者
	 * 
	 * @param createUser
	 *            创建者
	 */
	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
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
	 * 获取标题
	 * 
	 * @return title - 标题
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 设置标题
	 * 
	 * @param title
	 *            标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 获取跳转url
	 * 
	 * @return url - 跳转url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 设置跳转url
	 * 
	 * @param url
	 *            跳转url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 获取发布的平台 1 所有平台 2web和wap 3android和ios 4web 5 wap 6android 7ios
	 * 
	 * @return platform - 发布的平台 1 所有平台 2web和wap 3android和ios 4web 5 wap 6android
	 *         7ios
	 */
	public Integer getPlatform() {
		return platform;
	}

	/**
	 * 设置发布的平台 1 所有平台 2web和wap 3android和ios 4web 5 wap 6android 7ios
	 * 
	 * @param platform
	 *            发布的平台 1 所有平台 2web和wap 3android和ios 4web 5 wap 6android 7ios
	 */
	public void setPlatform(Integer platform) {
		this.platform = platform;
	}
}