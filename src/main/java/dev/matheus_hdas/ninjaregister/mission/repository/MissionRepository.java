package dev.matheus_hdas.ninjaregister.mission.repository;

import dev.matheus_hdas.ninjaregister.mission.model.Mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionRepository extends JpaRepository<Mission, Long> {}
