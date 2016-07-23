package com.test.controller.business.book;

import com.test.controller.business.AbstractBookController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/business/bookType")
public class BookTypeController extends AbstractBookController {

    /**
     * 图书类型入库
     *
     * @return void
     * TODO
     */
    @RequestMapping(value = "createBookTypes" + ACTION, method = RequestMethod.POST)
    public void createBookTypes(){
        /**
         *
         * 根据图书类型名称(必填) 图书类型层级(可选) 图书类型说明 图书类型排序(必填)  父级图书类型ID(可选)
         * 入库
         *
         */

    }

    /**
     * 图书类型查询
     *
     * @return void
     * TODO
     */
    @RequestMapping(value = "queryBookTypes" + ACTION, method = RequestMethod.POST)
    public void queryBookTypes(){

    }

    /**
     * 图书类型修改
     *
     * @return void
     * TODO
     */
    @RequestMapping(value = "modifyBookTypes" + ACTION, method = RequestMethod.POST)
    public void modifyBookTypes(){

    }

    /**
     * 图书类型删除
     *
     * @return void
     * TODO
     */
    @RequestMapping(value = "deleteBookTypes" + ACTION, method = RequestMethod.POST)
    public void deleteBookTypes(){

    }


    @Override
    public String directory() {
        return null;
    }
}
