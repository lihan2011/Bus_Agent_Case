/**
 * 
 */
package hk.edu.cuhk.itm.service;

import hk.edu.cuhk.itm.model.UserInfo;

import java.util.List;

/**
 * @author Lee
 *
 */
public interface UserInfoService {
	List<UserInfo> findAll();
	List<UserInfo> findByuserName(String userName);
	UserInfo save(UserInfo userInfo);
	boolean exists(String userName);
	UserInfo findOne(String userName);
}
