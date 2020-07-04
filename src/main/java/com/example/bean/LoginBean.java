package com.example.bean;

import com.example.model.TUser;

public class LoginBean {
	/**
	 * 登录用户名
	 */
	private String j_username;
	/**
	 * 登录密码
	 */
	private String j_password;
	
	/**
	 * 页面验证码
	 */
	private String webauthcode;
	
	/**
	 * 对应用户
	 */
	private TUser user;
	
	/**
	 * 手机短信验证码登录时填写的手机号码
	 */
	private String mobile;
	/**
	 * 短信验证码
	 */
	private String smsauthcode;
	
	
	/**
	 * 登录结果
	 */
	private boolean login_status;
	/**
	 * 登录消息
	 */
	private String login_msg;
	public String getJ_username() {
		return j_username;
	}
	public void setJ_username(String j_username) {
		this.j_username = j_username;
	}
	public String getJ_password() {
		return j_password;
	}
	public void setJ_password(String j_password) {
		this.j_password = j_password;
	}
	public String getWebauthcode() {
		return webauthcode;
	}
	public void setWebauthcode(String webauthcode) {
		this.webauthcode = webauthcode;
	}
	public TUser getUser() {
		return user;
	}
	public void setUser(TUser user) {
		this.user = user;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getSmsauthcode() {
		return smsauthcode;
	}
	public void setSmsauthcode(String smsauthcode) {
		this.smsauthcode = smsauthcode;
	}
	public boolean isLogin_status() {
		return login_status;
	}
	public void setLogin_status(boolean login_status) {
		this.login_status = login_status;
	}
	public String getLogin_msg() {
		return login_msg;
	}
	public void setLogin_msg(String login_msg) {
		this.login_msg = login_msg;
	}

}
