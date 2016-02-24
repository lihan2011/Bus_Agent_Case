/**
 * 
 */
package hk.edu.cuhk.itm.service;

import hk.edu.cuhk.itm.model.TourListing;

import java.util.List;

/**
 * @author Lee
 *
 */
public interface TourListingService {
	List<TourListing> findAll();
	//List<TourListing> findByTourCode(String tourCode);
	List<TourListing> findByDestination(String destination);
}
