package br.com.heitorflorido.interview.model;

import lombok.Builder;
import lombok.Value;

import java.util.Date;

@Value
@Builder(toBuilder = true)
public class Usuario {

    Long id;
    String nome;
    String dataNascimento;
    String cep;
    String cidade;
    String uf;
}
