package br.com.relacionamento.controle;

import br.com.relacionamento.entidade.Plataforma;
import br.com.relacionamento.repositorio.PlataformaRepositorio;
import br.com.relacionamento.servico.PlataformaServico;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/plataformas")
@RequiredArgsConstructor
public class PlataformaControle {

    private final PlataformaServico plataformaServico;

    @PostMapping("/{gameId}")
    public ResponseEntity<Plataforma>salvarPlataforma(@PathVariable Long gameId,@RequestBody Plataforma plataforma){
        var salvar = plataformaServico.salvarPlataforma(gameId, plataforma);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvar);
    }
}
