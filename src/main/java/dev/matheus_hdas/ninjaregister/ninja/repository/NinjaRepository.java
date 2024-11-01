package dev.matheus_hdas.ninjaregister.ninja.repository;

import dev.matheus_hdas.ninjaregister.ninja.model.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepository extends JpaRepository<Ninja, Long> {
}
