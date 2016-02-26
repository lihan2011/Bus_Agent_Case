/**
 * 
 */
package hk.edu.cuhk.itm.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import hk.edu.cuhk.itm.model.UserInfo;
import hk.edu.cuhk.itm.service.UserInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
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
	
	@RequestMapping(value = "adduserinfo" , method = {RequestMethod.POST})
	public UserInfo addUserInfo(@RequestBody UserInfo userInfo){

//		System.out.println(userInfo.getUserName());
//		System.out.println(userInfo.getEmail());
//		System.out.println(userInfo.getPassWord());
//		System.out.println(userInfo.getTelephone());
//		System.out.println(userInfo.getGender());
		if(userInfoService.exists(userInfo.getUserName()))
		{
			System.out.println("username already used");
			return null;
		}
		else if(userInfo.getUserName()!=null)
			return userInfoService.save(userInfo);
		else return null;	
	}
	
	@RequestMapping(value = "login", method = {RequestMethod.GET})
	public boolean loginUserInfo(@RequestParam(name = "userName", required = true) String username,@RequestParam(name = "passWord", required = true) String password){
		UserInfo loginUser = null;
		loginUser = userInfoService.findOne(username);
		System.out.println(loginUser.getUserName());
		System.out.println(loginUser.getPassWord());
		System.out.println("req"+password);
		if(loginUser.getPassWord()==(password)) System.out.println("xiang deng");
		if(loginUser==null) return false;
		else if(loginUser.getPassWord().equals(password))
		{
			System.out.println("equals");
			return true;
		}
		return false;
			
	}
}
 