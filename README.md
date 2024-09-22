# Criando um Banco Digital com Java e Orientação a Objetos

Este projeto faz parte do **Bootcamp Claro - Java com Spring Boot** da [Digital Innovation One (DIO)](https://www.dio.me/). O desafio proposto tem como objetivo implementar um sistema de Banco Digital utilizando os 4 pilares da programação orientada a objetos (OOP): **Herança**, **Polimorfismo**, **Abstração** e **Encapsulamento**.

## Descrição do Desafio

O projeto consiste na criação de um sistema de contas bancárias que permita realizar operações básicas como **depósitos**, **saques**, **transferências** entre contas e a geração de **extratos**. Foram implementados os seguintes elementos principais:

- **Conta**: Uma classe abstrata que define os métodos e atributos comuns a todas as contas bancárias, como agência, número da conta, saldo e cliente.
- **ContaCorrente** e **ContaPoupanca**: Classes que estendem a classe `Conta` e fornecem uma implementação específica para a impressão de extratos.
- **Cliente**: Classe que representa o cliente do banco, associada às contas.
- **Banco**: Classe que armazena informações sobre o banco e as contas associadas.
- **IConta**: Interface que define as operações que toda conta deve implementar, como sacar, depositar e transferir.

## Funcionalidades Implementadas

1. **Depósito**: Adicionar saldo a uma conta.
2. **Saque**: Subtrair saldo de uma conta.
3. **Transferência**: Transferir valores entre contas correntes e/ou poupança.
4. **Extrato**: Exibir o extrato detalhado das contas.
5. **Polimorfismo**: As classes `ContaCorrente` e `ContaPoupanca` utilizam o mesmo conjunto de métodos definidos na interface `IConta`, garantindo flexibilidade no tratamento de diferentes tipos de contas.


