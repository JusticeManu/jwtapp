package security.app.jwtapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import security.app.jwtapp.domain.AppUser;

public interface UserRepo extends JpaRepository<AppUser,Long> {

    AppUser findByUsername(String username);
}
