package br.edu.fatecpg.Aplicacao.Jpa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.edu.fatecpg.Aplicacao.Jpa.model.Aluno;
import br.edu.fatecpg.Aplicacao.Jpa.record.AlunoDTO;
import br.edu.fatecpg.Aplicacao.Jpa.repository.AlunoRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
 
@RestController
@RequestMapping("/alunos")
public class AlunoController {
 
    @Autowired
    private AlunoRepository repository;
 
    // CREATE - Adiciona um novo aluno
    @PostMapping
    public Aluno createAluno(@RequestBody Aluno aluno) {
        return repository.save(aluno);
    }
 
    // READ - Retorna todos os alunos
    @GetMapping
    public List<Aluno> getAllAlunos() {
        return repository.findAll();
    }
 

/* @GetMapping("/alunos")
public List<AlunoDTO> retornaAlunos() {
    return repository.findAll()
        .stream()
        .map(aluno -> new AlunoDTO(aluno.getId(), aluno.getNome(), aluno.getCpf()))
        .collect(Collectors.toList());
} */

    // READ - Retorna um aluno específico pelo ID
    @GetMapping("/{id}")
    public Optional<Aluno> getAlunoById(@PathVariable Long id) {
        return repository.findById(id);
    }
 
    // UPDATE - Atualiza as informações de um aluno específico
    @PutMapping("/{id}")
    public Aluno updateAluno(@PathVariable Long id, @RequestBody Aluno alunoAtualizado) {
        return repository.findById(id)
                .map(aluno -> {
                    aluno.setNome(alunoAtualizado.getNome());
                    aluno.setCpf(alunoAtualizado.getCpf());
                    return repository.save(aluno);
                })
                .orElseGet(() -> {
                    alunoAtualizado.setId(id);
                    return repository.save(alunoAtualizado);
                });
    }
 
    // DELETE - Remove um aluno específico
    @DeleteMapping("/{id}")
    public void deleteAluno(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
