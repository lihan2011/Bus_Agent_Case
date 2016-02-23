/**
 * 
 */
package hk.edu.cuhk.itm.service;
import hk.edu.cuhk.itm.model.Regular;
import hk.edu.cuhk.itm.model.RegularCompositeId;

import java.util.List;

/**
 * @author Lee
 *
 */
public interface RegularService {
	List<Regular> getAllRegular();
	List<Regular> getRegularByTourCode(String tourCode);
	List<Regular> getRegularByBusId(int busId);
	List<Regular> getRegularByCompositeId(String tourCode, int busId);
}
