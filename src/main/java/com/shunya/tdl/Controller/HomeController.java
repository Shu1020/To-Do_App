package com.shunya.tdl.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.shunya.tdl.Entity.Course;
import com.shunya.tdl.Entity.User;
import com.shunya.tdl.Repositories.CourseRepository;
import com.shunya.tdl.Repositories.UserRepository;

@Controller
public class HomeController {
	
	@Autowired
	private CourseRepository cRepo;
	
	@Autowired
	private UserRepository repo;
	
	
	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/register")
	 public String showSignUpForm(Model model) {
		model.addAttribute("user", new User());
		return "signup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegistration(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		repo.save(user);
		
		return "register_sucess";
	}
//	Need to work on from here
	@GetMapping("/create_todo")
	public String createTodo(Model model) {
		model.addAttribute("course", new Course());
		return "createToDo";
	}
	
	@PostMapping("/process_todo")
	public String processTodo(Course course) {
		cRepo.save(course);
		return "create_success";
	}
	
	@GetMapping("/list_create")
	public String viewCreateList(Model model) {
		List<Course> listCourses = cRepo.findAll();
		model.addAttribute("listCourses", listCourses);
		return "create_list";
	}
	//From here
	
		
	@GetMapping("/list_users")
	public String viewUsersList(Model model) {
		List<User> listUsers = repo.findAll();
		model.addAttribute("listUsers", listUsers);
		return "users";
	}
	
}
