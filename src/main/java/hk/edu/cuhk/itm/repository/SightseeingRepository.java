/**
 * 
 */
package hk.edu.cuhk.itm.repository;


import hk.edu.cuhk.itm.model.SightSeeingCompositeId;
import hk.edu.cuhk.itm.model.Sightseeing;
import hk.edu.cuhk.itm.model.TourCodeDateCompositeKey;

import java.util.List;

import org.springframework.data.repository.Repository;
import java.time.LocalDate;

/**
 * @author Lee
 *
 */
@org.springframework.stereotype.Repository
public interface SightseeingRepository extends Repository<Sightseeing,SightSeeingCompositeId>{
	List<Sightseeing> findAll();
	List<Sightseeing> findByTourCode(String tourCode);
	//List<Sightseeing> findByReturnDate(LocalDate returnDate);
	//List<Sightseeing> findByTourCodeAndReturnDate(String tourCode, LocalDate returnDate);
}
