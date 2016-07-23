package com.test.controller.system.role;

import com.test.controller.system.AbstractSystemController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/system/role")
public class RoleController extends AbstractSystemController {

    public String directory() {
        return null;
    }

}
