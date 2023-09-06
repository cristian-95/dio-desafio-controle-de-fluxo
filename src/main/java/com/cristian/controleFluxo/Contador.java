package com.cristian.controleFluxo;

import com.cristian.controleFluxo.exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException ex) {
            System.err.println("ERRO: " + ex.getMessage());
        }
    }

    static void contar(int param1, int param2) throws ParametrosInvalidosException {
        if (param2 < param1) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = param2 - param1;
            System.out.println();
            for (int i = 0; i < contagem; i++) {
                System.out.println("i = " + i);
            }
        }
    }


}
