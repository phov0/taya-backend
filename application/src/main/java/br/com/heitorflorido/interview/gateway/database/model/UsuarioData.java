package br.com.heitorflorido.interview.gateway.database.model;

import br.com.heitorflorido.interview.model.Usuario;
import lombok.Builder;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Value
@Builder
@Table("seg_usuario")
public class UsuarioData {

    @Id
    @Column("id_usuario")
    Long id;
    @Column("nm_usuario")
    String nome;
    @Column("dt_nascimento")
    String dataNascimento;
    @Column("cep")
    String cep;
    @Column("ds_cidade")
    String cidade;
    @Column("cd_uf")
    String uf;

    public static UsuarioData toUsuarioData(final Usuario usuario) {

        return UsuarioData.builder()
            .id(usuario.getId())
            .nome(usuario.getNome())
            .dataNascimento(usuario.getDataNascimento())
            .cep(usuario.getCep())
            .cidade(usuario.getCidade())
            .uf(usuario.getUf())
            .build();
    }

    public static Usuario toUsuario(final UsuarioData usuario) {

        return Usuario.builder()
            .id(usuario.getId())
            .nome(usuario.getNome())
            .dataNascimento(usuario.getDataNascimento())
            .cep(usuario.getCep())
            .cidade(usuario.getCidade())
            .uf(usuario.getUf())
            .build();
    }
}
