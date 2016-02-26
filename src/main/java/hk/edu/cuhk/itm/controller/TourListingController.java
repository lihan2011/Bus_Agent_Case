/**
 * 
 */
package hk.edu.cuhk.itm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import hk.edu.cuhk.itm.model.TourListing;
import hk.edu.cuhk.itm.service.TourListingService;

import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Lee
 *
 */
@RestController
@RequestMapping("/api/bus")
public class TourListingController {
	@Autowired
	private TourListingService tourListingService;
	
	
	@RequestMapping(value = "tourlisting", method = {RequestMethod.GET},produces = {"application/json"})
	public List<TourListing> getTourListing(@RequestParam(name = "destination", required = false) String destination,@RequestParam(name = "departdate", required = false) String departdate){
		final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate departDate = null;
		if(departdate != null) 
		{
			try{
				departDate = LocalDate.parse(departdate,DATE_FORMAT);
			}	
			catch (java.time.format.DateTimeParseException e) {
				// TODO: handle exception
				departDate = null;
			}
		}
		//System.out.println("length: "+destination.length());
		if(destination == null||destination.isEmpty()) destination = null;
		
		if(destination != null&&departDate != null){
			return tourListingService.findByDestinationAndDepartDate(destination, departDate);
		}
		else if(destination !=null){
			return tourListingService.findByDestination(destination);
		}
		else if(departDate != null){
			return tourListingService.findByDepartDate(departDate);
		}
		else {
			return tourListingService.findAll();
		}
	}
}

