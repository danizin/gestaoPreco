package com.daniel.gestaoPreco.dto;

import java.math.BigDecimal;
import java.time.LocalDate;


public record PrecoDto(Long itemId,
                       BigDecimal precoNormal,
                       BigDecimal precoPromocional,
                       LocalDate dataInicioPromocao,
                       LocalDate dataFimPromocao,
                       BigDecimal precoAtualUnitario) {

}
