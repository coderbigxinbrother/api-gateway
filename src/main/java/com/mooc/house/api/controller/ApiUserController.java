/**
 * 
 */
package com.mooc.house.api.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mooc.house.api.common.RestResponse;
import com.mooc.house.api.service.UserSerive;

/**
 * @author eri
 *
 */

@RestController
public class ApiUserController {
	
	
//  private static Logger logger = LoggerFactory.getLogger(UserController.class);
   
  @Autowired
  private UserSerive userSerive;
  
  @RequestMapping("test/getusername")
  public RestResponse<String> getUsername(Long id){
	  
//	  String string = userSerive.getusername(id);
	  

	  return RestResponse.success(userSerive.getusername(id));
  }
 
}
