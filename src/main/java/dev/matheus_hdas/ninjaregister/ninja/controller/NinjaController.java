package dev.matheus_hdas.ninjaregister.ninja.controller;

import dev.matheus_hdas.ninjaregister.ninja.model.Ninja;
import dev.matheus_hdas.ninjaregister.ninja.service.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping
    public List<Ninja> findAll() {
        return ninjaService.findAll();
    }

    @GetMapping("/{id}")
    public Ninja findById(@PathVariable Long id) {
        return ninjaService.findById(id);
    }

    @PostMapping("/create")
    public Ninja create(@RequestBody Ninja ninja) {
        return ninjaService.create(ninja);
    }

    @PutMapping("/update/{id}")
    public Ninja update(@PathVariable Long id, @RequestBody Ninja ninja) {
        return ninjaService.update(id, ninja);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }
}
