/**
 * 
 */
package hk.edu.cuhk.itm.repository;

import java.util.List;

import hk.edu.cuhk.itm.model.Regular;

import hk.edu.cuhk.itm.model.RegularCompositeId;
import org.springframework.data.repository.Repository;



/**
 * @author Lee
 *
 */
@org.springframework.stereotype.Repository
public interface RegularRepository extends Repository<Regular, RegularCompositeId>{
	List<Regular> findAll();
	List<Regular> findByTourCode(String tourCode);
	List<Regular> findByBusId(int busId);
	List<Regular> findByTourCodeAndBusId(String tourCode, int busId);
}
