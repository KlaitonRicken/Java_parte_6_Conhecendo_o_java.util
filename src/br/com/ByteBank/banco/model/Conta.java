package br.com.ByteBank.banco.model;

public abstract class Conta implements Comparable<Conta>{

    protected double saldo;
    protected int agencia;
    protected int numero;
    protected Cliente titular;
    protected static int total = 0;

    public Conta(int agencia, int numero){
        Conta.total++;
//        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
//        System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor) throws SaldoInsuficienteException;

    public void saca(double valor) throws SaldoInsuficienteException {
    	
        if(this.saldo < valor) {
           throw new SaldoInsuficienteException("Saldo Insuficiente. \nSaldo:  " + this.saldo +
        		   "\nValor da tentativa de saque: " + valor);
        }
        
        this.saldo -= valor;
       
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }
    
    @Override
    public boolean equals(Object ref) {
    	
    	Conta c = (Conta) ref; 
    	
    	if(c != this) {
    		if(this.agencia != c.agencia) 
	    		return false;
	    	if(this.numero != c.numero)
	    		return false;
	    	
	    	return true;
    	}
    	
    	return false;
    }
    
    @Override
    public int compareTo(Conta o) {
    	return Double.compare(this.saldo, o.saldo);
    }

	public String toString() {
		return this.getNumero() +
				"\nAgência: " + this.getAgencia() +
				"\nTitular: " + this.getTitular().getNome() +
				"\nSaldo: " + this.getSaldo() + " R$";
	}

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

}