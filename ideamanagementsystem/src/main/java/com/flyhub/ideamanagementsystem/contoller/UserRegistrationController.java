/*
 * package com.flyhub.ideamanagementsystem.contoller;
 * 
 * import org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestMapping;
 * 
 * import com.flyhub.ideamanagementsystem.dto.UserRegistrationDto; import
 * com.flyhub.ideamanagementsystem.service.UserService;
 * 
 * @Controller
 * 
 * @RequestMapping("/idea_ms") public class UserRegistrationController {
 * 
 * private UserService userService;
 * 
 * public UserRegistrationController(UserService userService) { super();
 * this.userService = userService; }
 * 
 * @ModelAttribute("user") public UserRegistrationDto userRegistrationDto() {
 * return new UserRegistrationDto(); }
 * 
 * @GetMapping("/registration") public String showRegistrationForm() { return
 * "registration"; }
 * 
 * @PostMapping("/userregistration") public String
 * registerUserAccount(@ModelAttribute("user") UserRegistrationDto
 * registrationDto) { userService.save(registrationDto); return
 * "redirect:/registration?success"; }
 * 
 * }
 */