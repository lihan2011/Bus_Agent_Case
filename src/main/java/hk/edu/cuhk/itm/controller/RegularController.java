package hk.edu.cuhk.itm.controller;

import hk.edu.cuhk.itm.model.Regular;
import hk.edu.cuhk.itm.service.RegularService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/bus")
public class RegularController{
	@Autowired
	private RegularService regularService;
	
	@RequestMapping(value = "Regular", method = {RequestMethod.GET}, produces = {"application/json"})
	public List<Regular>  getAllRegular(){
		return regularService.getAllRegular();
	}
	

	@RequestMapping(value = "Regular/{destination}", method = {RequestMethod.GET}, produces = {"application/json"})
	public List<Regular>  getRegularByDestination(@PathVariable String destination){
		return regularService.getRegularByDestination(destination);
	}
}