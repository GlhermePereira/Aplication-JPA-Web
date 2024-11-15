package br.edu.fatecpg.Aplicacao.Jpa.record;

public record AlunoDTO(
    Long id,
    String nome,
    String cpf
) {
    // Métodos get são gerados automaticamente, mas você pode adicionar mais lógica, se necessário.
    
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}

