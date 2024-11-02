package dev.matheushdas.ninjaregister.ninja.model;

import dev.matheushdas.ninjaregister.mission.model.Mission;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO {
    private Long id;
    private String name;
    private String email;
    private int age;
    private String imgUrl;
    private Mission mission;
}
