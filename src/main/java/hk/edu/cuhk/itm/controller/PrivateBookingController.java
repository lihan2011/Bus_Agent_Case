/**
 * 
 */
package hk.edu.cuhk.itm.controller;

import hk.edu.cuhk.itm.model.PrivateBooking;
import hk.edu.cuhk.itm.model.Sightseeing;
import hk.edu.cuhk.itm.service.PrivateBookingService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lee
 *
 */
@RestController
@RequestMapping("/api/bus")
public class PrivateBookingController {
	
	@Autowired
	private PrivateBookingService privateBookingService; 
	
	@RequestMapping(value = "private", method = {RequestMethod.GET}, produces = {"application/json"})
	public List<PrivateBooking>  getPrivateBooking(@RequestParam(name = "tourCode", required = false) String tourCode){
		if(tourCode!=null) return privateBookingService.findByTourCode(tourCode);
		 return privateBookingService.findAll();
	}

}
