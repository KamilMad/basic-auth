package madej.kamil.basicauth.controller;

import madej.kamil.basicauth.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    private final UserService userService;

    @PostMapping
    public ResponseEntity<String> login(@RequestBody User user) {

    }
}
