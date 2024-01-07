package br.com.heitorflorido.interview.entrypoint.rest;

import br.com.heitorflorido.interview.model.Usuario;
import br.com.heitorflorido.interview.usecase.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class UserController {

    private final ObterUsuarioUseCase obterUsuarioUseCase;
    private final ObterUsuariosUseCase obterUsuariosUseCase;
    private final CriarUsuarioUseCase criarUsuarioUseCase;
    private final AtualizarUsuarioUseCase atualizarUsuarioUseCase;
    private final ExcluirUsuarioUseCase excluirUsuarioUseCase;

    @GetMapping("/usuarios")
    public Flux<Usuario> getUsers() {
        return obterUsuariosUseCase.execute();
    }

    @GetMapping("/usuario/{id}")
    public Mono<Usuario> getUser(final @PathVariable Long id) {
        return obterUsuarioUseCase.execute(id);
    }

    @PostMapping("/salvar")
    public Mono<Usuario> postUser(@RequestBody Usuario user) {

        return criarUsuarioUseCase.execute(user);
    }

    @PutMapping("/atualizar")
    public Mono<Usuario> putUser(@RequestBody Usuario user) {

        return atualizarUsuarioUseCase.execute(user);
    }

    @DeleteMapping("/excluir/{id}")
    public Mono<Void> deleteUser(@PathVariable Long id) {
        return excluirUsuarioUseCase.execute(id);
    }
}
