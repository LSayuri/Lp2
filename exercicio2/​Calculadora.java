public class Calculadora{
    int x, y;
    void soma(){
        System.out.println("A soma dos dois valores e: " + (x+y));
    }
    void subtracao(){
        System.out.println("A subtracao dos dois valores e: " + (x-y));
    }
    void multiplicacao(){
        System.out.println("A multiplicacao dos dois valores e: " + (x*y));
    }
    void divisao(){
        System.out.println("A divisao dos dois valores e: " + (x/y));
    }
    
    public static void main(String[]args){
        Calculadora teste1 = new Calculadora();
        teste1.x=14;
        teste1.y=189;
        teste1.soma();
        teste1.subtracao();
        teste1.multiplicacao();
        teste1.divisao();

        Calculadora teste2 = new Calculadora();
        teste2.x=12;
        teste2.y=15;
        teste2.soma();
        teste2.subtracao();
        teste2.multiplicacao();
        teste2.divisao();       

        Calculadora teste3 = new Calculadora();
        teste3.x=67;
        teste3.y=3;
        teste3.soma();
        teste3.subtracao();
        teste3.multiplicacao();
        teste3.divisao();
    }
}
