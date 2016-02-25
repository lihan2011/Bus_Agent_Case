/**
 * 
 */
package hk.edu.cuhk.itm.service;

import hk.edu.cuhk.itm.model.PrivateBooking;
import hk.edu.cuhk.itm.model.Sightseeing;

import java.util.List;

/**
 * @author Lee
 *
 */
public interface PrivateBookingService {
	List<PrivateBooking> findAll();
	List<PrivateBooking> findByTourCode(String tourCode);
}
