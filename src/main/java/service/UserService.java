package service;

import java.util.Optional;

import javax.print.attribute.standard.MediaSize.Other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import Repository.GuRepository;
import domain.User;

@Service
public class UserService {
	@Autowired
	private GuRepository repository;

	public User findById(@PathVariable Integer id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElse(null);
	}
}
