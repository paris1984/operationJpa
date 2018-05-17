package es.jlmartinr.service;

import es.jlmartinr.entity.User;

import java.util.List;

public interface UserService {
   Boolean save(User user);
 
   List<User> list();
}