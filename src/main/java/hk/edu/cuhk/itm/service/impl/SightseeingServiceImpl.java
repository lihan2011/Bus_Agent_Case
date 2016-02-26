/**
 * 
 */
package hk.edu.cuhk.itm.service.impl;

import java.util.List;

import hk.edu.cuhk.itm.model.Sightseeing;
import hk.edu.cuhk.itm.repository.SightseeingRepository;
import hk.edu.cuhk.itm.service.SightseeingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;
/**
 * @author Lee
 *
 */
@Service
@Transactional
public class SightseeingServiceImpl implements SightseeingService {

	@Autowired
	private SightseeingRepository sightseeingRepository;

	public List<Sightseeing> findAll() {
		// TODO Auto-generated method stub
		return sightseeingRepository.findAll();
	}



	public List<Sightseeing> findByTourCode(String tourCode) {
		// TODO Auto-generated method stub
		return sightseeingRepository.findByTourCode(tourCode);
	}



	public List<Sightseeing> findByReturnDate(LocalDate returnDate) {
		// TODO Auto-generated method stub
		return sightseeingRepository.findByReturnDate(returnDate);
	}



	public List<Sightseeing> findByTourCodeAndReturnDate(String tourCode,LocalDate returnDate) {
		// TODO Auto-generated method stub
		return sightseeingRepository.findByTourCodeAndReturnDate(tourCode, returnDate);
	}








}
