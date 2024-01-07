package br.com.heitorflorido.interview.usecase;

import br.com.heitorflorido.interview.gateway.CriarUsuarioGateway;
import br.com.heitorflorido.interview.gateway.ObterUsuarioGateway;
import br.com.heitorflorido.interview.model.Usuario;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import javax.inject.Named;

@Named
@RequiredArgsConstructor
public class CriarUsuarioUseCase {
    private final CriarUsuarioGateway criarUsuarioGateway;

    public Mono<Usuario> execute(Usuario user) {
        return criarUsuarioGateway.execute(user);
    }
}
