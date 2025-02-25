# API de Gerenciamento de Clientes

Este projeto implementa uma API RESTful para gerenciamento de clientes utilizando Spring Boot e Lombok.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Web
- Lombok
- Maven

## Estrutura do Projeto

O projeto segue uma arquitetura em camadas:

- **Model**: Representa a entidade Cliente e seus atributos
- **Service**: Contém a lógica de negócio para manipulação dos clientes
- **Controller**: Gerencia os endpoints da API

### ClienteModel

A classe `ClienteModel` representa a entidade Cliente com os seguintes atributos:
- id: Identificador único do cliente
- nome: Nome do cliente
- email: Email do cliente
- telefone: Número de telefone do cliente

### ClienteService

A classe `ClienteService` gerencia uma lista em memória de clientes e fornece métodos para:
- Listar todos os clientes
- Buscar um cliente por ID
- Adicionar um novo cliente
- Remover um cliente

### ClienteController

A classe `ClienteController` expõe os seguintes endpoints:
- `GET /clientes`: Retorna todos os clientes cadastrados
- `GET /clientes/{id}`: Retorna um cliente específico baseado no ID
- `POST /clientes`: Cadastra um novo cliente
- `DELETE /clientes/{id}`: Remove um cliente baseado no ID

## Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/Barros263inf/cp1_spring_lombok
cd cp1_spring_lombok
```

2. Compile e execute o projeto:
```bash
# Com Maven
./mvnw spring-boot:run

```

3. A API estará disponível em `http://localhost:8080`

## Exemplos de Uso

### Listar todos os clientes
```bash
curl -X GET http://localhost:8080/clientes
```

### Buscar cliente por ID
```bash
curl -X GET http://localhost:8080/clientes/1
```

### Cadastrar novo cliente
```bash
curl -X POST http://localhost:8080/clientes \
  -H "Content-Type: application/json" \
  -d '{"nome":"João Silva","email":"joao@email.com","telefone":"(11) 98765-4321"}'
```

### Remover cliente
```bash
curl -X DELETE http://localhost:8080/clientes/1
```

## Configuração Lombok

O projeto utiliza Lombok para reduzir código boilerplate. Certifique-se de que o plugin do Lombok está instalado em sua IDE:

- **IntelliJ IDEA**: Instale o plugin "Lombok" através das configurações
- **Eclipse**: Execute o jar do Lombok e configure a IDE

## Contribuição

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-funcionalidade`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova funcionalidade'`)
4. Push para a branch (`git push origin feature/nova-funcionalidade`)
5. Abra um Pull Request