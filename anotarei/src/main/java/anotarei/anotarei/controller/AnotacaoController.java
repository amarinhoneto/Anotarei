package anotarei.anotarei.controller;

import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import anotarei.anotarei.service.AnotacaoService;
import jakarta.validation.Valid;

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

    @GetMapping(value = "/buscar/{id}")
    public ResponseEntity<?> buscarAnotacaoPorId(@PathVariable Integer id){
        return ResponseEntity.ok(service.buscarAnotacaoPorId(id));
    }

    @GetMapping(value = "/buscar-titulo/{titulo}")
    public ResponseEntity<?> buscarAnotacaoPorTitulo(@PathVariable String titulo){
        return ResponseEntity.ok(service.buscarAnotacaoPorTitulo(titulo));
    }

}
