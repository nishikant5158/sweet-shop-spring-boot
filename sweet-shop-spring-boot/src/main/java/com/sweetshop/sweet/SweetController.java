
package com.sweetshop.sweet;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/sweets")
public class SweetController {

    private final SweetRepository repo;

    public SweetController(SweetRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Sweet create(@RequestBody Sweet sweet) {
        return repo.save(sweet);
    }

    @GetMapping
    public List<Sweet> all() {
        return repo.findAll();
    }
}
