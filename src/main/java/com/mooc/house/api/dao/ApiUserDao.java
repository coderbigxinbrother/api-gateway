package com.mooc.house.api.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import com.mooc.house.api.common.RestResponse;
import com.mooc.house.api.config.GenericRest;

@Repository
public class ApiUserDao {

	@Autowired
	private GenericRest rest;

	public String getusername(Long id) {

		String url = "http://user/getusername?id=" + id;

		RestResponse<String> body = rest.get(url, new ParameterizedTypeReference<RestResponse<String>>() {
		}).getBody();
		return body.getResult();
	}

}
