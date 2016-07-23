package com.test.controller.system.menu;

import com.test.controller.system.AbstractSystemController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/system/menu")
public class MenuController extends AbstractSystemController {

    public String directory() {
        return null;
    }

}
