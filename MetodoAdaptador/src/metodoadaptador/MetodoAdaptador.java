package metodoadaptador;
public class MetodoAdaptador {
    public static void main(String[] args) {
        Figura ret = new RetanguloAdapter();
        ret.desenhar(10, 5, 20, 0);
        ret= new RetanguloClassAdapter();
        ret.desenhar(10, 5, 20, 0);
        
        
        
        
    }
    
}
