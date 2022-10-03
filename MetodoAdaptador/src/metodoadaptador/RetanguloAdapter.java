
package metodoadaptador;
public class RetanguloAdapter implements Figura{
    
    RetanguloLegado  legado;

    public RetanguloAdapter() {
        this.legado = new RetanguloLegado();
    }
    

    @Override
    public void desenhar(int xse, int yse, int xid, int yid) {
        System.out.println("Metodo desenhar NOVO ( object adapter)");
        int comprimento=xid - xse;
        int altura = yse - yid;
        
        this.legado.desenhar(xse, yse, comprimento, altura);

    }
    
}
