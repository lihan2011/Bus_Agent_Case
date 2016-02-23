/**
 * 
 */
package hk.edu.cuhk.itm.service.impl;

import java.util.List;

import hk.edu.cuhk.itm.model.Regular;
import hk.edu.cuhk.itm.model.RegularCompositeId;
import hk.edu.cuhk.itm.repository.RegularRepository;
import hk.edu.cuhk.itm.service.RegularService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Lee
 *
 */
@Service
@Transactional
public class RegularServiceImpl implements RegularService{
	
	@Autowired
	private RegularRepository regularRepository;

	/* (non-Javadoc)
	 * @see hk.edu.cuhk.itm.service.RegularService#getAllRegular()
	 */
	@Override
	public List<Regular> getAllRegular() {
		// TODO Auto-generated method stub
		return regularRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see hk.edu.cuhk.itm.service.RegularService#getRegularByDestination(java.lang.String)
	 */
	@Override
	public List<Regular> getRegularByTourCode(String tourCode) {
		// TODO Auto-generated method stub
		return regularRepository.findByTourCode(tourCode);
	}

	@Override
	public List<Regular> getRegularByBusId(int busId) {
		return regularRepository.findByBusId(busId);
	}

	@Override
	public List<Regular> getRegularByCompositeId(String tourCode, int busId) {
		return regularRepository.findByTourCodeAndBusId(tourCode, busId);
	}


}
