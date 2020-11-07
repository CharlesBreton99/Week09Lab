package services;

import dataaccess.UserDB;
import models.User;
import java.util.List;

public class UserService {

    public User get(String username) throws Exception {
        UserDB userDB = new UserDB();
        User user = userDB.getUser(username);
        return user;
    }

    public List<User> getAll() throws Exception {
        UserDB userDB = new UserDB();
        List<User> users = userDB.getAll();
        return userDB.getAll();
    }

    public void update(String username, String password, String firstname, String lastname, String email) throws Exception {
        UserDB userDB = new UserDB();
        User user = userDB.getUser(username);
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setEmail(email);
        userDB.update(user);
    }

    public void delete(String username) throws Exception {
        UserDB userDB = new UserDB();
        User deletedUser = userDB.getUser(username);
        userDB.delete(deletedUser);
    }

    public void insert(String username, String password, String firstname, String lastname, String email) throws Exception {
        UserDB userDB = new UserDB();
        User user = new User(username, password, firstname, lastname, email);
        userDB.insert(user);
    }
}
