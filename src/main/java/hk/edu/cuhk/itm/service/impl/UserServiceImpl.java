package hk.edu.cuhk.itm.service.impl;

import hk.edu.cuhk.itm.model.Administrator;
import hk.edu.cuhk.itm.repository.AdministratorRepository;
import hk.edu.cuhk.itm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private AdministratorRepository administratorRepository;

    @Override
    public Administrator get(int id) {
        return administratorRepository.findOne(id);
    }
}
