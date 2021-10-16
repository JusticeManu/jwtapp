package security.app.jwtapp.repo;

import security.app.jwtapp.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepo extends JpaRepository<Role,Long> {

        Role findByName(String name);
}
