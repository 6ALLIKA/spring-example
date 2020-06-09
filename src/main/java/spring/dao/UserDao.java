package spring.dao;

import java.util.List;
import java.util.Optional;
import spring.model.User;

public interface UserDao {
    User add(User user);

    Optional<User> findByEmail(String email);

    List<User> getAll();

    User get(Long userId);
}
