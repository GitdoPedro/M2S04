package Ex01;

public class ContaCorrente extends Conta implements Operavel{
    
    public double obterSaldoAtual(){
        return saldo;
    }


    @Override
    public void depositar(double valor) {
         saldo+=valor;
    }

    @Override
    public void sacar(double valor) {
        saldo-=valor;
    }
}
