package br.com.heitorflorido.interview.gateway;

import br.com.heitorflorido.interview.model.Usuario;
import reactor.core.publisher.Mono;

public interface CriarUsuarioGateway {
    Mono<Usuario> execute(Usuario id);
}
