package dev.matheus_hdas.ninjaregister.ninja.service;

import dev.matheus_hdas.ninjaregister.ninja.model.Ninja;
import dev.matheus_hdas.ninjaregister.ninja.repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {
    @Autowired
    private NinjaRepository ninjaRepository;

    public List<Ninja> findAll() {
        return ninjaRepository.findAll();
    }

    public Ninja findById(Long id) {
        return ninjaRepository.findById(id).orElseThrow();
    }

    public Ninja create(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }

    public Ninja update(Long id, Ninja updatedNinja) {
        Ninja ninja = ninjaRepository.findById(id).orElseThrow();
        updatedNinja.setId(ninja.getId());
        return ninjaRepository.save(updatedNinja);
    }

    public void delete(Long id) {
        ninjaRepository.deleteById(id);
    }
}
