package anotarei.anotarei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import anotarei.anotarei.service.AnotacaoService;

@RestController
@RequestMapping (value = "/anotacao")
public class AnotacaoController {
    
    @Autowired
    private AnotacaoService service;

    public AnotacaoController(AnotacaoService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<?> buscarAnotacoes(){
        return ResponseEntity.ok(service.buscarAnotacoes());
    }

}
