package casa.squawk7777.jquiz.service;

import casa.squawk7777.jquiz.model.User;
import casa.squawk7777.jquiz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<User> {
    protected UserRepository repo2;

    @Autowired
    public UserService(UserRepository repo) {
        this.repo = repo;
        this.repo2 = repo;
    }
}
