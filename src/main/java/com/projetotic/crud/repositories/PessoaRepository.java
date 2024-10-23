package com.projetotic.crud.repositories;

import com.projetotic.crud.models.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository <PessoaModel, Integer> {

}
