package hk.edu.cuhk.itm.controller;

import hk.edu.cuhk.itm.model.Regular;
import hk.edu.cuhk.itm.service.RegularService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bus")
public class RegularController{
	@Autowired
	private RegularService regularService;

	// Here the url can be "/api/bus/regular?tourCode=r1&busId=1" or "/api/bus/regular?busId=1" or "/api/bus/regular?tourCode=r1" or "/api/bus/regular"
	@RequestMapping(value = "regular", method = {RequestMethod.GET}, produces = {"application/json"})
	public List<Regular>  getRegularByTourCode(@RequestParam(name = "tourCode", required = false) String tourCode, @RequestParam(name = "busId", required = false) Integer busId) {
		if (tourCode != null && busId != null) {
			return regularService.getRegularByCompositeId(tourCode, busId);
		}
		else if (tourCode != null) {
			return regularService.getRegularByTourCode(tourCode);
		}
		else if (busId != null) {
			return regularService.getRegularByBusId(busId);
		}
		else {
			return regularService.getAllRegular();
		}
	}
}