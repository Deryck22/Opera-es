# Praticando Estruturas Em JAVA

💰 ***Banco Central*** - Sistema Bancário em Java

Este projeto é uma simulação simples de um sistema bancário desenvolvido em **Java**, com foco em **orientação a objetos** e **boas práticas de programação**.  

---

## 📚 **Descrição do Projeto**

O projeto foi desenvolvido com o objetivo de praticar conceitos fundamentais de Java, como:

- Estrutura de classes e objetos;
- Encapsulamento de dados;
- Controle de fluxo com `while` e `switch`;
- Leitura de dados com `Scanner`;
- Boas práticas de design orientado a objetos (OOP).

A aplicação simula uma conta bancária com saldo inicial de R$1000, permitindo interações básicas através de um menu de opções no terminal.
O usuário pode consultar o saldo, realizar depósitos, fazer retiradas e encerrar o programa — tudo via console interativo.

---

## 🏗️ **Tecnologias Utilizadas**

☕ Java SE (Standard Edition)

🧠 Orientação a Objetos (OOP)

🧮 Scanner API para entrada de dados

🖥️ Console interativo


## ⚙️ **Funcionalidades**

✅ Consultar saldo atual  
✅ Depositar um valor na conta  
✅ Retirar um valor (com verificação de saldo)  
✅ Encerrar o programa de forma segura  

---

## 🧩 **Estrutura do Código**

O código é dividido em três classes principais:

| Classe | Função |
|---------|--------|
| **`Banco`** | Classe principal (`main`) — inicia o programa |
| **`ContaBancaria`** | Contém o saldo e os métodos de operação (`depositar`, `sacar`, `getSaldo`) |
| **`MenuBanco`** | Controla o menu, as opções do usuário e a interação com o console |

---

## 🧠 **Lógica de Funcionamento**

1. O programa inicia com um saldo inicial de **R$1000**.  
2. O usuário visualiza o menu principal:  
   - `1` → Consultar saldo  
   - `2` → Depositar  
   - `3` → Retirar  
   - `4` → Sair  
3. Após cada operação, o menu é exibido novamente até que o usuário escolha sair.  
4. O saldo é mantido entre as operações (não reinicia).

---

## 💻 **Como Executar o Projeto**

### 🔹 Pré-requisitos
- Ter o **Java JDK 17** (ou superior) instalado.
- Um editor como **VS Code**, **Eclipse**, **IntelliJ IDEA**, ou terminal com suporte a Java.

### 🔹 Passos
1. Clone este repositório:
   ```bash
   git clone https://github.com/SEU_USUARIO/banco-central-java.git

## 🧰 **Melhorias Futuras**

🔹 Adicionar tratamento de exceções (InputMismatchException)

🔹 Implementar histórico de transações

🔹 Criar interface gráfica (JavaFX ou Swing)

🔹 Adicionar autenticação (login e senha)


## 👨‍💻 Autor

**Deryck Silva**

📍 **Estudante de Desenvolvimento de Sistemas**

📚 **Projeto desenvolvido como prática de lógica e OOP em Java.**

🔗 GitHub: **github.com/Deryck22**
