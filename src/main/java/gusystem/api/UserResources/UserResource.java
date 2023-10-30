package gusystem.api.UserResources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gusystem.api.domain.User;
import gusystem.api.service.service.UserService;


@RestController
@RequestMapping(value = "/user")
public class UserResource {

	@Autowired
	private UserService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Integer id) {
		return ResponseEntity.ok().body(service.FindById(id));
	}
}
