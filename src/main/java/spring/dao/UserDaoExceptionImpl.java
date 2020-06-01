package spring.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import spring.model.User;

@Repository
public class UserDaoExceptionImpl implements UserDao {
    @Override
    public User add(User user) {
        throw new RuntimeException("hey, i'm new implementation");
    }

    @Override
    public Optional<User> findByEmail(String email) {
        throw new RuntimeException("hey, i'm new implementation");
    }

    @Override
    public List<User> getAll() {
        throw new RuntimeException("hey, i'm new implementation");
    }
}
