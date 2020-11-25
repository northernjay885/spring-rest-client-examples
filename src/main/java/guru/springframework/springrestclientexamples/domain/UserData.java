package guru.springframework.springrestclientexamples.domain;

import java.util.LinkedList;
import java.util.List;

public class UserData {

    List<User> users = new LinkedList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
