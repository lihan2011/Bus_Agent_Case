/**
 * 
 */
package hk.edu.cuhk.itm.repository;

import java.util.List;


import hk.edu.cuhk.itm.model.TourListing;
import org.springframework.data.repository.Repository;
import java.time.LocalDate;
/**
 * @author Lee
 *
 */

@org.springframework.stereotype.Repository
public interface TourListingRepository  extends Repository<TourListing,String>{
	List<TourListing> findAll();
	//List<TourListing> findByTourCode(String tourCode);
	List<TourListing> findByDestination(String destination);
	List<TourListing> findByDepartDate(LocalDate departDate);
	List<TourListing> findByDestinationAndDepartDate(String destination, LocalDate departDate);
}
