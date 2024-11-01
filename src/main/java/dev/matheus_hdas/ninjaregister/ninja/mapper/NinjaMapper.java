package dev.matheus_hdas.ninjaregister.ninja.mapper;

import dev.matheus_hdas.ninjaregister.ninja.model.Ninja;
import dev.matheus_hdas.ninjaregister.ninja.model.NinjaDTO;
import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {
    public Ninja map(NinjaDTO data) {
        return new Ninja(
                data.getId(),
                data.getName(),
                data.getEmail(),
                data.getAge(),
                data.getImgUrl(),
                data.getMission()
        );
    }

    public NinjaDTO map(Ninja data) {
        return new NinjaDTO(
                data.getId(),
                data.getName(),
                data.getEmail(),
                data.getAge(),
                data.getImgUrl(),
                data.getMission()
        );
    }
}
