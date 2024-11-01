package dev.matheus_hdas.ninjaregister.mission.mapper;

import dev.matheus_hdas.ninjaregister.mission.model.Mission;
import dev.matheus_hdas.ninjaregister.mission.model.MissionDTO;
import org.springframework.stereotype.Component;

@Component
public class MissionMapper {

    public Mission map(MissionDTO data) {
        return new Mission(
                data.getId(),
                data.getName(),
                data.getRank(),
                data.getNinjas()
        );

    }

    public MissionDTO map(Mission data) {
        return new MissionDTO(
                data.getId(),
                data.getName(),
                data.getRank(),
                data.getNinjas()
        );

    }
}
