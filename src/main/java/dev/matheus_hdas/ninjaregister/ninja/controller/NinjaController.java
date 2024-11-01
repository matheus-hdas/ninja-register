package dev.matheus_hdas.ninjaregister.ninja.controller;

import dev.matheus_hdas.ninjaregister.ninja.model.NinjaDTO;
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
    public List<NinjaDTO> findAll() {
        return ninjaService.findAll();
    }

    @GetMapping("/{id}")
    public NinjaDTO findById(@PathVariable Long id) {
        return ninjaService.findById(id);
    }

    @PostMapping("/create")
    public NinjaDTO create(@RequestBody NinjaDTO ninja) {
        return ninjaService.create(ninja);
    }

    @PutMapping("/update/{id}")
    public NinjaDTO update(@PathVariable Long id, @RequestBody NinjaDTO ninja) {
        return ninjaService.update(id, ninja);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }
}
