package br.com.relacionamento.servico;

import br.com.relacionamento.entidade.Game;
import br.com.relacionamento.repositorio.GameRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameServico {

    private final GameRepositorio gameRepositorio;

    public Game salvarGame(Game game){
        return gameRepositorio.save(game);
    }

    public List<Game>listarGames(){
        return gameRepositorio.findAll();
    }

}
