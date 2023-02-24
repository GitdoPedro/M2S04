package Ex03;

public class Produto implements Tributavel{
    @Override
    public double calcularValorComImposto(double valor, double valorImposto) {
        return valor+valorImposto;
    }


    public static void main(String[] args) {
        Produto produto = new Produto();
        System.out.println(produto.calcularValorComImposto(10,5));

    }
}
