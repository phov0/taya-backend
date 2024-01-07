package br.com.heitorflorido.interview.gateway.database;

import br.com.heitorflorido.interview.gateway.ExcluirUsuarioGateway;
import br.com.heitorflorido.interview.gateway.database.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import javax.inject.Named;

@Named
@RequiredArgsConstructor
public class ExcluirUsuarioDatabaseGateway implements ExcluirUsuarioGateway {

    private final UsuarioRepository usuarioRepository;

    @Override
    public Mono<Void> execute(Long id) {
       return usuarioRepository.deleteById(id);
    }
}
