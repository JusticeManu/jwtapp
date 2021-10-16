package security.app.jwtapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import security.app.jwtapp.domain.AppUser;
import security.app.jwtapp.domain.Role;
import security.app.jwtapp.service.UserService;

import java.util.ArrayList;

@SpringBootApplication
public class JwtappApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtappApplication.class, args);
	}
	@Bean
	PasswordEncoder passwordEncoder(){

		return  new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService){

		return  args -> {
			userService.saveRole(new Role(null,"ROLE_USER"));
			userService.saveRole(new Role(null,"ROLE_MANAGER"));
			userService.saveRole(new Role(null,"ROLE_ADMIN"));
			userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

			userService.saveUser(new AppUser(null,"Jon kusi","yawt","1234",new ArrayList<>()));
			userService.saveUser(new AppUser(null,"Jon boateng","yawtt","12345",new ArrayList<>()));
			userService.saveUser(new AppUser(null,"Jonarfo","yawttt","1234",new ArrayList<>()));
			userService.saveUser(new AppUser(null,"Jon agyemku","yawtttt","1234",new ArrayList<>()));

			userService.addRoleToUser("yawt","ROLE_USER");
			userService.addRoleToUser("yawtt","ROLE_MANAGER");
			userService.addRoleToUser("yawttt","ROLE_ADMIN");
			userService.addRoleToUser("yawtttt","ROLE_SUPER_ADMIN");
			userService.addRoleToUser("yawtttt","ROLE_ADMIN");
		};
	}

}
