package dev.matheushdas.ninjaregister.ninja.service;

import dev.matheushdas.ninjaregister.ninja.mapper.NinjaMapper;
import dev.matheushdas.ninjaregister.ninja.model.Ninja;
import dev.matheushdas.ninjaregister.ninja.model.NinjaDTO;
import dev.matheushdas.ninjaregister.ninja.repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NinjaService {
    @Autowired
    private NinjaRepository ninjaRepository;

    @Autowired
    private NinjaMapper ninjaMapper;

    public List<NinjaDTO> findAll() {
        return ninjaRepository.findAll().stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
    }

    public NinjaDTO findById(Long id) {
        return ninjaMapper.map(
                ninjaRepository.findById(id).orElseThrow());
    }

    public NinjaDTO create(NinjaDTO ninjaDTO) {
        return ninjaMapper.map(
                ninjaRepository.save(
                        ninjaMapper.map(ninjaDTO)));
    }

    public NinjaDTO update(Long id, NinjaDTO updated) {
        Ninja ninja = ninjaRepository.findById(id).orElseThrow();
        updated.setId(ninja.getId());
        return ninjaMapper.map(ninjaRepository.save(ninjaMapper.map(updated)));
    }

    public void delete(Long id) {
        ninjaRepository.deleteById(id);
    }
}
