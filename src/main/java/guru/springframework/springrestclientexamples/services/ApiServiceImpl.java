package guru.springframework.springrestclientexamples.services;

import guru.springframework.springrestclientexamples.domain.User;
import guru.springframework.springrestclientexamples.domain.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {

        UserData userData = restTemplate.getForObject("http://private-b1a4e9-northernjay.apiary-mock.com/api/user?limit=" + limit, UserData.class);

        return userData.getUsers();
    }

}
