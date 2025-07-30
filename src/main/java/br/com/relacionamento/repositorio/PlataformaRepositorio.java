package br.com.relacionamento.repositorio;

import br.com.relacionamento.entidade.Plataforma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlataformaRepositorio extends JpaRepository<Plataforma,Long> {
}
