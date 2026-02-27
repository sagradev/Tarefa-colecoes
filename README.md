# 👥 Gerenciador de Pessoas

Projeto desenvolvido em Java com foco em praticar conceitos de **Orientação a Objetos**, **ArrayList**, **Collections** e manipulação de **Strings com Split**.

---

## 📋 Descrição

Aplicação de console que permite ao usuário gerenciar uma lista de pessoas separadas por gênero, além de ordenar nomes inseridos livremente. O sistema conta com um menu interativo para facilitar a navegação.

---

## ⚙️ Funcionalidades

- **Ordenar nomes** — o usuário digita vários nomes separados por vírgula e o sistema os exibe em ordem alfabética
- **Adicionar pessoa** — cadastro de uma pessoa informando nome e gênero no formato `Nome,Gênero`
- **Exibir listas por gênero** — exibe as listas de homens e mulheres cadastrados, ambas em ordem alfabética

---

## 🗂️ Estrutura do Projeto

```
src/
├── Pessoa.java               # Modelo de dados da pessoa
├── GerenciadorPessoas.java   # Lógica de negócio e gerenciamento das listas
└── Main.java                 # Ponto de entrada e menu interativo
```

---

## 🧱 Conceitos Aplicados

- **Orientação a Objetos** — separação de responsabilidades entre as classes
- **ArrayList** — armazenamento dinâmico das listas de pessoas
- **Collections.sort()** — ordenação alfabética das listas
- **String.split()** — separação de entradas por vírgula
- **Scanner** — leitura de dados via console
- **Switch/Case** — controle do menu interativo

---

## 🚀 Como Executar

**Pré-requisitos:** Java JDK 8 ou superior instalado.

```bash
# Compile os arquivos
javac Pessoa.java GerenciadorPessoas.java Main.java

# Execute o programa
java Main
```

---

## 💡 Exemplo de Uso

```
===== MENU =====
1 - Ordenar nomes
2 - Adicionar uma pessoa (Nome,Gênero)
3 - Exibir listas por gênero
0 - Sair
Escolha uma opção: 1

Digite os nomes separados por vírgula: Carlos,Ana,Bruno,Fernanda

***** Nomes Ordenados *****
Ana
Bruno
Carlos
Fernanda
```

---

## 👨‍💻 Autor
Gustavo Rodrigues Gutierrez

Desenvolvido como exercício prático durante o curso de **Desenvolvimento Fullstack** da **EBAC**.