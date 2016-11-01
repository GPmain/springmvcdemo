package test.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import test.dao.UserMapper;
import test.domain.User;
import test.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Resource
	UserMapper userMapper;
	
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userMapper.selectByPrimaryKey(1);
	}

}
