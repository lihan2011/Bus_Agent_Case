package hk.edu.cuhk.itm.service;

import hk.edu.cuhk.itm.model.Administrator;

/**
 * Created by hzy on 22/2/2016.
 */
public interface UserService {
    Administrator get(long id);
}
