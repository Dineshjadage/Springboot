package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestDemo {

    private int wins;
    private int losses;

    @PutMapping("/score/updates")
    public String updateScore(@RequestParam int wins, @RequestParam int losses) {
        this.wins = wins;
        this.losses = losses;
        return "wins=" + wins + ", losses=" + losses;
    }

    @DeleteMapping("/score/delete")
    public String deleteScore() {
        this.wins = 0;
        this.losses = 0;
        return "wins=" + wins + ", losses=" + losses;
    }

    @PostMapping("/score/losses")
    public int increaseLosses() {
        return ++losses; // Increment before returning
    }

    @PostMapping("/score/wins")
    public int increaseWins() {
        return ++wins; // Increment before returning
    }

    @GetMapping("/score/wins")
    public int getWins() {
        return wins;
    }

    @GetMapping("/score/losses")
    public int getLosses() {
        return losses;
    }
}
