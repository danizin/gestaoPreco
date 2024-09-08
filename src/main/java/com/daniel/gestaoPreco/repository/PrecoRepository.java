package com.daniel.gestaoPreco.repository;

import com.daniel.gestaoPreco.model.Preco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PrecoRepository extends JpaRepository<Preco, Long> {

    Optional<Preco> findByItemId(Long itemId);
    boolean existsByItemId(Long itemId);
    void deleteByItemId(Long itemId);

}
