package hk.edu.cuhk.itm.controller;

import hk.edu.cuhk.itm.model.Administrator;
import hk.edu.cuhk.itm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "{id}", method = {RequestMethod.GET}, produces = {"application/json"})
    public Administrator getAdminById(@PathVariable int id) {
        return userService.get(id);
    }

}
