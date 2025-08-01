# 🩺 BOILERPLATE-JAVA-SPRING

Criei esse boilerplate para facilitar o início de projetos em Java com Spring Boot, utilizando Clean Architecture e boas práticas de desenvolvimento.

---

## 🧠 Tecnologias Utilizadas

| Camada         | Tecnologia        |
|----------------|-------------------|
| Backend        | Java 21, Spring Boot 3, Gradle |
| Banco de Dados | PostgreSQL        |
| Testes         | JUnit |

---

## 🧱 Clean Architecture

```
├── domain/              # Entidades, interfaces e regras de negócio puras
├── application/         # Casos de uso, dto
├── infrastructure/      # Adaptadores de framework (Spring, DB, REST)
```
---

## ⚙️ Como Rodar o Projeto Localmente

### 1. Pré-requisitos

- Java 21+
- PostgreSQL 14+
- Gradle 7+
- Docker (opcional, para o postgresql e a aplicação com variáveis)

### 2. Clonar o projeto

```bash
git clone https://github.com/janiotech/api-medical-appointments.git
cd boilerplate_java_spring
```

### 3. Variáveis de ambiente

Crie um arquivo .env no diretorio raiz do projeto com as seguintes variáveis:
```env
DB_HOST=postgres
# PostgreSQL
POSTGRES_DB=spring_db
POSTGRES_USER=admin
POSTGRES_PASSWORD=admin
POSTGRES_PORT=5432

# pgAdmin
PGADMIN_DEFAULT_EMAIL=admin@admin.com
PGADMIN_DEFAULT_PASSWORD=admin
PGADMIN_PORT=5050
```

### 4. Configurar o banco de dados

Crie um banco com o nome desejado no PostgreSQL:
```sql
CREATE DATABASE spring_db;
```

### 5. Buildar & Executar a aplicação com docker

Para executar a aplicação com as variáveis de ambiente abra seu terminal na raiz do projeto e execute:
```bash
docker-compose up --build
```
obs: esse comando vai criar o container boilerplate_java_spring com os 3 serviços postgres,pgadmin e spring-app


dica: caso já tenha usado o comando acima e não queira rebuildar seu projeto use:
```bash
docker-compose up -d
```

A aplicação estará disponível em: http://localhost:8080


