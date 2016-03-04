public class Aluno {
    String nome, nmatricula;
    int idade;
    public void imprimirDadosCadastrais(String nome, String nmatricula, int idade){
        System.out.println("NOME:" + this.nome + " - IDADE:"+ this.idade + " - MATRICULA:"+ this.nmatricula);
    }
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.idade = 15;
        a1.nome = "Joao";
        a1.nmatricula = "12121441";
        a1.imprimirDadosCadastrais(a1.nome, a1.nmatricula, a1.idade);
    
        Aluno a2 = new Aluno();
        a2.idade = 18;
        a2.nome = "Beto";
        a2.nmatricula = "883783628";
        a2.imprimirDadosCadastrais(a2.nome, a2.nmatricula, a2.idade);
        
        Aluno a3 = new Aluno();
        a3.idade = 16;
        a3.nome = "Maria";
        a3.nmatricula = "8732898930983";
        a3.imprimirDadosCadastrais(a3.nome, a3.nmatricula, a3.idade);
        
        Aluno a4 = new Aluno();
        a4.idade = 17;
        a4.nome = "José";
        a4.nmatricula = "89892673";
        a4.imprimirDadosCadastrais(a4.nome, a4.nmatricula, a4.idade);
    }
}
