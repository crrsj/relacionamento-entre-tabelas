package br.com.relacionamento.servico;

import br.com.relacionamento.entidade.Plataforma;
import br.com.relacionamento.repositorio.GameRepositorio;
import br.com.relacionamento.repositorio.PlataformaRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlataformaServico {

    private final PlataformaRepositorio plataformaRepositorio;
    private final GameRepositorio gameRepositorio;

    public Plataforma salvarPlataforma(Long gameId,Plataforma plataforma){
        var game = gameRepositorio.findById(gameId).get();
        plataforma.setGame(game);
        return plataformaRepositorio.save(plataforma);
    }
}
