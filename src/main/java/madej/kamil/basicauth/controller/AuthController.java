package madej.kamil.basicauth.controller;

import madej.kamil.basicauth.model.UserLogin;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {

    private final AuthenticationManager authenticationManager;

    public AuthController(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserLogin userLogin) {
        Authentication authenticationRequest = UsernamePasswordAuthenticationToken
                .unauthenticated(userLogin.username(), userLogin.password());
        
        Authentication authenticationResponse = authenticationManager
                .authenticate(authenticationRequest);
        return null;
    }
}
