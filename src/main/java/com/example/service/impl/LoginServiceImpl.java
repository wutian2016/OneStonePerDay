package com.example.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.LoginBean;
import com.example.dao.TUserMapper;
import com.example.model.TUser;
import com.example.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private TUserMapper tUserMapper;//依赖注入
	
	@Override
	public LoginBean loginByPassword(TUser tuser) {
		LoginBean model = new LoginBean();
		int count = tUserMapper.existsByUser(tuser);
		System.out.println("用户"+tuser.getLoginName()+"存在"+count+"条");
		if(count==0){
			model.setLogin_status(false);
			model.setLogin_msg("登录账号"+tuser.getLoginName()+"不存在!!");
			model.setUser(tuser);
			return model;
		}
		//验证密码
		String password = tuser.getPassword();
		tuser = tUserMapper.selectByTUser(tuser);

		if(!password.equals(tuser.getPassword())){
			model.setLogin_status(false);
			model.setLogin_msg("您登录错误!");	
			return model;
		}

		//tUserMapper.loginSuccess(tuser);成功登录
		tuser = tUserMapper.selectByTUser(tuser);
		System.out.println(tuser.toString());
		model.setLogin_status(true);
		model.setLogin_msg("登录成功");
		return model;
	}

}
