package Ex05;

public class Aluno extends Pessoa{

    private String matricula;

    private String registrar(){
        return "Sou o " + super.obterNomeCompleto() + " e minha matrícula é: " + this.matricula;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Pedro";
        aluno.sobrenome = "Lima";
        aluno.matricula = "2023232100";

        System.out.println(aluno.registrar());
    }
}
