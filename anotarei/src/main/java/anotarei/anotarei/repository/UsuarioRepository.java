package anotarei.anotarei.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import anotarei.anotarei.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
