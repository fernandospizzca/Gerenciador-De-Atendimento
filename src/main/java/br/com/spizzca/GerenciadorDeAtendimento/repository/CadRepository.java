package br.com.spizzca.GerenciadorDeAtendimento.repository;

import br.com.spizzca.GerenciadorDeAtendimento.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CadRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNomeContainingIgnoreCase(final String nome);
}
