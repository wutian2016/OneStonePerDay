package com.example.service;

import com.example.bean.LoginBean;
import com.example.model.TUser;


public interface LoginService {
	LoginBean loginByPassword(TUser user);
}
