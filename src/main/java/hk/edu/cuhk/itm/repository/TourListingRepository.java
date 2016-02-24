/**
 * 
 */
package hk.edu.cuhk.itm.repository;

import java.util.List;
import hk.edu.cuhk.itm.model.TourListing;
import org.springframework.data.repository.Repository;
/**
 * @author Lee
 *
 */

@org.springframework.stereotype.Repository
public interface TourListingRepository  extends Repository<TourListing,String>{
	List<TourListing> findAll();
	//List<TourListing> findByTourCode(String tourCode);
	List<TourListing> findByDestination(String destination);
	//List<TourListing> findByDepartDateAndDepartTime();

}
