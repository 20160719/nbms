package com.test.persistence.service.system.user;

import java.util.List;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import com.test.persistence.entity.system.Permission;
import com.test.persistence.entity.system.Role;
import com.test.persistence.entity.system.User;
import com.test.system.exception.SystemServiceException;


public interface UserService {
	
	public abstract Integer createUsers(@Required List<User> list) throws SystemServiceException;
	
	public abstract Integer modifyUserPassword(@Required String userId, String password)  throws SystemServiceException;
	
	public abstract User queryUser(@Required User user) throws SystemServiceException;
	
	public abstract List<Role> queryRolesByUser(@Required User user) throws SystemServiceException;
	
	public abstract List<Permission> queryPermissionsByUser(@Required User user) throws SystemServiceException;
	
}
