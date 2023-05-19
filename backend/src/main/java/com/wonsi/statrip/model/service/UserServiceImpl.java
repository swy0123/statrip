package com.wonsi.statrip.model.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wonsi.statrip.model.dto.UserDto;
import com.wonsi.statrip.model.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public String findUserByRefreshToken(String refreshtoken) throws Exception {
		return sqlSession.getMapper(UserRepository.class).findUserByRefreshToken(refreshtoken);
	}

	@Override
	public UserDto findUserByUserId(String userId) throws Exception {
		return sqlSession.getMapper(UserRepository.class).findUserByUserId(userId);
	}

}