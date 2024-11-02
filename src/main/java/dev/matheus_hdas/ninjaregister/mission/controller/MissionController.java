package dev.matheus_hdas.ninjaregister.mission.controller;

import dev.matheus_hdas.ninjaregister.mission.model.MissionDTO;
import dev.matheus_hdas.ninjaregister.mission.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mission")
public class MissionController {

    @Autowired
    private MissionService missionService;

    @GetMapping("/list")
    public ResponseEntity<List<MissionDTO>> findAll() {
        return ResponseEntity.ok(missionService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MissionDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(missionService.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<MissionDTO> create(@RequestBody MissionDTO data) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(missionService.create(data));
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<MissionDTO> update(@PathVariable Long id, @RequestBody MissionDTO data) {
        return ResponseEntity.ok(missionService.update(id, data));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        missionService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
