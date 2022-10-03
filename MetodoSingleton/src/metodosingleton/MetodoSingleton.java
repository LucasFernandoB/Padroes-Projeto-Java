
package metodosingleton;

public class MetodoSingleton {
    public static void main(String[] args) {
        ClientQuiosque a = new ClientQuiosque();
        a.tipo = MaquinaCocaCola.getInstancia();
        System.out.println("Bebida: " +a.pegarRefri());
        System.out.println("bebida: " +a.pegarSuco());
        
        a.tipo = MaquinaAmbev.getInstancia();
        System.out.println("Bebida: " +a.pegarRefri());
        System.out.println("bebida: " +a.pegarSuco());
    }
    
}
