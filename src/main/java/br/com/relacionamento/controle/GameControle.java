package br.com.relacionamento.controle;

import br.com.relacionamento.entidade.Game;
import br.com.relacionamento.servico.GameServico;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
@RequiredArgsConstructor
public class GameControle {

    private final GameServico gameServico;

    @PostMapping
    public ResponseEntity<Game>salvarGame(@RequestBody Game game){
        var salvar = gameServico.salvarGame(game);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvar);
    }
    @GetMapping
    public ResponseEntity<List<Game>>listarGames(){
        return ResponseEntity.status(HttpStatus.OK).body(gameServico.listarGames());
    }
}
