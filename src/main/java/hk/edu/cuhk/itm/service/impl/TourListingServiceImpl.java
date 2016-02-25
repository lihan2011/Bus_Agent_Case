/**
 * 
 */
package hk.edu.cuhk.itm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hk.edu.cuhk.itm.model.TourListing;
import hk.edu.cuhk.itm.repository.TourListingRepository;
import java.time.LocalDate;
import hk.edu.cuhk.itm.service.TourListingService;

/**
 * @author Lee
 *
 */
@Service
@Transactional
public class TourListingServiceImpl implements TourListingService{
	
	@Autowired
	private TourListingRepository tourListingRepository;

	@Override
	public List<TourListing> findAll() {
		// TODO Auto-generated method stub
		return tourListingRepository.findAll();
	}



	@Override
	public List<TourListing> findByDestination(String destination) {
		// TODO Auto-generated method stub
		return tourListingRepository.findByDestination(destination);
	}



	public List<TourListing> findByDepartDate(LocalDate departDate) {
		// TODO Auto-generated method stub
		return tourListingRepository.findByDepartDate(departDate);
	}



	



	public List<TourListing> findByDestinationAndDepartDate(String destination,LocalDate departDate) {
		// TODO Auto-generated method stub
		return tourListingRepository.findByDestinationAndDepartDate(destination, departDate);
	}

}
