package anotarei.anotarei.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import anotarei.anotarei.model.Anotacao;
import java.util.List;

public interface AnotacaoRepository extends JpaRepository<Anotacao, Integer> {

    @Query (value = "SELECT * FROM Anotacao HERE titulo = ?1" , nativeQuery = true)
    List<Anotacao> findBytitulo(String titulo);
}
