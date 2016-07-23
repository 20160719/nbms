package com.test.persistence.service.system.role;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import com.test.persistence.entity.system.Role;
import com.test.system.exception.SystemServiceException;
import com.test.system.page.ExtendedPageInfo;

public interface RoleService {
	//@Required 
	public abstract Integer createRoles(List<Role> list) throws SystemServiceException;

	public abstract Integer modifyRoles(@Required List<Role> list) throws SystemServiceException;

	public abstract Integer deleteRoles(@Required List<Role> list) throws SystemServiceException;

	public abstract List<Role> queryRolesByMap(@Required Map<String, Object> map) throws SystemServiceException;

	public abstract ExtendedPageInfo<Role> queryRolesByMap(@Required Map<String, Object> map, boolean isPage)
			throws SystemServiceException;

}
