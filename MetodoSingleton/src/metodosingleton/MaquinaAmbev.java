package metodosingleton;


import metodosingleton.Suco;


public class MaquinaAmbev implements MaquinaBebida{

    private MaquinaAmbev(){
    }
    private static MaquinaAmbev _INSTANCIA = new MaquinaAmbev();
    public static MaquinaAmbev getInstancia() {
     return _INSTANCIA;
}
    

    @Override
    public Refrigerante entregaRefrigerente() {
        
        return new Pepsi();
    }

    @Override
    public Suco entregaSuco() {
        return new DoBom();
    }
    
}
