package br.cefetmg.inf.lista03.p1105;

import java.util.Scanner;

class Banco {
    private int reserva;
    private int credito;
    private int divida;

    public Banco(int reserva) {
        this.reserva = reserva;
        this.credito = 0;
        this.divida = 0;
    }

    public void adicionarCredito(int valor) {
        this.credito += valor;
    }

    public void adicionarDivida(int valor) {
        this.divida += valor;
    }

    public boolean estaLiquido() {
        return (reserva + credito) >= divida;
    }
}

class SistemaBancario {
    private Banco[] bancos;

    public SistemaBancario(int[] reservas) {
        bancos = new Banco[reservas.length];
        for (int i = 0; i < reservas.length; i++) {
            bancos[i] = new Banco(reservas[i]);
        }
    }

    public void processarDebenture(int devedor, int credor, int valor) {
        bancos[devedor - 1].adicionarDivida(valor);
        bancos[credor - 1].adicionarCredito(valor);
    }

    public boolean verificarLiquidez() {
        for (Banco banco : bancos) {
            if (!banco.estaLiquido()) {
                return false;
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int b = sc.nextInt();  // número de bancos
            int n = sc.nextInt();  // número de debêntures

            if (b == 0 && n == 0) {
                break;
            }

            int[] reservas = new int[b];
            for (int i = 0; i < b; i++) {
                reservas[i] = sc.nextInt();
            }

            SistemaBancario sistema = new SistemaBancario(reservas);

            for (int i = 0; i < n; i++) {
                int devedor = sc.nextInt();
                int credor = sc.nextInt();
                int valor = sc.nextInt();
                sistema.processarDebenture(devedor, credor, valor);
            }

            if (sistema.verificarLiquidez()) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        }

        sc.close();
    }
}
