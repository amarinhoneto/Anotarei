package anotarei.anotarei.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import anotarei.anotarei.model.Anotacao;
import anotarei.anotarei.repository.AnotacaoRepository;
import java.util.List;
import java.util.Optional;

@Service
public class AnotacaoService {
    
    @Autowired
    private AnotacaoRepository repository;

    public List<Anotacao> buscarAnotacoes(){
        return repository.findAll();
    }
    
    public List<Anotacao> buscarAnotacaoPorTitulo(String titulo){
        return repository.findByTitulo(titulo);
    }

    public Optional<Anotacao> buscarAnotacaoPorId(Integer id){
        return repository.findById(id);
    }

    public Anotacao salvarAnotacao(Anotacao anotacao){
        return repository.save(anotacao);
    }

    public void deletarAnotacao (Integer id){
        repository.deleteById(id);
    }
}
