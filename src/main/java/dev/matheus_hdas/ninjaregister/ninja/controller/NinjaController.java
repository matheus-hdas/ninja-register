package dev.matheus_hdas.ninjaregister.ninja.controller;

import dev.matheus_hdas.ninjaregister.ninja.model.NinjaDTO;
import dev.matheus_hdas.ninjaregister.ninja.service.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping
    public ResponseEntity<List<NinjaDTO>> findAll() {
        return ResponseEntity.ok(ninjaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<NinjaDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(ninjaService.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<NinjaDTO> create(@RequestBody NinjaDTO ninja) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ninjaService.create(ninja));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<NinjaDTO> update(@PathVariable Long id, @RequestBody NinjaDTO ninja) {
        return ResponseEntity.ok(ninjaService.update(id, ninja));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        ninjaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
