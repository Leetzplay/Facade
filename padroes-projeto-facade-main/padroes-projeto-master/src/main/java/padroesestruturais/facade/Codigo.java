package padroesestruturais.facade;

public class Codigo extends LDC {

    private static Codigo codigo = new Codigo();

    private Codigo() {};

    public static Codigo getInstancia() {
        return codigo;
    }

}
