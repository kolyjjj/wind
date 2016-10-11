package li.koly.user.service;

import li.koly.user.module.User;

public class UserService {
    public User getUser(String name) {
        return new User(name, "ouwerjlfs");
    }
}
