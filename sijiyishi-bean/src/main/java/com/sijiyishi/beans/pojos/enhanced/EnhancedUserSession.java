package com.sijiyishi.beans.pojos.enhanced;

import java.util.Date;

import javax.persistence.Table;

import com.sijiyishi.beans.enums.PlatformEnum;
import com.sijiyishi.beans.enums.forusersession.StatusEnumForUserSession;
import com.sijiyishi.beans.enums.forusersession.TypeEnumForUserSession;
import com.sijiyishi.beans.pojos.UserSession;
import com.sijiyishi.beans.pojos.enhanced.base.BaseEnhanced;

@Table(name = "t_user_session")
public class EnhancedUserSession extends BaseEnhanced {
	public EnhancedUserSession(UserSession userSession) {
		this.credentialsToLog = userSession.getCredentialsToLog();
		this.deviceId = userSession.getDeviceId();
		if (userSession.getUserId() != null) {
			EnhancedUser _EnhancedUser = new EnhancedUser();
			_EnhancedUser.setId(userSession.getUserId());
			this.enhancedUser = _EnhancedUser;
		}
		if (userSession.getId() != null) {
			this.id = userSession.getId();
		}
		this.ip = userSession.getIp();
		this.setSecretKey(userSession.getSecretKey());
		this.offlineMsg = userSession.getOfflineMsg();
		if (userSession.getOfflineMsgMinute() != null) {
			this.offlineMsgMinute = userSession.getOfflineMsgMinute();
		}
		if (userSession.getPlatform() != null) {
			this.platform = PlatformEnum.getPlatformEnumByValue(userSession
					.getPlatform());
		}
		if (userSession.getStatus() != null) {
			this.status = StatusEnumForUserSession
					.getStatusEnumByCode(userSession.getStatus().shortValue());
		}

		this.time = userSession.getTime();
		this.token = userSession.getToken();
		if (userSession.getType() != null) {
			this.type = TypeEnumForUserSession.getByValue(userSession.getType()
					.shortValue());
		}

		this.ua = userSession.getUa();
		this.uid = userSession.getUid();
		this.updateTime = userSession.getUpdateTime();

		if (userSession.getValidMinute() != null) {
			this.validMinute = userSession.getValidMinute();
		}
		this.offlineTime = userSession.getOfflineTime();
		this.sign = userSession.getSign();
	}

	public EnhancedUserSession() {
		super();
	}

	private long id;
	private String sign;
	private String secretKey;
	private String uid;
	private String token;
	private PlatformEnum platform;
	private TypeEnumForUserSession type;
	private Date time;
	private Date updateTime;
	private String ip;
	private String ua;
	private EnhancedUser enhancedUser;
	private String deviceId;
	private String credentialsToLog;
	private int validMinute;
	private String offlineMsg;
	private int offlineMsgMinute;
	private StatusEnumForUserSession status;
	private Date offlineTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public PlatformEnum getPlatform() {
		return platform;
	}

	public void setPlatform(PlatformEnum platform) {
		this.platform = platform;
	}

	public TypeEnumForUserSession getType() {
		return type;
	}

	public void setType(TypeEnumForUserSession type) {
		this.type = type;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getUa() {
		return ua;
	}

	public void setUa(String ua) {
		this.ua = ua;
	}

	public EnhancedUser getEnhancedUser() {
		return enhancedUser;
	}

	public void setEnhancedUser(EnhancedUser enhancedUser) {
		this.enhancedUser = enhancedUser;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getCredentialsToLog() {
		return credentialsToLog;
	}

	public void setCredentialsToLog(String credentialsToLog) {
		this.credentialsToLog = credentialsToLog;
	}

	public int getValidMinute() {
		return validMinute;
	}

	public void setValidMinute(int validMinute) {
		this.validMinute = validMinute;
	}

	public String getOfflineMsg() {
		return offlineMsg;
	}

	public void setOfflineMsg(String offlineMsg) {
		this.offlineMsg = offlineMsg;
	}

	public int getOfflineMsgMinute() {
		return offlineMsgMinute;
	}

	public void setOfflineMsgMinute(int offlineMsgMinute) {
		this.offlineMsgMinute = offlineMsgMinute;
	}

	public StatusEnumForUserSession getStatus() {
		return status;
	}

	public void setStatus(StatusEnumForUserSession status) {
		this.status = status;
	}

	public Date getOfflineTime() {
		return offlineTime;
	}

	public void setOfflineTime(Date offlineTime) {
		this.offlineTime = offlineTime;
	}

}