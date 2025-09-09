package com.mj.api.controllers;

import com.mj.api.models.PessoaModel;
import com.mj.api.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "/pessoas")
@RestController
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    public ResponseEntity<List<PessoaModel>> findAll () {
        List<PessoaModel> response = pessoaService.findALl();
        return ResponseEntity.ok().body(response);
    }
}
