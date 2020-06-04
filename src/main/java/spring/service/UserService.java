package spring.service;

import java.util.List;
import java.util.Optional;
import spring.model.User;

public interface UserService {
    User add(User user);

    Optional<User> findByEmail(String email);

    public List<User> getAll();

    User get(Long userId);
}
