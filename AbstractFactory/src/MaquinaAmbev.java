
public class MaquinaAmbev implements MaquinaBebida{

    @Override
    public Refrigerante entregaRefrigerente() {
        return new Pepsi();
    }

    @Override
    public Suco entregaSuco() {
        return new DoBom();
    }
    
}
