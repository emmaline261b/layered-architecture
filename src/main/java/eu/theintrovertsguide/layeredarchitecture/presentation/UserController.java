package eu.theintrovertsguide.layeredarchitecture.presentation;

import eu.theintrovertsguide.layeredarchitecture.businesslayer.User;
import eu.theintrovertsguide.layeredarchitecture.businesslayer.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;



@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public User save(@RequestBody User user) {
        User createdUser = userService.save(new User(
                user.getId(), user.getUsername(),
                user.getFirstName(), user.getLastName()));

        return createdUser;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable long id) {
        return userService.findUserById(id);
    }
}