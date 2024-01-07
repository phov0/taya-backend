package br.com.heitorflorido.interview.usecase;

import br.com.heitorflorido.interview.gateway.ExcluirUsuarioGateway;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import javax.inject.Named;

@Named
@RequiredArgsConstructor
public class ExcluirUsuarioUseCase {
    private final ExcluirUsuarioGateway excluirUsuarioGateway;

    public Mono<Void> execute(Long id) {
        return excluirUsuarioGateway.execute(id);
    }
}
