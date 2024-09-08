package com.daniel.gestaoPreco.service;


import com.daniel.gestaoPreco.dto.PrecoDto;

import java.util.List;

public interface PrecoService {

    PrecoDto cadastrarOuAtualizarPreco(PrecoDto precoDto);

    PrecoDto obterPrecoPorItemId(Long itemId);

    List<PrecoDto> obterPrecos();

    void excluirPreco(Long itemId);

}
