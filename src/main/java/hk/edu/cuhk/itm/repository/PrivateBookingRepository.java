/**
 * 
 */
package hk.edu.cuhk.itm.repository;

import java.util.List;

import hk.edu.cuhk.itm.model.PrivateBooking;
import hk.edu.cuhk.itm.model.SightSeeingCompositeId;
import hk.edu.cuhk.itm.model.Sightseeing;

import org.springframework.data.repository.Repository;

/**
 * @author Lee
 *
 */
@org.springframework.stereotype.Repository
public interface PrivateBookingRepository extends Repository<PrivateBooking, SightSeeingCompositeId> {
	List<PrivateBooking> findAll();
	List<PrivateBooking> findByTourCode(String tourCode);

}
