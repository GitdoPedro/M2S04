package Ex01;

public class ContaCorrente extends Conta implements Operavel{
    
    public double obterSaldoAtual(){
        return super.saldo;
    }


    @Override
    public void depositar(double valor) {
         super.saldo+=valor;
    }

    @Override
    public void sacar(double valor) {

    }
}
