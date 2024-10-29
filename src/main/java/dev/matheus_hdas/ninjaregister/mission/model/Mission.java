package dev.matheus_hdas.ninjaregister.mission.model;

import dev.matheus_hdas.ninjaregister.ninja.model.Ninja;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_mission")
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
