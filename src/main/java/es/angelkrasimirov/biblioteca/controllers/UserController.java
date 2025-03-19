package es.angelkrasimirov.biblioteca.controllers;

import es.angelkrasimirov.biblioteca.models.User;
import es.angelkrasimirov.biblioteca.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsers() {
		return ResponseEntity.ok(userService.getAllUsers());
	}

	@GetMapping("/users/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable Long userId) {
		User user = userService.getUserById(userId);

		if (user == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(user);
	}

//	@PostMapping("/users")
//	public ResponseEntity<User> createUser(@RequestBody User user) {
//		User newUser = userService.saveUser(user);
//		return ResponseEntity.ok(newUser);
//	}

//	@PostMapping("/users/register")
//	public ResponseEntity<User> registerUser(@RequestBody User user) {
//		User newUser = userService.registerUser(user);
//		return ResponseEntity.ok(newUser);
//	}
//
//	@PostMapping("/users/login")
//	public ResponseEntity<String> loginUser(@RequestBody User user) {
//		String token = authenticationService.authenticateUser(user);
//		return ResponseEntity.ok(token);
//	}
}
