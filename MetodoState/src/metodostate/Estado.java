
package metodostate;
public abstract class Estado {
    public abstract void efetuarSaque(Conta conta, double quantia);
    public abstract void efetuarDeposito(Conta conta , double quantia);   
}
