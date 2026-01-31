# App Notes 📝

Aplicação simples de terminal para criação e gerenciamento de notas, desenvolvida em Java com foco em aprendizado e evolução gradual de boas práticas de programação.

## 📌 Funcionalidades

- Criar notas (título e texto)
- Listar notas
- Visualizar nota pelo índice
- Editar título e/ou texto
- Deletar notas
- Menu interativo via terminal

## 🛠️ Tecnologias utilizadas

- Java
- ArrayList
- Scanner
- Programação orientada a objetos

## 🧱 Estrutura do projeto

- `Main`  
  Responsável pela interação com o usuário (menu, entrada de dados e fluxo da aplicação).

- `Notes`  
  Classe modelo que representa uma nota (título e texto).

- `NotesServices`  
  Contém as regras de negócio da aplicação, como listar, editar, visualizar e deletar notas.

## 📈 Evolução do projeto

- **V1**  
  Implementação inicial utilizando arrays e lógica concentrada no `main`.

- **V2 (atual)**  
  - Migração para `ArrayList`
  - Separação de responsabilidades
  - Criação de classes de modelo e serviço
  - Código mais organizado e legível

- **V3 (planejada)**  
  - Persistência de notas em arquivos
  - Melhor separação arquitetural
  - Remoção de entrada de dados (Scanner) da camada de serviço

## ⚠️ Aviso sobre uso de IA

Este projeto contou com **auxílio de inteligência artificial apenas para esclarecimento de dúvidas conceituais e revisão de lógica**.

Nenhum código foi copiado pronto.  
Todas as implementações foram escritas, adaptadas e compreendidas pelo autor como parte do processo de aprendizado.

## 👤 Autor

Desenvolvido por **Apolokll**  
Projeto com fins educacionais 🚀
