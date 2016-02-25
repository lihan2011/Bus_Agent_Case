/**
 * 
 */
package hk.edu.cuhk.itm.controller;

import hk.edu.cuhk.itm.model.Sightseeing;
import hk.edu.cuhk.itm.service.SightseeingService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Lee
 *
 */
@RestController
@RequestMapping("/api/bus")
public class SightseeingController {
	@Autowired
	private SightseeingService sightseeingService;
	
	@RequestMapping(value = "sightseeing", method = {RequestMethod.GET}, produces = {"application/json"})
	public List<Sightseeing>  getSightseeing(@RequestParam(name = "tourCode", required = false) String tourCode, @RequestParam(name = "returnDate", required = false) String  returndate) {
		final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate returnDate = null;
		if(returndate != null) returnDate = LocalDate.parse(returndate,DATE_FORMAT);
		
		
//		if(returnDate!= null && tourCode !=null) return sightseeingService.findByTourCodeAndReturnDate(tourCode, returnDate);
//		else if(returnDate!=null) return sightseeingService.findByReturnDate(returnDate);
//		else if(tourCode!=null) return sightseeingService.findByTourCode(tourCode);
//		else return sightseeingService.findAll();
		if(tourCode!=null) return sightseeingService.findByTourCode(tourCode);
		 return sightseeingService.findAll();
	}

}
