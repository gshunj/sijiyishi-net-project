package com.sijiyishi.beans.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sijiyishi.beans.pojos.base.BasePo;

@Table(name = "t_group")
public class Group extends BasePo {
	/**
	 * 主键id
	 */
	@Id
	private Long id;

	/**
	 * 用户组类型
	 */
	private Integer type;

	/**
	 * 创建时间
	 */
	@Column(name = "create_time")
	private Date createTime;

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
	 * 获取用户组类型
	 * 
	 * @return type - 用户组类型
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * 设置用户组类型
	 * 
	 * @param type
	 *            用户组类型
	 */
	public void setType(Integer type) {
		this.type = type;
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
}