package br.edu.fatecpg.Aplicacao.Jpa;

import br.edu.fatecpg.Aplicacao.Jpa.model.Aluno;
import br.edu.fatecpg.Aplicacao.Jpa.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;@SpringBootApplication
public class AplicacaoJpaApplication {
@SpringBootApplication
public class Aplicacao implements CommandLineRunner {
	@Autowired
	private AlunoRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(AplicacaoJpaApplication.class, args);
	}
	@Override
    public void run(String... args) throws Exception {



	}
}
}
