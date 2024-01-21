package madej.kamil.basicauth.service;

import lombok.AllArgsConstructor;
import madej.kamil.basicauth.model.User;
import madej.kamil.basicauth.model.UserLogin;
import madej.kamil.basicauth.repository.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final AuthenticationManager authenticationManager;


    public long login(UserLogin userLogin) {

        User user = findByUsername(userLogin.username());

        Authentication authenticationRequest = new UsernamePasswordAuthenticationToken(
                userLogin.username(), userLogin.password());

        Authentication authenticationResponse = authenticationManager.authenticate(authenticationRequest);

        SecurityContextHolder.getContext().setAuthentication(authenticationResponse);

        u

        return user.getId();
    }

    private User findByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found in db"));
    }
}
