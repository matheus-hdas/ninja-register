package dev.matheushdas.ninjaregister.ninja.mapper;

import dev.matheushdas.ninjaregister.ninja.model.Ninja;
import dev.matheushdas.ninjaregister.ninja.model.NinjaDTO;
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
