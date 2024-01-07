package br.com.heitorflorido.interview.usecase;

import br.com.heitorflorido.interview.gateway.ObterUsuariosGateway;
import br.com.heitorflorido.interview.model.Usuario;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

import javax.inject.Named;

@Named
@RequiredArgsConstructor
public class ObterUsuariosUseCase {

    private final ObterUsuariosGateway obterUsuariosGateway;

    public Flux<Usuario> execute() {
        return obterUsuariosGateway.execute();
    }
}
