## Case 1 – Simulador de Caixa Eletrônico 

# Descrição
Este projeto é um simulador de caixa eletrônico feito em Java. Ele permite ao usuário realizar operações básicas de uma conta bancária, como consultar saldo, depositar, sacar e sair do sistema.  
O objetivo é praticar POO (Programação Orientada a Objetos), uso de classes e métodos, menu com switch e entrada de dados com Scanner.

## Funcionalidades

- Consultar saldo atual
- Depositar valores na conta
- Sacar valores da conta, com validação de saldo suficiente
- Menu interativo com opção de sair

## Tecnologias

- Java 17+
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Controle de versão: Git / GitHub

## Como executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/Lanzoni15/case-caixa-eletronico.git
   ```
2. Abra o projeto na sua IDE de preferência.
3. Compile e execute a classe Principal.java.
4. Siga as instruções do menu no console.

## Estrutura do Projeto
   ```bash
│
├── Principal.java       # Classe principal com o menu
├── CaixaEletronico.java # Classe com atributos e métodos de operação
└── README.md            # Este arquivo
```

## Print do Programa
```bash
Seu saldo atual: R$2500.0
Opções:
1- Consultar Saldo
2- Depositar
3- Sacar
4- Sair
Digite uma opção:
```

## Evolução / Próximos Passos

- Refatorar métodos de depósito e saque para atualizar saldo diretamente na classe
- Adicionar tratamento de entradas inválidas (letras, números negativos)
- Adicionar histórico de transações
- Próximos cases: cadastro de produtos, boletim escolar, sistema de funcionários

