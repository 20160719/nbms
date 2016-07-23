package com.test.persistence.service.system.role.impl;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.test.persistence.entity.system.Role;
import com.test.persistence.mapper.system.role.RoleMapper;
import com.test.persistence.service.system.AbstractSystemService;
import com.test.persistence.service.system.role.RoleService;
import com.test.system.exception.SystemServiceException;
import com.test.system.page.ExtendedPageInfo;

@Service(value = "roleServiceImpl")
public class RoleServiceImpl extends AbstractSystemService implements RoleService {

	@Resource(name = "roleMapper")
	private RoleMapper roleMapper;

	@Override
	public Integer createRoles(List<Role> list) throws SystemServiceException {
		try {
			return this.roleMapper.creates(list);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

	@Override
	public Integer modifyRoles(List<Role> list) throws SystemServiceException {
		try {
			return this.roleMapper.modifys(list);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

	@Override
	public Integer deleteRoles(List<Role> list) throws SystemServiceException {
		try {
			return this.roleMapper.deletes(list);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

	@Override
	public List<Role> queryRolesByMap(Map<String, Object> map) throws SystemServiceException {
		try {
			return this.roleMapper.querysByMap(map);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

	@Override
	public ExtendedPageInfo<Role> queryRolesByMap(Map<String, Object> map, boolean isPage)
			throws SystemServiceException {
		if (isPage) {
			PageHelper.startPage(Integer.parseInt(map.get("page").toString()),
					Integer.parseInt(map.get("rows").toString()), true);
		}
		return new ExtendedPageInfo<Role>(queryRolesByMap(map));
	}

}
