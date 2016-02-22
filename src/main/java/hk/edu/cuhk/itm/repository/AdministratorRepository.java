package hk.edu.cuhk.itm.repository;

import hk.edu.cuhk.itm.model.Administrator;
import org.springframework.data.repository.Repository;

/**
 * Created by hzy on 22/2/2016.
 */
@org.springframework.stereotype.Repository
public interface AdministratorRepository extends Repository<Administrator, Long> {

    Administrator findOne(Long id);
}
