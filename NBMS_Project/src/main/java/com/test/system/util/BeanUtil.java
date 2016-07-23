package com.test.system.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.test.persistence.entity.system.Operation;
import com.test.system.page.ExtendedPageInfo;

/**
 * Title:BeanUtils.java
 * <p>
 * Description:
 * </p>
 * Company:Neware International
 * 
 * @author Chef.K
 * @date 2016骞�鏈�2鏃�涓嬪崍11:37:50
 * @version 1.0
 */
public final class BeanUtil {

    /**
     * 灏嗗師瀵硅薄鐨勫睘鎬у�鎷疯礉鍒扮洰鏍囧璞★紝骞惰繑鍥炵洰鏍囧璞°�
     * 
     * @param source
     * @param target
     * @return
     */
    public static <T> T copyProperties(Object source, T target) {
        if (ToolUtil.objIsNull(source) || ToolUtil.objIsNull(target)) {
        	return target;
        }
        org.springframework.beans.BeanUtils.copyProperties(source, target);
        return target;
    }

    /**
     * 灏嗗師瀵硅薄鐨勫睘鎬у�鎷疯礉鍒扮洰鏍囧璞★紝骞惰繑鍥炵洰鏍囧璞°�
     *
     * @param source
     * @param targetClazzType
     * @return
     */
    public static <T> T copyProperties(Object source, Class<T> targetClazzType) {
        if (ToolUtil.objIsNull(source)) {
            return null;
        }
        try {
            T target = targetClazzType.newInstance();
            return copyProperties(source, target);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 灏嗛泦鍚堟嫹璐濇垚鐩爣绫婚泦鍚�
     *
     * @param sourceList
     * @param targetClazzType
     * @return
     */
    public static <T> List<T> copyList(List<?> sourceList, Class<T> targetClazzType) {
        if (ToolUtil.objIsNull(sourceList) || ToolUtil.objIsNull(targetClazzType)) {
            return null;
        }
        List<T> targetList = new ArrayList<T>();
        if (!sourceList.isEmpty()) {
            for (Object source : sourceList) {
                targetList.add(copyProperties(source, targetClazzType));
            }
        }
        return targetList;
    }

    /**
     * 灏哖age鎷疯礉鎴愮洰鏍囩被Page
     * 
     * @param sourcePage
     * @param targetClazzType
     * @return
     */
    public static <T> ExtendedPageInfo<T> copyPage(ExtendedPageInfo<?> sourcePage, Class<T> targetClazzType) {
        if (null == sourcePage || null == targetClazzType) {
            return null;
        }
        //涓嶈兘鍋锋噿涓嶅啓杩欐锛屽綋椤甸潰杩斿洖涓簄ull鏃讹紝list瑕佹樉绀轰负绌�鑰屼笉鏄痭ull
        List<T> tList = new ArrayList<T>();
        if (!ToolUtil.objIsNull(sourcePage.getList())) {
            tList = copyList(sourcePage.getList(), targetClazzType);
        }
        ExtendedPageInfo<T> targetPage = new ExtendedPageInfo<T>(tList);
        return targetPage;
    }



    /**
     * 灏嗗師瀵硅薄鐨勫睘鎬у�鎷疯礉鍒扮洰鏍囧璞★紝骞惰繑鍥炵洰鏍囧璞°�
     * 
     * @param operation
     * @param target
     * @return
     */
    public static <T> T copyOperation2His(Operation operation, T target) {
        if (ToolUtil.objIsNull(target)) {
            return null;
        }
        if (ToolUtil.objIsNull(operation)) {
            return target;
        }
        Method[] methods = target.getClass().getDeclaredMethods();
        for (Method method : methods) {
            try {
            	if (method.getName().equals("setUserId")) {
                    method.invoke(target, operation.getUserId());
                }else if (method.getName().equals("setOperateId")) {
                    method.invoke(target, operation.getOperateId());
                } else if (method.getName().equals("setOperateTime")) {
                    method.invoke(target, operation.getOperateTime());
                } else if (method.getName().equals("setOperateType")) {
                    method.invoke(target, operation.getOperateType());
                } else if (method.getName().equals("setOperateRemark")) {
                    method.invoke(target, operation.getOperateRemark());
                } else {
                    continue;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return target;
    }

    /**
     * 灏嗗師瀵硅薄鐨勫睘鎬у�鎷疯礉鍒扮洰鏍囧璞★紝骞惰繑鍥炵洰鏍囧璞°�
     * 
     * @param operation
     * @param targetList
     * @return
     */
    public static <T> List<T> copyOperation2His(Operation operation, List<T> targetList) {
        if (ToolUtil.objIsNull(targetList) || targetList.isEmpty()) {
            return null;
        }
        if (ToolUtil.objIsNull(operation)) {
            return targetList;
        }
        for (T target : targetList) {
            copyOperation2His(operation, target);
        }
        return targetList;
    }

}
