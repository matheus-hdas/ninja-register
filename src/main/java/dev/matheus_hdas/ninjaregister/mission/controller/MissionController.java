package dev.matheus_hdas.ninjaregister.mission.controller;

import dev.matheus_hdas.ninjaregister.mission.model.MissionDTO;
import dev.matheus_hdas.ninjaregister.mission.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mission")
public class MissionController {

    @Autowired
    private MissionService missionService;

    @GetMapping("/list")
    public List<MissionDTO> findAll() {
        return missionService.findAll();
    }

    @GetMapping("/{id}")
    public MissionDTO findById(@PathVariable Long id) {
        return missionService.findById(id);
    }

    @PostMapping("/create")
    public MissionDTO create(@RequestBody MissionDTO data) {
        return missionService.create(data);
    }

    @PutMapping("/update/{id}")
    public MissionDTO update(@PathVariable Long id, @RequestBody MissionDTO data) {
        return missionService.update(id, data);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        missionService.delete(id);
        return ResponseEntity.ok().build();
    }
}
