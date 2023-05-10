package padroesestruturais.facade;

public class EngSoftFacade {

    public static boolean verificarLDCsTarefas(EngSoft engsoft) {
        if (Codigo.getInstancia().verificarLDCEmFalta(engsoft)) {
            return false;
        }
        if (Projeto.getInstancia().verificarLDCEmFalta(engsoft)) {
            return false;
        }
        if (Git.getInstancia().verificarLDCEmFalta(engsoft)) {
            return false;
        }
        return true;
    }
}
