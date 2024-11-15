# CRUD de Alunos - Spring Boot com JPA e PostgreSQL

Este projeto é um exemplo de CRUD (Create, Read, Update, Delete) de alunos, implementado com o Spring Boot, JPA (Java Persistence API) e PostgreSQL. A aplicação permite realizar operações de gerenciamento de alunos, com persistência dos dados em um banco de dados PostgreSQL.

## Requisitos

### Software Necessário
1. **JDK 17**  
   Para compilar e rodar o projeto, você precisa do JDK 11 ou superior. Você pode baixar a versão mais recente do JDK [aqui](https://adoptopenjdk.net/).

2. **Maven 3.6 ou superior**  
   Maven é utilizado para gerenciar as dependências e compilar o projeto. Você pode verificar a versão instalada com o comando:
   ```bash
   mvn -v
## Criar Aluno
* **Método**: POST
* **Endpoint**: /alunos
* **Descrição**: Cria um novo aluno no banco de dados.
* **Requisição (Corpo em JSON)**:
  
  ```json
  {
    "nome": "João Silva Sadasdas",
    "cpf": "1234567890231"
  }

