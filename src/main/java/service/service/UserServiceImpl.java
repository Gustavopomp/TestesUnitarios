package service.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.GuRepository;
import domain.User;
import service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private GuRepository repository;

	
	@Override
	public User FindById(Integer id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElse(null);
	}

}
