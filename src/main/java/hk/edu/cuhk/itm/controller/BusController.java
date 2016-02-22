package hk.edu.cuhk.itm.controller;

import hk.edu.cuhk.itm.model.BusRecord;
import hk.edu.cuhk.itm.service.BusRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bus")
public class BusController {

    @Autowired
    private BusRecordService busRecordService;

    @RequestMapping(value = "record", method = { RequestMethod.GET }, produces = {"application/json"})
    public List<BusRecord> getAllBusRecord() {
        return busRecordService.getAllBusRecord();
    }

    @RequestMapping(value = "record/{busNo}", method = { RequestMethod.GET }, produces = {"application/json"})
    public List<BusRecord> getBusRecordByBusNo(@PathVariable int busNo) {
        return busRecordService.getBusRecordByBusNo(busNo);
    }
}
