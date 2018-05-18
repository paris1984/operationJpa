package es.jlmartinr.service;

import es.jlmartinr.entity.User;
import es.jlmartinr.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional("transactionManager")
    @Override
    public Boolean save(User user) {

        User stored = userRepository.save(user);

        return stored!=null && stored.getId()!=null;
    }

    @Transactional(value = "transactionManager", readOnly = true)
    @Override
    public List<User> list() {
        return userRepository.findAll();
    }
}
