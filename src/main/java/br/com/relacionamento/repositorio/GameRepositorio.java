package br.com.relacionamento.repositorio;

import br.com.relacionamento.entidade.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepositorio extends JpaRepository<Game,Long> {
}
