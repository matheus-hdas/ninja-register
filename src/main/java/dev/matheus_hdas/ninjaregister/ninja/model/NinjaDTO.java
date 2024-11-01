package dev.matheus_hdas.ninjaregister.ninja.model;

import dev.matheus_hdas.ninjaregister.mission.model.Mission;
import jakarta.persistence.*;
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
