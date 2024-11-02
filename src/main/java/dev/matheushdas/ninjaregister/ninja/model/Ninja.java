package dev.matheushdas.ninjaregister.ninja.model;

import dev.matheushdas.ninjaregister.mission.model.Mission;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_ninja")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(unique = true)
    private String email;

    @Column
    private int age;

    @Column(name = "img_url")
    private String imgUrl;

    @ManyToOne
    @JoinColumn(name = "id_mission")
    private Mission mission;
}
