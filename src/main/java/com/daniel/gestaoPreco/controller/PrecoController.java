package com.daniel.gestaoPreco.controller;

import com.daniel.gestaoPreco.dto.PrecoDto;
import com.daniel.gestaoPreco.service.PrecoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/precos")
public class PrecoController {

    private final PrecoService precoService;

    public PrecoController(PrecoService precoService) {
        this.precoService = precoService;
    }

    @PostMapping("/precificar")
    public ResponseEntity<PrecoDto> cadastrarOuAtualizarPreco(@RequestBody PrecoDto precoDto) {
        PrecoDto preco = precoService.cadastrarOuAtualizarPreco(precoDto);
        return ResponseEntity.ok(preco);
    }

    @GetMapping("/obterPreco/{itemId}")
    public ResponseEntity<PrecoDto> obterPrecoPorItemId(@PathVariable Long itemId) {
        PrecoDto preco = precoService.obterPrecoPorItemId(itemId);
        return ResponseEntity.ok(preco);
    }

    @GetMapping("/obterPrecos")
    public ResponseEntity<List<PrecoDto>> obterPrecos() {
        List<PrecoDto> precoDtos = precoService.obterPrecos();
        return ResponseEntity.ok(precoDtos);
    }

    @DeleteMapping("/excluirPreco/{itemId}")
    public ResponseEntity<String> excluirPreco(@PathVariable Long itemId) {
        precoService.excluirPreco(itemId);
        return ResponseEntity.ok(String.format("Preço excluído com sucesso para o item com ID %d", itemId));
    }

}
