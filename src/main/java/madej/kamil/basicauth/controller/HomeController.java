package madej.kamil.basicauth.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class HomeController {

    @GetMapping
    public String helloWorld() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Hello " + authentication.getName();
    }
}
