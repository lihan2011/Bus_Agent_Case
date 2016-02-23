/**
 * 
 */
package hk.edu.cuhk.itm.service;
import hk.edu.cuhk.itm.model.Regular;

import java.util.List;

/**
 * @author Lee
 *
 */
public interface RegularService {
	List<Regular> getAllRegular();
	List<Regular> getRegularByTourCode(int tourcode);

}
