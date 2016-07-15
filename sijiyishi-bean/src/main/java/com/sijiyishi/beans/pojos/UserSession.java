package com.sijiyishi.beans.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sijiyishi.beans.pojos.base.BasePo;

@Table(name = "t_user_session")
public class UserSession extends BasePo {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6164560006314918666L;
	public static final String FIELD_ID = "id";
	public static final String FIELD_SECRET_KEY = "secretKey";
	public static final String FIELD_UID = "uid";
	public static final String FIELD_TOKEN = "token";
	public static final String FIELD_PLATFORM = "platform";
	public static final String FIELD_TYPE = "type";
	public static final String FIELD_TIME = "time";
	public static final String FIELD_UPDATETIME = "updateTime";
	public static final String FIELD_IP = "ip";
	public static final String FIELD_UA = "ua";
	public static final String FIELD_USERID = "userId";
	public static final String FIELD_DEVICEID = "deviceId";
	public static final String FIELD_CREDENTIALSTOLOG = "credentialsToLog";
	public static final String FIELD_VALIDMINUTE = "validMinute";
	public static final String FIELD_OFFLINEMSG = "offlineMsg";
	public static final String FIELD_OFFLINEMSGMINUTE = "offlineMsgMinute";
	public static final String FIELD_STATUS = "status";
	public static final String FIELD_SIGN = "sign";

	public static final String COLUMN_ID = "id";
	public static final String COLUMN_SECRET_KEY = "secret_key";
	public static final String COLUMN_UID = "uid";
	public static final String COLUMN_TOKEN = "token";
	public static final String COLUMN_PLATFORM = "platform";
	public static final String COLUMN_TYPE = "type";
	public static final String COLUMN_TIME = "time";
	public static final String COLUMN_UPDATE_TIME = "update_time";
	public static final String COLUMN_IP = "ip";
	public static final String COLUMN_UA = "ua";
	public static final String COLUMN_USER_ID = "user_id";
	public static final String COLUMN_DEVICE_ID = "device_id";
	public static final String COLUMN_CREDENTIALS_TO_LOG = "credentials_to_log";
	public static final String COLUMN_VALID_MINUTE = "valid_minute";
	public static final String COLUMN_OFFLINE_MSG = "offline_msg";
	public static final String COLUMN_OFFLINE_MSG_MINUTE = "offline_msg_minute";
	public static final String COLUMN_STATUS = "status";
	public static final String COLUMN_SIGN = "sign";

	public static final String ORDER_BY_ID_DESC = " id desc ";

	/**
	 * 主键
	 */
	@Id
	@GeneratedValue(generator = "JDBC")
	private Long id;

	private String sign;

	/**
	 * 加密key
	 */
	@Column(name = "secret_key")
	private String secretKey;

	/**
	 * 登录序列
	 */
	private String uid;

	/**
	 * 登录令牌
	 */
	private String token;

	/**
	 * 登录平台
	 */
	private Short platform;

	/**
	 * 登录类型
	 */
	private Short type;

	/**
	 * 登录时间
	 */
	private Date time;

	/**
	 * 登录刷新时间
	 */
	@Column(name = "update_time")
	private Date updateTime;

	/**
	 * 登录ip
	 */
	private String ip;

	/**
	 * 登录浏览器ua
	 */
	private String ua;

	/**
	 * 登录用户id
	 */
	@Column(name = "user_id")
	private Integer userId;

	/**
	 * 设备id
	 */
	@Column(name = "device_id")
	private String deviceId;

	/**
	 * 免登陆凭证
	 */
	@Column(name = "credentials_to_log")
	private String credentialsToLog;

	/**
	 * 有效时间 分钟
	 */
	@Column(name = "valid_minute")
	private Integer validMinute;

	/**
	 * 被挤下线时间
	 */
	@Column(name = "offline_time")
	private Date offlineTime;

