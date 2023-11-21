package ao.com.jesusfinda.gestao_vagas.modules.canditate.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ao.com.jesusfinda.gestao_vagas.modules.canditate.CandidateEntity;

@RestController
@RequestMapping("/candidate") 
public class CandidateController {

    @PostMapping("/")
    public void create(@RequestBody CandidateEntity candidateEntity) {
        System.out.println("Candidato");
        System.out.println(candidateEntity.getEmail());
        System.out.println(candidateEntity.getDescription());
    }
    
}
