package metodoadaptador;
public class RetanguloLegado {
    public void desenhar(int x1, int y1, int comprimento, int altura){
        System.out.println("Metodo desenhar LEGADO ");
        int p2x=x1+comprimento;
        int p3y= y1-altura;
        int p4x= x1+comprimento;
        int p4y= y1-altura;
        
        System.out.println("p1("+x1+","+y1+")...p2("+p2x+","+y1+")");
        System.out.println("p3("+x1+","+p3y+")...p4("+p4x+","+p4y+")");
    }
    
}
