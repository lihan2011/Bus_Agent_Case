package hk.edu.cuhk.itm.service;

import hk.edu.cuhk.itm.model.BusRecord;

import java.util.List;

public interface BusRecordService {
    List<BusRecord> getAllBusRecord();
    List<BusRecord> getBusRecordByBusNo(int busNo);
}
