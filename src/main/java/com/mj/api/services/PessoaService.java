package com.mj.api.services;

import com.mj.api.exceptions.ResourceNotFoundException;
import com.mj.api.models.PessoaModel;
import com.mj.api.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaModel> findALl() {
        return pessoaRepository.findAll();
    }

    public PessoaModel criarPessoa (PessoaModel pessoaModel) {
        return pessoaRepository.save(pessoaModel);
    }

    public void removerPessoa (Long id) {
        pessoaRepository.deleteById(id);
    }

    public PessoaModel atualizarPessoa (Long id, PessoaModel pessoaData) {
        PessoaModel pessoa = pessoaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Pessoa com o Id: " + id + " não existe. . ."));

        pessoa.setNome(pessoaData.getNome());
        pessoa.setIdade(pessoaData.getIdade());

        return pessoaRepository.save(pessoa);
    }
}