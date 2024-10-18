package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//ignora no json tudo que não está definido na classe
@JsonIgnoreProperties (ignoreUnknown = true)
//Classe que faz o mapeamento no json
public record DadosSerie(@JsonAlias( "Title") String titulo, @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao ) {



}
