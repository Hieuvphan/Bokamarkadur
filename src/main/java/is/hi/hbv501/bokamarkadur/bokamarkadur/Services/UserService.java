package is.hi.hbv501.bokamarkadur.bokamarkadur.Services;

import is.hi.hbv501.bokamarkadur.bokamarkadur.Entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(User user);
    Optional<User> findById(long id);
    List<User> findAll();
    List<User> findByUsername(String username);
    //Boolean checkIfLoggedIn(String username, String password)
    //checkPassword(String username, String password)
}
