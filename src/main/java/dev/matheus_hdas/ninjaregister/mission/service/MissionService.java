package dev.matheus_hdas.ninjaregister.mission.service;

import dev.matheus_hdas.ninjaregister.mission.model.Mission;
import dev.matheus_hdas.ninjaregister.mission.repository.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissionService {
    @Autowired
    private MissionRepository missionRepository;

    public List<Mission> findAll() {
        return missionRepository.findAll();
    }

    public Mission findById(Long id) {
        return missionRepository.findById(id).orElseThrow();
    }

    public Mission create(Mission data) {
        return missionRepository.save(data);
    }

    public Mission update(Long id, Mission data) {
        Mission mission = missionRepository.findById(id).orElseThrow();
        data.setId(mission.getId());
        return missionRepository.save(data);
    }

    public void delete(Long id) {
        missionRepository.deleteById(id);
    }
}
