package guru.springframework.springrestclientexamples.services;

import guru.springframework.springrestclientexamples.domain.User;
import guru.springframework.springrestclientexamples.domain.UserData;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);


}
