package com.upload.file.service;


import com.upload.file.entities.Agente;
import com.upload.file.repository.AgenteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AgenteService {

    @Autowired
    private AgenteRepository agenteRepository;

    public void store(List<Agente> agentes) {
        log.info("Saving agentes into database");
        List<Agente> agentesReturned = agenteRepository.saveAll(agentes);
        agentesReturned.stream().forEach((agente) -> {
            System.out.println(agente.getCodigo().get_text());
            log.info(agente.getCodigo().get_text());
        });
    }
}
