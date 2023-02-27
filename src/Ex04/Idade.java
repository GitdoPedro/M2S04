package Ex04;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {

        Idade testeIdade = new Idade();

        try{
            testeIdade.perguntaIdade();

        } catch (Exception e){
            System.out.println(e);
        }

    }

    private void perguntaIdade() throws Exception{
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        boolean valida = false;
        while (valida){
            idade = scanner.nextInt();
            if (idade<= 0 || idade > 100){
                throw new Exception("Idade inválida");
            }else{
                valida = true;

            }
            System.out.println("Olá, vc tem " + idade + " anos");
        }

    }


}
