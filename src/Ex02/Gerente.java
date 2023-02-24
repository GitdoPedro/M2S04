package Ex02;

public final class Gerente extends Funcionario{
    protected String obterCargo(){
        return "Sou Gerente";
    }
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        System.out.println(gerente.obterCargo());
    }




}

