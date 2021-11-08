package br.fatec.financas3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.fatec.financas3.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository <Conta, Long> {

}
