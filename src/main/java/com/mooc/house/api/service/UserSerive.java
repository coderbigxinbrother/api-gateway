package com.mooc.house.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mooc.house.api.dao.ApiUserDao;

@Service
public class UserSerive {

	@Autowired
	private ApiUserDao userDao;
	
	public String getusername(Long id){
		
		String getusername = userDao.getusername(id);
		
		return getusername;
	}
	
}
