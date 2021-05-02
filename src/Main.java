importa java.util.Scanner;

public class Main {
    private double saldo;
    private double saque;
    Scanner entrada = new Scanner(System.in);

    public void sacar(double valor){
        if (saldo >= valor){
            saldo -=valor;
            System.out.println("Valor sacado: " +valor + "\n");
            System.out.println("Novo saldo: " + saldo);
        }
    }
    public void depositar(double valor){
        saldo += valor;
        System.out.println("Valor depositado: " +valor + "\n");
        System.out.println("Novo saldo: " + saldo);
    }
}
