
public class AbstractFactory {

    public static void main(String[] args) {
 
        ClientQuiosque a = new ClientQuiosque();
        a.tipo = new MaquinaCocaCola();
        System.out.println("Bebida: " +a.pegarRefri());
        System.out.println("bebida: " +a.pegarSuco());
        
        a.tipo = new MaquinaAmbev();
        System.out.println("Bebida: " +a.pegarRefri());
        System.out.println("bebida: " +a.pegarSuco());
    }
    
}
