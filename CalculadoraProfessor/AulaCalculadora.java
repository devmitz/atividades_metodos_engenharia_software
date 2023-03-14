package CalculadoraProfessor;
//package com.mycompany.aulacalculadora;

import java.util.Scanner;

public class AulaCalculadora {

    public static void main(String[] args) {
        float numero1, numero2;
        String operacao;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a sua operação (+) Soma, (-) Subtração, (/) Divisão e (*) Multiplicação");
        operacao = entrada.nextLine();
        System.out.println("Digite o primeiro número: ");
        numero1 = entrada.nextFloat();
        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextFloat();
        System.out.println("--------------------------");
        
        switch(operacao){
            case "+":
            System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
            break;
            
            case "-":
            System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 - numero2);
            break;
            
            case "*":
            System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 * numero2);
            break;
            
            case "/":
            System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 / numero2);
            break;
            
            default:
                System.out.println("Operador invalido");
        }
    }
}
