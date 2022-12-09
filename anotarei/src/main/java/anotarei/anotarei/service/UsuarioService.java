package anotarei.anotarei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import anotarei.anotarei.model.Usuario;
import anotarei.anotarei.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> buscarNick(){
        return repository.findAll();
    }
    
}