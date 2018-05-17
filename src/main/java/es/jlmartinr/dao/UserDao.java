package es.jlmartinr.dao;

import es.jlmartinr.entity.User;

import java.util.List;

public interface UserDao {
    Boolean save(User user);
    List<User> list();
}
