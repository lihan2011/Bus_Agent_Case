/**
 * 
 */
package hk.edu.cuhk.itm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import hk.edu.cuhk.itm.model.TourListing;
import hk.edu.cuhk.itm.service.TourListingService;

import java.util.List;

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
	public List<TourListing> getTourListing(@RequestParam(name = "destination", required = false) String destination){
		if(destination != null){
			return tourListingService.findByDestination(destination);
		}
		else {
			return tourListingService.findAll();
		}
	}
}

