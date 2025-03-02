package com.example.demo;
import com.example.demo.PersonForm;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class PersonFormController {
    @GetMapping("/personForm")
    public String showForm(Model model) {
        model.addAttribute("personForm", new PersonForm());
        return "personForm";  // View name (personForm.html)
    }
    @PostMapping("/personForm")
    public String submitForm(@Valid PersonForm personForm, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "personForm";  // Return the form view with validation errors
        }
        model.addAttribute("person", personForm);
        return "formSuccess";  // View for success (formSuccess.html)
    }
}
