
package metodostate;
//essa clase sera o contexto
public class Conta {
    private Estado estado;
    private String numero;
    private double saldo;

    public Conta(String numero) {
        this.estado = new EstadoPrata();
        this.numero = numero;
        this.saldo = 0.0;
    }
    public void depositar(double quantia){
        estado.efetuarDeposito(this, quantia);
        System.out.println("Deposito---"+ quantia);
        System.out.println("Saldo = "+this.saldo);
        System.out.println("Estado = "+ this.estado.getClass().getName());
        System.out.println("___________________________________");
    }
    public void sacar(double quantia){
        estado.efetuarSaque(this, quantia);
        System.out.println("Deposito--- "+ quantia);
        System.out.println("Saldo = "+this.saldo);
        System.out.println("Estado = "+ this.estado.getClass().getName());
         System.out.println("___________________________________");
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
