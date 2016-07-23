package com.test.persistence.service.system.user.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.test.persistence.entity.system.Permission;
import com.test.persistence.entity.system.Role;
import com.test.persistence.entity.system.User;
import com.test.persistence.mapper.system.user.UserMapper;
import com.test.persistence.service.system.AbstractSystemService;
import com.test.persistence.service.system.user.UserService;
import com.test.system.exception.SystemServiceException;
import com.test.system.util.ToolUtil;

@Service(value = "userServiceImpl")
public class UserServiceImpl extends AbstractSystemService implements UserService {

	@Resource(name = "userMapper")
	private UserMapper userMapper;

	public User queryUser(User user) throws SystemServiceException {
		try {
			List<User> list = this.userMapper.querys(user);
			if (ToolUtil.objIsNotNull(list) && 1 == list.size()) {
				return list.get(0);
			}
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
		return null;
	}

	public List<Role> queryRolesByUser(User user) throws SystemServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Permission> queryPermissionsByUser(User user) throws SystemServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer createUsers(List<User> list) throws SystemServiceException {
		try {
			return this.userMapper.creates(list);
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}

	@Override
	public Integer modifyUserPassword(String userId, String password) throws SystemServiceException {
		User user = (User) new User().setUserId(userId).setPassword(password);
		try {
			return this.userMapper.modifys(add(new User[]{user}));
		} catch (Exception e) {
			error(e.getMessage());
			throw getSystemServiceException(e.getMessage());
		}
	}
	
}
