package br.com.heitorflorido.interview.gateway;

import reactor.core.publisher.Mono;

public interface ExcluirUsuarioGateway {
    Mono<Void> execute(Long id);
}
