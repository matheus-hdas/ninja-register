package dev.matheus_hdas.ninjaregister.ninja.model;

import dev.matheus_hdas.ninjaregister.mission.model.Mission;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_ninja")
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private int age;

    @ManyToOne
    @JoinColumn(name = "id_mission")
    private Mission mission;

    public Ninja(String name, String emal, int age) {
        this.name = name;
        this.email = emal;
        this.age = age;
    }
    public Ninja() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ninja ninja = (Ninja) o;
        return age == ninja.age && Objects.equals(name, ninja.name) && Objects.equals(email, ninja.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, age);
    }
}
