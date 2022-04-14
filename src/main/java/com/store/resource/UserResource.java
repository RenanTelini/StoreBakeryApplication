package com.store.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

//	@GetMapping
//	public ResponseEntity<User> findAll() {
//
//		User u = new User(1L, "Wallace", "wally@gail", "9999", "1234");
//		return ResponseEntity.ok().body(u);
//	}
}
