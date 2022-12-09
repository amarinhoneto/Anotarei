package anotarei.anotarei.service;


import org.springframework.beans.factory.annotation.Autowired;
import anotarei.anotarei.model.Anotacao;
import anotarei.anotarei.repository.AnotacaoRepository;
import java.util.List;
import java.util.Optional;


public class AnotacaoService {
    
    @Autowired
    private AnotacaoRepository repository;

    public List<Anotacao> buscaAnotacaos(){
        return repository.findAll();
    }
    
    public List<Anotacao> buscarAnotacaoPorTitulo(String titulo){
        return repository.findBytitulo(titulo);
    }

    public Optional<Anotacao> buscarPorId(Integer id){
        return repository.findById(id);
    }

    public Anotacao salvar(Anotacao anotacao){
        return repository.save(anotacao);
    }

    public void deletar (Integer id){
        repository.deleteById(id);
    }
}
