package security.app.jwtapp.service;

import security.app.jwtapp.domain.AppUser;
import security.app.jwtapp.domain.Role;

import java.util.List;


public interface UserService {

    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();

}
