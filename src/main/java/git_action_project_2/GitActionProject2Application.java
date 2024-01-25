package git_action_project_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitActionProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(GitActionProject2Application.class, args);
	}
	
	@GetMapping("/")
	public String user() {
		return "hii inba code is working";
	}
	
   @GetMapping("/user/details")
	public String user1() {
		return "first time using aws code deployed the code using git action";
	}
	
	

}
