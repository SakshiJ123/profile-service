package com.reliance.profile.redis.repository;

import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.reliance.profile.redis.model.User;
@Service
public class UserRepositoryImpl implements UserRepository{

	private RedisTemplate<String, User> redisTemplate;
	
	private HashOperations hashOperations;
	
	public UserRepositoryImpl(RedisTemplate<String, User> redisTemplate) {
		super();
		this.redisTemplate = redisTemplate;
	hashOperations = redisTemplate.opsForHash();
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		hashOperations.put("USER", user.getId(), user);
	}

	@Override
	public Map<String, User> findAll() {
		// TODO Auto-generated method stub
		return hashOperations.entries("USER");
	}

	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return (User) hashOperations.get("USER", id);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		save(user);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		hashOperations.delete("USER", id);
	}

}
