package gusystem.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import gusystem.api.domain.User;
import gusystem.api.repository.GuRepository;

public class UserServiceImpl {
	@Autowired
	private GuRepository repository;

	@Autowired
	public User FindById(Integer id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElse(null);
	}
}
