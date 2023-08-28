package br.faccat.sistdist.springbootrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.faccat.sistdist.springbootrestapi.entity.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> { }