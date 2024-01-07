package br.com.heitorflorido.interview.gateway.database.repository;

import br.com.heitorflorido.interview.gateway.database.model.UsuarioData;
import br.com.heitorflorido.interview.model.Usuario;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

public interface UsuarioRepository extends ReactiveCrudRepository<UsuarioData, Long> {
    Mono<UsuarioData> findByNome(String nome);

}
