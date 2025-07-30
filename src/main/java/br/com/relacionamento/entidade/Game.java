package br.com.relacionamento.entidade;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private int anoLancamento;
    @OneToMany(mappedBy = "game",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Plataforma>plataformas = new ArrayList<>();
}
