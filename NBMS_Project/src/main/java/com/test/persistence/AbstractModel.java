package com.test.persistence;

import java.io.Serializable;

/**
 * 基础实体类
 * 所有实体继承该类，抽象了基本属性：分页信息
 *
 * @author linjj
 * @version 1.0
 * @date 2015/02/03
 */
public abstract class AbstractModel implements Serializable {
	
    private static final long serialVersionUID = -7293602852002820995L;

    /**
     * 分页页码
     */
    public int page;

    /**
     * 每页显示行数，默认20
     */
    public int rows = 20;

    /**
     * 开始行数
     */
    public int startRow;

    /**
     * 结束行数
     */
    public int endRow;
    
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getStartRow() {
        return (page - 1) * rows + 1;
    }


    public int getEndRow() {
        return getStartRow() + rows - 1;
    }
  
}
