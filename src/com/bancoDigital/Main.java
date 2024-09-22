package com.bancoDigital;

import com.bancoDigital.model.Conta;
import com.bancoDigital.service.Cliente;
import com.bancoDigital.service.ContaCorrente;
import com.bancoDigital.service.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        //Cliente - Malcon -

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Malcon");

        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente1);

        contaCorrente.depositar(3000);
        contaCorrente.transferir(500, contaPoupanca);

        System.out.println("--- Após depósito e transferência ---");
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}

