package dev.matheus_hdas.ninjaregister.mission.model;

import dev.matheus_hdas.ninjaregister.ninja.model.Ninja;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_mission")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String rank;

    @OneToMany(mappedBy = "mission")
    private List<Ninja> ninjas;
}
