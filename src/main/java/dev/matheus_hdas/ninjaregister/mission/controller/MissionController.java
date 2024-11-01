package dev.matheus_hdas.ninjaregister.mission.controller;

import dev.matheus_hdas.ninjaregister.mission.model.Mission;
import dev.matheus_hdas.ninjaregister.mission.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mission")
public class MissionController {

    @Autowired
    private MissionService missionService;

    public List<Mission> findAll() {
        return missionService.findAll();
    }

    public Mission findById(Long id) {
        return missionService.findById(id);
    }

    public Mission create(Mission data) {
        return missionService.create(data);
    }

    public Mission update(Long id, Mission data) {
        return missionService.update(id, data);
    }

    public ResponseEntity<?> delete(Long id) {
        missionService.delete(id);
        return ResponseEntity.ok().build();
    }
}
