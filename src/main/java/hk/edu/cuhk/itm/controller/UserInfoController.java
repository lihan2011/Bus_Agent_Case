/**
 * 
 */
package hk.edu.cuhk.itm.controller;

import java.util.List;

import hk.edu.cuhk.itm.model.UserInfo;
import hk.edu.cuhk.itm.service.UserInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Lee
 *
 */
@RestController
@RequestMapping("/api/bus")
public class UserInfoController {
	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping(value = "userinfo", method = {RequestMethod.GET},produces = {"application/json"})
	public List<UserInfo> getUserInfo(@RequestParam(name = "username", required = false) String userName){
		return userInfoService.findAll();
	}
}
 