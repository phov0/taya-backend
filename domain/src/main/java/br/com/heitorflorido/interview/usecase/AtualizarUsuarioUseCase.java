package br.com.heitorflorido.interview.usecase;

import br.com.heitorflorido.interview.gateway.AtualizarUsuarioGateway;
import br.com.heitorflorido.interview.model.Usuario;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import javax.inject.Named;

@Named
@RequiredArgsConstructor
public class AtualizarUsuarioUseCase {
    private final AtualizarUsuarioGateway atualizarUsuarioGateway;

    public Mono<Usuario> execute(Usuario user) {
        return atualizarUsuarioGateway.execute(user);
    }
}
