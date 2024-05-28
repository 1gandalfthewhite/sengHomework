package com.example.hayirhesenat;

import java.util.ArrayList;

public class UserManager {

    ArrayList<User> users;
    public void addUser(User user) {
        users.add(user);
    }
    public void deleteUser(User user) {
        users.remove(user);
    }
    private static final UserManager manager = new UserManager();
    public static UserManager getUserManager() {
        return manager;
    }

    private UserManager() {
        users = new ArrayList<>();
    }
}
