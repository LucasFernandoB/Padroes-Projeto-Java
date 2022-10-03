
package metodoadaptador;
public class RetanguloClassAdapter extends  RetanguloLegado implements Figura{
    
     @Override
     public void desenhar(int xse, int yse, int xid, int yid){
         System.out.println("Metodo desenhar NOVO class adapter");
         int comprimento=xid - xse;
         int altura = yse - yid;
         super.desenhar(xse, yse, comprimento, altura);
        
         
     }
    
    
    
}
