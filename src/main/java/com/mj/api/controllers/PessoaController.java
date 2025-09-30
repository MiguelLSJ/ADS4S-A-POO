package com.mj.api.controllers;

import com.mj.api.models.PessoaModel;
import com.mj.api.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping (path = "/listar")
    public List<PessoaModel> findAll () {
        return pessoaService.findALl();
    }

    @PostMapping (path = "/new")
    public PessoaModel criarPessoa (@RequestBody PessoaModel pessoaModel) {
        System.out.println("[LOG] Received: " + pessoaModel.getNome());
        return pessoaService.criarPessoa(pessoaModel);
    }

    @DeleteMapping (path = "/delete/{id}")
    public void removerPessoa (@PathVariable Long id) {
        pessoaService.removerPessoa(id);
    }

    @PutMapping (path = "/update/{id}")
    public PessoaModel atualizarPessoa (@PathVariable Long id,@RequestBody PessoaModel pessoaData) {
        return pessoaService.atualizarPessoa(id, pessoaData);
    }
}
