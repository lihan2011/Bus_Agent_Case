/**
 * 
 */
package hk.edu.cuhk.itm.service.impl;

import java.util.List;

import hk.edu.cuhk.itm.model.PrivateBooking;
import hk.edu.cuhk.itm.repository.PrivateBookingRepository;
import hk.edu.cuhk.itm.service.PrivateBookingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Lee
 *
 */
@Service
@Transactional
public class PrivateBookingServiceImpl implements PrivateBookingService {

	@Autowired
	private PrivateBookingRepository privateBookingRepository;
	
	public List<PrivateBooking> findAll() {
		// TODO Auto-generated method stub
		return privateBookingRepository.findAll();
	}

	public List<PrivateBooking> findByTourCode(String tourCode) {
		// TODO Auto-generated method stub
		return privateBookingRepository.findByTourCode(tourCode);
	}

}
