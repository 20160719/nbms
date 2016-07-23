package com.test.persistence.service.system.menu.impl;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.test.persistence.entity.system.Menu;
import com.test.persistence.mapper.system.menu.MenuMapper;
import com.test.persistence.service.system.AbstractSystemService;
import com.test.persistence.service.system.menu.MenuService;
import com.test.system.exception.SystemServiceException;
import com.test.system.page.ExtendedPageInfo;

@Service(value = "menuServiceImpl")
public class MenuServiceImpl extends AbstractSystemService implements MenuService {

	@Resource(name = "menuMapper")
	private MenuMapper menuMapper;
	
	@Override
	public Integer createMenus(List<Menu> list) throws SystemServiceException {
		try {
			return this.menuMapper.creates(list);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

	@Override
	public Integer modifyMenus(List<Menu> list) throws SystemServiceException {
		try {
			return this.menuMapper.modifys(list);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

	@Override
	public Integer deleteMenus(List<Menu> list) throws SystemServiceException {
		try {
			return this.menuMapper.deletes(list);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

	@Override
	public ExtendedPageInfo<Menu> queryMenus(Map<String, Object> map,
			boolean isPage) throws SystemServiceException {
		try {
			if (isPage) {
				PageHelper.startPage(
						Integer.parseInt(map.get("page").toString()),
						Integer.parseInt(map.get("rows").toString()), true);
			}
			return new ExtendedPageInfo<Menu>(this.menuMapper.querysByMap(map));
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

}
