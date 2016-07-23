package com.test.system.page;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.io.Serializable;
import java.util.List;

/**
 * 鎵╁睍鍒嗛〉淇℃伅锛屼负浜嗗吋瀹筫asyui鐨勫垎椤电粍浠讹紝浣跨敤rows淇濆瓨缁撴灉闆�
 *
 * @author linjj
 * @date 2015/3/2 17:11
 * </p>
 * Copyright 漏 2014	OP-MOBILE
 */
public class ExtendedPageInfo<T> extends PageInfo<T> implements Serializable {
    
	private static final long serialVersionUID = -180849268143553409L;

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    //缁撴灉闆嗭紝涓轰簡鍏煎easyui鍒嗛〉蹇呴』浣跨敤rows
    private List<T> rows;

    public ExtendedPageInfo(List<T> list) {
        super(clearResult(list));
        rows = list;
    }

    public ExtendedPageInfo(List<T> list, int navigatePages) {
        super(clearResult(list), navigatePages);
        rows = list;
    }

    /**
     * 閬垮厤瀛愮被鐖剁被鍚屾椂淇濆瓨浜嗙粨鏋滈泦锛岃皟鐢ㄧ埗绫绘瀯閫犲嚱鏁版椂浼犱竴涓娓呯┖鐨刢lone缁撴灉闆嗙粰鐖剁被
     *
     * @param list 缁撴灉闆�
     * @param <T>  娉涘瀷绫诲瀷
     * @return 娓呯┖鍚庣殑鍒嗛〉瀵硅薄
     */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static <T> List<T> clearResult(List<T> list) {
        Page<T> page = new Page<T>();
        if (list instanceof Page) {
            page = (Page<T>) ((Page) list).clone();
            page.clear();
        }
        return page;
    }
}
