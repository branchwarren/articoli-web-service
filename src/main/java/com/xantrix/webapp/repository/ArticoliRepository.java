package com.xantrix.webapp.repository;

import com.xantrix.webapp.entities.Articoli;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticoliRepository extends PagingAndSortingRepository<Articoli, String> {

    Articoli findByCodArt(String codArt);

    List<Articoli> findByDescrizioneLike(String descrizione, Pageable pageable);

    @Query(value = "SELECT * FROM ARTICOLI WHERE DESCRIZIONE LIKE :desArt", nativeQuery = true)
    List<Articoli> selByDescrizioneLike(@Param("desArt") String descrizione);

}
