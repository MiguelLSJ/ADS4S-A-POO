package com.mj.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mj.api.models.PessoaModel;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {

}
