package com.webservice.course.resources;

import com.webservice.course.entities.User;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User>findAll() {

        User u = new User(1L, "Maria", "maria@gmail.com", "33333333", "1234");

        return ResponseEntity.ok().body(u);

    }


}
