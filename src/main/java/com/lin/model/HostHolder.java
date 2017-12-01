package com.lin.model;

import com.lin.model.User;
import org.springframework.stereotype.Component;

@Component
public class HostHolder {
    private static ThreadLocal<User> users = new ThreadLocal<>();

    public User getUsers(){
        return users.get();
    }

    public void setUsers(User user){
        users.set(user);
    }

    public void clear(){
        users.remove();
    }
}
