package dev.matheushdas.ninjaregister.mission.service;

import dev.matheushdas.ninjaregister.mission.mapper.MissionMapper;
import dev.matheushdas.ninjaregister.mission.model.Mission;
import dev.matheushdas.ninjaregister.mission.model.MissionDTO;
import dev.matheushdas.ninjaregister.mission.repository.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MissionService {
    @Autowired
    private MissionRepository missionRepository;

    @Autowired
    private MissionMapper missionMapper;

    public List<MissionDTO> findAll() {
        return missionRepository.findAll()
                .stream()
                .map(missionMapper::map)
                .collect(Collectors.toList());
    }

    public MissionDTO findById(Long id) {
        return missionMapper.map(
                missionRepository.findById(id).orElseThrow());
    }

    public MissionDTO create(MissionDTO data) {
        return missionMapper.map(
                missionRepository.save(missionMapper.map(data)));
    }

    public MissionDTO update(Long id, MissionDTO data) {
        Mission mission = missionRepository.findById(id).orElseThrow();
        data.setId(mission.getId());
        return missionMapper.map(
                missionRepository.save(missionMapper.map(data)));
    }

    public void delete(Long id) {
        missionRepository.deleteById(id);
    }
}
