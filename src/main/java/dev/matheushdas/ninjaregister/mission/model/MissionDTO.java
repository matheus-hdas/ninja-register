package dev.matheushdas.ninjaregister.mission.model;

import dev.matheushdas.ninjaregister.ninja.model.Ninja;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissionDTO {
    private Long id;
    private String name;
    private String rank;
    private List<Ninja> ninjas;
}