	public Short getPlatform() {
		return platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	/**
	 * 被挤下线提示
	 */
	@Column(name = "offline_msg")
	private String offlineMsg;

	/**
	 * 下线提示保留时间
	 */
	@Column(name = "offline_msg_minute")
	private Integer offlineMsgMinute;

	/**
	 * 状态 1正常 0无效 2在别的设备上登录
	 */
	private Integer status;

	/**
	 * 获取主键
	 * 
	 * @return id - 主键
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 设置主键
	 * 
	 * @param id
	 *            主键
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取登录序列
	 * 
	 * @return uid - 登录序列
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * 设置登录序列
	 * 
	 * @param uid
	 *            登录序列
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * 获取登录令牌
	 * 
	 * @return token - 登录令牌
	 */
	public String getToken() {
		return token;
	}

	/**
	 * 设置登录令牌
	 * 
	 * @param token
	 *            登录令牌
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * 获取登录时间
	 * 
	 * @return time - 登录时间
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * 设置登录时间
	 * 
	 * @param time
	 *            登录时间
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * 获取登录刷新时间
	 * 
	 * @return update_time - 登录刷新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 设置登录刷新时间
	 * 
	 * @param updateTime
	 *            登录刷新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 获取登录ip
	 * 
	 * @return ip - 登录ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * 设置登录ip
	 * 
	 * @param ip
	 *            登录ip
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * 获取登录浏览器ua
	 * 
	 * @return ua - 登录浏览器ua
	 */
	public String getUa() {
		return ua;
	}

	/**
	 * 设置登录浏览器ua
	 * 
	 * @param ua
	 *            登录浏览器ua
	 */
	public void setUa(String ua) {
		this.ua = ua;
	}

	/**
	 * 获取登录用户id
	 * 
	 * @return userId - 登录用户id
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * 设置登录用户id
	 * 
	 * @param userid
	 *            登录用户id
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * 获取设备id
	 * 
	 * @return device_id - 设备id
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * 设置设备id
	 * 
	 * @param deviceId
	 *            设备id
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * 获取免登陆凭证
	 * 
	 * @return credentials_to_log - 免登陆凭证
	 */
	public String getCredentialsToLog() {
		return credentialsToLog;
	}

	/**
	 * 设置免登陆凭证
	 * 
	 * @param credentialsToLog
	 *            免登陆凭证
	 */
	public void setCredentialsToLog(String credentialsToLog) {
		this.credentialsToLog = credentialsToLog;
	}

	/**
	 * 获取有效时间 分钟
	 * 
	 * @return valid_minute - 有效时间 分钟
	 */
	public Integer getValidMinute() {
		return validMinute;
	}

	/**
	 * 设置有效时间 分钟
	 * 
	 * @param validMinute
	 *            有效时间 分钟
	 */
	public void setValidMinute(Integer validMinute) {
		this.validMinute = validMinute;
	}

	/**
	 * 获取被挤下线提示
	 * 
	 * @return offline_msg - 被挤下线提示
	 */
	public String getOfflineMsg() {
		return offlineMsg;
	}

	/**
	 * 设置被挤下线提示
	 * 
	 * @param offlineMsg
	 *            被挤下线提示
	 */
	public void setOfflineMsg(String offlineMsg) {
		this.offlineMsg = offlineMsg;
	}

	/**
	 * 获取下线提示保留时间
	 * 
	 * @return offline_msg_minute - 下线提示保留时间
	 */
	public Integer getOfflineMsgMinute() {
		return offlineMsgMinute;
	}

	/**
	 * 设置下线提示保留时间
	 * 
	 * @param offlineMsgMinute
	 *            下线提示保留时间
	 */
	public void setOfflineMsgMinute(Integer offlineMsgMinute) {
		this.offlineMsgMinute = offlineMsgMinute;
	}

	/**
	 * 获取状态 1正常 0无效 2在别的设备上登录
	 * 
	 * @return status - 状态 1正常 0无效 2在别的设备上登录
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 设置状态 1正常 0无效 2在别的设备上登录
	 * 
	 * @param status
	 *            状态 1正常 0无效 2在别的设备上登录
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the offlineTime
	 */
	public Date getOfflineTime() {
		return offlineTime;
	}

	/**
	 * @param offlineTime
	 *            the offlineTime to set
	 */
	public void setOfflineTime(Date offlineTime) {
		this.offlineTime = offlineTime;
	}

	/**
	 * @return the secretKey
	 */
	public String getSecretKey() {
		return secretKey;
	}

	/**
	 * @param secretKey
	 *            the secretKey to set
	 */
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	/**
	 * @return the sign
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * @param sign
	 *            the sign to set
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}
}