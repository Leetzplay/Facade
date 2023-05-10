package padroesestruturais.facade;

public class Git extends LDC {

    private static Git git = new Git();

    private Git() {};

    public static Git getInstancia() {
        return git;
    }
}
