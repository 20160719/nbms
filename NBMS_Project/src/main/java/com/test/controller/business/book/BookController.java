package com.test.controller.business.book;

import com.test.controller.business.AbstractBookController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/business/book")
public class BookController extends AbstractBookController {

    /**
     * 图书入库
     *
     * @return void TODO
     */
    @RequestMapping(value = "createBooks" + ACTION, method = RequestMethod.POST)
    public void createBooks(){
        /**
         *
         * 根据图书类型(必选) 图书名称(必填) 图书作者(必填) 图书上线状态 图书图片 图书价格(默认80元) 图书数量 入库
         *
         */
    }

    /**
     * 图书查询
     *
     * @return void TODO
     */
    @RequestMapping(value = "queryBooks" + ACTION, method = RequestMethod.POST)
    public void queryBooks() {
        /**
         *
         * 根据图书类型 图书名称(模糊) 图书作者(模糊) 图书价格 图书上线状态 查询
         *
         */

    }

    /**
     * 图书修改
     *
     * @return void TODO
     */
    @RequestMapping(value = "modifyBooks" + ACTION, method = RequestMethod.POST)
    public void modifyBooks() {
        /**
         *
         * 只能修改 图书名称 图书作者 图书图片 图书价格 不能修改 图书类型 图书上线状态
         *
         */

    }

    /**
     * 图书删除
     *
     * @return void TODO
     */
    @RequestMapping(value = "deleteBooks" + ACTION, method = RequestMethod.POST)
    public void deleteBooks() {
        /**
         *
         * 只能根据 图书ID 删除
         *
         */

    }

    /**
     * 图书上架
     *
     * @return void TODO
     */
    @RequestMapping(value = "onLineBooks" + ACTION, method = RequestMethod.POST)
    public void onLineBooks() {
        /**
         *
         * 修改图书上线状态为上线
         *
         */

    }

    /**
     * 图书下架
     *
     * @return void TODO
     */
    @RequestMapping(value = "offLineBooks" + ACTION, method = RequestMethod.POST)
    public void offLineBooks() {
        /**
         *
         * 修改图书上线状态为下线
         *
         */

    }

    @Override
    public String directory() {
        return null;
    }




}
