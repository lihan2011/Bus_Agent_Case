package hk.edu.cuhk.itm.repository;

import hk.edu.cuhk.itm.model.BusRecord;
import org.springframework.data.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface BusRecordRepository extends Repository<BusRecord, Integer> {
    List<BusRecord> findAll();
    List<BusRecord> findByBusNo(int busNo);
}
