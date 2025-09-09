package com.mj.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mj.api.model.PessoaModel;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {

}
