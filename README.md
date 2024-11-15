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
## 1. Criar Aluno
* **Método**: POST
* **Endpoint**: /alunos
* **Descrição**: Cria um novo aluno no banco de dados.
* **Requisição (Corpo em JSON)**:
  
  ```json
  {
    "nome": "João Silva da Silva",
    "cpf": "1234567890231"
  }
## 2. Listar Todos os Alunos
* **Método**: GET
* **Endpoint**: /alunos
* **Descrição**: Retorna a lista de todos os alunos cadastrados.
* **Resposta**:
  * **Status 200 OK**: Retorna todos os alunos.

  **Exemplo de resposta**:
  
  ```json
  [
    {
      "id": 1,
      "nome": "João Silva Sadasdas",
      "cpf": "123456789023"
    },
    {
      "id": 2,
      "nome": "Maria Oliveira",
      "cpf": "98765432100"
    }
  ]
  
## 3. Buscar Aluno por ID
* **Método**: GET
* **Endpoint**: /alunos/{id}
* **Descrição**: Retorna os detalhes de um aluno específico pelo ID.
* **Exemplo de Requisição**: GET /alunos/2
* **Resposta**:
  * **Status 200 OK**: Retorna os dados do aluno.

  **Exemplo de resposta**:
  
  ```json
  {
    "id": 2,
    "nome": "Maria Oliveira",
    "cpf": "98765432100"
  }
  
## 4. Atualizar Aluno
* **Método**: PUT
* **Endpoint**: /alunos/{id}
* **Descrição**: Atualiza os dados de um aluno existente.
* **Exemplo de Requisição**: PUT /alunos/2
* **Corpo em JSON**:
  
  ```json
  {
    "nome": "Carlos Andrade",
    "cpf": "98765432100"
  }


