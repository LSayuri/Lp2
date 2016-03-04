public class ContaBancaria2 {
    int CONTA_CORRENTE, AGENCIA;
    double saldo, limiteExtra;
    String TITULAR;
    
    public void imprimirAgencia(int AGENCIA){
        System.out.println("A agência é: " + this.AGENCIA);
    }
    public void imprimirContaCorrente(int CONTA_CORRENTE){
        System.out.println("A conta-corrente é: "+ this.CONTA_CORRENTE);
    }
    public void imprimirTitular(String TITULAR){
        System.out.println("O titular da conta é: " + this.TITULAR);
    }
    public void imprimirSaldo(double saldo){
        System.out.println("Saldo: "+ this.saldo);
    }
    public void imprimirSaldoTotal(double saldo, double limiteExtra){
        double soma = this.saldo + this.limiteExtra;
        System.out.println("O saldo total é: "+ soma);
    }
    public static void main(String[] args) {
	 	ContaBancaria2 c1 = new ContaBancaria2();
    c1.TITULAR = "JOSE";
		c1.AGENCIA=399393;
		c1.CONTA_CORRENTE=3733029;
		c1.saldo=1000.00;
		c1.limiteExtra=200.00;
		c1.imprimirTitular(c1.TITULAR);
		c1.imprimirAgencia(c1.AGENCIA);
		c1.imprimirContaCorrente(c1.CONTA_CORRENTE);
		c1.imprimirSaldo(c1.saldo);
		c1.imprimirSaldoTotal(c1.saldo, c1.limiteExtra);
		
		ContaBancaria2 c2 = new ContaBancaria2();
    c2.TITULAR="MARIA";
		c2.AGENCIA=8393989378;
		c2.CONTA_CORRENTE=24363892;
		c2.saldo=50000.00;
		c2.limiteExtra=400.00;
		c2.imprimirTitular(c2.TITULAR);
		c2.imprimirAgencia(c2.AGENCIA);
		c2.imprimirContaCorrente(c2.CONTA_CORRENTE);
		c2.imprimirSaldo(c2.saldo);
		c2.imprimirSaldoTotal(c2.saldo, c2.limiteExtra);
    }
