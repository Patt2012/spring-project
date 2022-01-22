package com.court.authserver.service;

import com.court.authserver.domain.Role;
import com.court.authserver.domain.User;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
}
