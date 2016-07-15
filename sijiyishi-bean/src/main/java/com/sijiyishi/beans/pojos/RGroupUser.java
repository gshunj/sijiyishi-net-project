package com.sijiyishi.beans.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sijiyishi.beans.pojos.base.BasePo;

@Table(name = "r_group_user")
public class RGroupUser extends BasePo {
	/**
	 * 主键id
	 */
	@Id
	@GeneratedValue(generator = "JDBC")
	private Long id;

	/**
	 * 用户id
	 */
	@Column(name = "user_id")
	private Long userId;

	/**
	 * 创建时间
	 */
	@Column(name = "create_time")
	private Date createTime;

	/**
	 * 用户组id
	 */
	@Column(name = "group_id")
	private Long groupId;

	/**
	 * 更新时间
	 */
	@Column(name = "update_time")
	private Date updateTime;

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
	 * 获取用户id
	 * 
	 * @return user_id - 用户id
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * 设置用户id
	 * 
	 * @param userId
	 *            用户id
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
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
	 * 获取用户组id
	 * 
	 * @return group_id - 用户组id
	 */
	public Long getGroupId() {
		return groupId;
	}

	/**
	 * 设置用户组id
	 * 
	 * @param groupId
	 *            用户组id
	 */
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
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
}