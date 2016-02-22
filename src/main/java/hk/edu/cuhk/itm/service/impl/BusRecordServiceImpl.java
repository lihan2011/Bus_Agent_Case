package hk.edu.cuhk.itm.service.impl;

import hk.edu.cuhk.itm.model.BusRecord;
import hk.edu.cuhk.itm.repository.BusRecordRepository;
import hk.edu.cuhk.itm.service.BusRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BusRecordServiceImpl implements BusRecordService {

    @Autowired
    private BusRecordRepository busRecordRepository;

    @Override
    public List<BusRecord> getAllBusRecord() {
        return busRecordRepository.findAll();
    }

    @Override
    public List<BusRecord> getBusRecordByBusNo(int busNo) {
        return busRecordRepository.findByBusNo(busNo);
    }
}
