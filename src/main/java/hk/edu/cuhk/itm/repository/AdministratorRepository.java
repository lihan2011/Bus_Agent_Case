package hk.edu.cuhk.itm.repository;

import hk.edu.cuhk.itm.model.Administrator;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface AdministratorRepository extends Repository<Administrator, Integer> {

    Administrator findOne(Integer id);
}
