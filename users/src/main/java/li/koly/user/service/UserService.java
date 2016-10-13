package li.koly.user.service;

import li.koly.user.module.User;
import li.koly.user.repository.UserRepository;

public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(String name) {
        User user = userRepository.findOne((root, query, cb) -> cb.equal(root.get("name"), name));
        return user;
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
