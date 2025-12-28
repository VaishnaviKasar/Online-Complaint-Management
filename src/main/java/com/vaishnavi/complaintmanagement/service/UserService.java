package com.vaishnavi.complaintmanagement.service;

import com.vaishnavi.complaintmanagement.model.User;
import java.util.List;

public interface UserService {

    User registerUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();
}
