public class Banco {
    private double saldo;

    public Banco() {
        this.saldo = 0;
    }
    public boolean deposito(double valor){
        if(valor <=0 )
            return false;
        this.saldo += valor;
        return true;
    }
    public boolean saque(double valor){
        if(valor < saldo || valor == 0) {
            return false;
        }
            this.saldo -= valor;
            return true;
    }
    public double saldo(){
        return this.saldo;
    }
}
