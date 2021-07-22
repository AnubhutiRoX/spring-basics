package main.java.com.upxsystems.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import main.java.com.upxsystems.assignment.entity.User;
import main.java.com.upxsystems.assignment.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/list")
	public String listUsers(Model model) {
		// get users from the service
		List<User> users = userService.getUsers(); 
		
		// add the users to the model
		model.addAttribute("users", users);
		
		return "list-users";
	}
	
	@GetMapping("/showFormForAdd")
	public String showForm(Model model) {
		User user = new User();
		model.addAttribute(user);
		return "user-form";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User user) {
		userService.saveUser(user);
		return "redirect:/user/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("userId") String id, Model model) {
		User user = userService.getUser(id);
		model.addAttribute("user", user);
		return "update-user-form";
	}
	
	@PostMapping("/updateUser")
	public String updateUser(@ModelAttribute("user") User user) {
		userService.updateUser(user);
		return "redirect:/user/list";
	}
	
	@GetMapping("/delete")
	public String deleteUser(@RequestParam("userId") String id) {
		
		// delete the customer
		userService.deleteUser(id);
		
		return "redirect:/user/list";
	}
}
