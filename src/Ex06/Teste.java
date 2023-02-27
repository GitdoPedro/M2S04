package Ex06;

public class Teste {

    public void validar(String valorCampo, Integer valorMaximoCampo) throws TamanhoInvalidoException{
        if (valorCampo == null || valorMaximoCampo == null ){
            throw new IllegalArgumentException();
        }

        if (valorCampo.length() > valorMaximoCampo){
            throw new TamanhoInvalidoException();
        }
    }

    public static void main(String[] args) {
        Teste teste = new Teste();

        try{
            teste.validar("Pedro",15);
            System.out.println("ok");
        }catch (TamanhoInvalidoException | IllegalArgumentException e){
            System.out.println("not ok");
        }
    }
}
