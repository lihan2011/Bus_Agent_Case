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

//	@Override
//	public List<TourListing> findByTourCode(String tourCode) {
//		// TODO Auto-generated method stub
//		return tourListingRepository.findByTourCode(tourCode);
//	}

	@Override
	public List<TourListing> findByDestination(String destination) {
		// TODO Auto-generated method stub
		return tourListingRepository.findByDestination(destination);
	}

}
