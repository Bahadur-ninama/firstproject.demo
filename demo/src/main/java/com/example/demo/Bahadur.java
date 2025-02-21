package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Bahadur{

    // Show the registration form
    @GetMapping
    public String showRegistrationForm() {
        return "page"; // Points to registration.html
    }

    // Handle form submission
    @PostMapping("/register")
    public String handleFormSubmission(String name, String email, Model model) {
        // Simulate validation (e.g., required fields)
        if (name == null || name.isEmpty() || email == null || email.isEmpty()) {
            // If validation fails, go to the error page
            model.addAttribute("message", "Name and Email are required!");
            return "error"; // Points to error.html
        }

        // If validation passes, go to the success page
        model.addAttribute("name", name);
        return "success"; // Points to success.html
    }
}
