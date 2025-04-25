# Engenharia_Software
**Membros:**
- Michelle Silva
- Maria Eduarda
- Ramiro
- Bruno Queiroz Pinto

Implementar projeto
# Projeto de Gestão de Reservas de Livros.

Este é um projeto de gestão de reservas, utilizando **Java**, **Hibernate**, **MySQL**, e uma arquitetura baseada em **JPA** (Java Persistence API). O objetivo principal do projeto é realizar operações CRUD (Criar, Ler, Atualizar, Excluir) sobre o sistema de reservas.

### Tecnologias Utilizadas:
- **Java 11**
- **Hibernate ORM**
- **JPA (Java Persistence API)**
- **MySQL** como banco de dados
- **Maven** como gerenciador de dependências

### Descrição do Projeto

Este projeto contém a implementação de um sistema básico de controle de **Reservas**, utilizando a arquitetura **JPA** para persistência de dados no banco de dados MySQL. O projeto oferece as seguintes funcionalidades:

- **CRUD de Reservas**: Inserir, Alterar, Excluir e Buscar por ID ou buscar todas as reservas.
- **Consulta personalizada**: Buscar reservas com filtros específicos, como `nome` ou `cpf`.
  
### Estrutura do Projeto

- **`control/`**: Contém as classes responsáveis pela lógica de controle de dados, implementando as operações CRUD utilizando Hibernate e JPA.
  - **`ReservaControle.java`**: Contém os métodos para manipulação de entidades do tipo `Reserva`.
  - **`RequisicaoControle.java`**, **`UsuarioControle.java`**, etc.: Implementações de controle para outras entidades do sistema.
  
- **`model/`**: Contém as classes de modelo que representam as entidades que serão persistidas no banco de dados.
  - **`Reserva.java`**: A classe de entidade que mapeia a tabela de reservas no banco de dados.
  - **`Requisicao.java`**, **`Usuario.java`**, etc.: Representações de outras tabelas do banco.

- **`persistence.xml`**: Arquivo de configuração do Hibernate e JPA, que define as propriedades de conexão com o banco de dados.

### Pré-Requisitos

- **Java 11 ou superior**
- **MySQL** ou outro banco de dados relacional configurado para o uso do JPA
- **Maven** (para build e gerenciamento de dependências)

### Configuração do Banco de Dados

1. **Criação do Banco de Dados:**

   No MySQL, crie um banco de dados com o nome `projeto`.

   ```sql
   CREATE DATABASE projeto;
