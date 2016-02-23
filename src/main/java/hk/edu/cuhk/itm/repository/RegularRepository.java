/**
 * 
 */
package hk.edu.cuhk.itm.repository;

import java.util.List;

import hk.edu.cuhk.itm.model.Regular;

import org.springframework.data.repository.Repository;



/**
 * @author Lee
 *
 */
@org.springframework.stereotype.Repository
public interface RegularRepository extends Repository<Regular,Integer>{
	List<Regular> findAll();
	List<Regular> findByTourCode(int tourcode);

}
