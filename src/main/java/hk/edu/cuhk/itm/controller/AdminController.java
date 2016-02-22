package hk.edu.cuhk.itm.controller;

import hk.edu.cuhk.itm.model.Administrator;
import hk.edu.cuhk.itm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hzy on 22/2/2016.
 */
@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "{id}", method = {RequestMethod.GET}, produces = {"application/json"})
    public Administrator test(@PathVariable long id) {
        return userService.get(id);
    }

}
