package padroesestruturais.facade;

public class Projeto extends LDC {

    private static Projeto projeto = new Projeto();

    private Projeto() {};

    public static Projeto getInstancia() {
        return projeto;
    }
}
