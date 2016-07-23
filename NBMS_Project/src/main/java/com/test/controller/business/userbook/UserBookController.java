package com.test.controller.business.userbook;

import com.test.controller.business.AbstractUserBookController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/business/userBook")
public class UserBookController extends AbstractUserBookController {

    /**
     * 图书借阅入库
     *
     * @return void TODO
     */
    @RequestMapping(value = "createUserBooks" + ACTION, method = RequestMethod.POST)
    public void createUserBooks(){

    }

    /**
     * 图书归还入库
     *
     * @return void TODO
     */
    @RequestMapping(value = "deleteUserBooks" + ACTION, method = RequestMethod.POST)
    public void deleteUserBooks(){

    }

    /**
     * 图书借阅归还查询
     *
     * @return void TODO
     */
    @RequestMapping(value = "queryUserBooks" + ACTION, method = RequestMethod.POST)
    public void queryUserBooks() {


    }

    /**
     * 图书挂失入库
     *
     * @return void TODO
     */
    @RequestMapping(value = "lossUserBooks" + ACTION, method = RequestMethod.POST)
    public void lossUserBooks() {


    }

    @Override
    public String directory() {
        return null;
    }
}
