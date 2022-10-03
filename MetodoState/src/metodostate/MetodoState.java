
package metodostate;
public class MetodoState {
    public static void main(String[] args) {
        
        Conta conta = new Conta("123456");
        
        //efetuando transacoes financerias
        conta.depositar(500.00);
        conta.depositar(300.00);
        conta.depositar(550.00);
        conta.depositar(550.00);
        
        conta.sacar(2000.00);



    }
    
}
