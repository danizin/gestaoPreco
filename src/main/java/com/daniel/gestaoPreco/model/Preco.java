package com.daniel.gestaoPreco.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRECO")
public class Preco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long precoId;
    private BigDecimal precoNormal;
    private BigDecimal precoPromocional;
    private LocalDate dataInicioPromocao;
    private LocalDate dataFimPromocao;
    private Long itemId;

    public BigDecimal getPrecoAtualUnitario() {
        LocalDate hoje = LocalDate.now();
        if (precoPromocional != null &&
                dataInicioPromocao != null &&
                dataFimPromocao != null &&
                hoje.isAfter(dataInicioPromocao.minusDays(1)) &&
                hoje.isBefore(dataFimPromocao.plusDays(1))) {
            return precoPromocional;
        }
        return precoNormal;
    }

}
