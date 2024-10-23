package com.projetotic.crud.controllers;

import com.projetotic.crud.models.PessoaModel;
import com.projetotic.crud.repositories.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
@CrossOrigin("*")
@AllArgsConstructor
public class PessoaController {
    private PessoaRepository pessoaRepository;

    @GetMapping
    public ResponseEntity<List<PessoaModel>> pegaTodasAsPessoas() {
        return new ResponseEntity<>(pessoaRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PessoaModel> criaNovaPessoa(@RequestBody PessoaModel novaPessoa) {
//        novaPessoa.setId(null);
        return new ResponseEntity<>(pessoaRepository.save(novaPessoa), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<PessoaModel> editaPessoa(@RequestBody PessoaModel novaPessoa) {
        return new ResponseEntity<>(pessoaRepository.save(novaPessoa), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deletaPessoa(@PathVariable Integer id) {

        pessoaRepository.deleteById(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
