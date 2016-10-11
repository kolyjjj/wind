package li.koly.book.external;

import li.koly.book.module.User;
import li.koly.user.service.UserService;

public class DependenceUserServiceExternal implements UserServiceExternal {

    @Override
    public User getUser(String name) {
        UserService userService = new UserService();
        li.koly.user.module.User user = userService.getUser("koly");
        return new User(user.getName(), user.getPassword());
    }
}
