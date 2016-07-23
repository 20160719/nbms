package com.test.persistence.service.system.menu;

import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import com.test.persistence.entity.system.Menu;
import com.test.system.exception.SystemServiceException;
import com.test.system.page.ExtendedPageInfo;

public interface MenuService {
	
	public abstract Integer createMenus(@Required List<Menu> list) throws SystemServiceException;
	
	public abstract Integer modifyMenus(@Required List<Menu> list) throws SystemServiceException;
	
	public abstract Integer deleteMenus(@Required List<Menu> list) throws SystemServiceException;
	
	public abstract ExtendedPageInfo<Menu> queryMenus(@Required Map<String, Object> map, boolean isPage) throws SystemServiceException;

}
