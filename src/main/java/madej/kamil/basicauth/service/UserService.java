package madej.kamil.basicauth.service;

import madej.kamil.basicauth.model.User;
import madej.kamil.basicauth.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public long login(User user) {

        return user.getId();
    }
}
