package gusystem.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gusystem.api.domain.User;
import gusystem.api.repository.GuRepository;
import gusystem.api.service.service.UserService;

@Service
public class UserServiceImpl implements UserService	{
	@Autowired
	private GuRepository repository;

	@Override
	public User FindById(Integer id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElse(null);
	}
}
