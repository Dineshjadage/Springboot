package com.example.demo;
import jakarta.validation.constraints.*;
public class PersonForm {
    @NotNull
    @Size(min = 3, max = 30, message = "Name must be between 3 and 30 characters")
    private String name;
    @NotNull(message = "Age cannot be null")
    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 100, message = "Age must be less than or equal to 100")
    private Integer age;
    @NotNull(message = "Phone cannot be null")
    @Pattern(regexp = "^\\d{10}$", message = "Phone number must be 10 digits")
    private String phone;
    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Enter a valid email address")
    private String email;
    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "PersonForm [name=" + name + ", age=" + age + ", phone=" + phone + ", email=" + email + "]";
    }
}