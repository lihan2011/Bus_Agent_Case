/**
 * 
 */
package hk.edu.cuhk.itm.repository;

import hk.edu.cuhk.itm.model.UserInfo;

import java.util.List;

import org.springframework.data.repository.Repository;

/**
 * @author Lee
 *
 */
@org.springframework.stereotype.Repository
public interface UserInfoRepository extends Repository<UserInfo, String>{
	List<UserInfo> findAll();
	List<UserInfo> findByuserName(String userName);
	UserInfo save(UserInfo userInfo);
	boolean exists(String userName);
	UserInfo findOne(String userName);
}
