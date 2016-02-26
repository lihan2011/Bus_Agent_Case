/**
 * 
 */
package hk.edu.cuhk.itm.service.impl;

import java.util.List;

import hk.edu.cuhk.itm.model.UserInfo;
import hk.edu.cuhk.itm.repository.UserInfoRepository;
import hk.edu.cuhk.itm.service.UserInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Lee
 *
 */
@Service
@Transactional
public class UserInfoServiceImpl  implements UserInfoService{
	@Autowired
	private UserInfoRepository userInfoRepository;

	public List<UserInfo> findAll() {
		// TODO Auto-generated method stub
		return userInfoRepository.findAll();
	}

	public List<UserInfo> findByuserName(String userName) {
		// TODO Auto-generated method stub
		return userInfoRepository.findByuserName(userName);
	}

	public UserInfo save(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userInfoRepository.save(userInfo);
	}

	public boolean exists(String userName) {
		// TODO Auto-generated method stub
		return userInfoRepository.exists(userName);
	}

	public UserInfo findOne(String userName) {
		// TODO Auto-generated method stub
		return userInfoRepository.findOne(userName);
	}
	

}
