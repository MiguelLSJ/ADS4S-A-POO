package com.mj.api.services;

import com.mj.api.models.PessoaModel;
import com.mj.api.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaModel> findALl() {
        return pessoaRepository.findAll();
    }

    public PessoaModel criarPessoa(PessoaModel pessoaModel) {
        return pessoaRepository.save(pessoaModel);
    }
}