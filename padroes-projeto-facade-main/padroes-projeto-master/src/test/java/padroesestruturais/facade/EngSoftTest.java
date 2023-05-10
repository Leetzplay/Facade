package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EngSoftTest {

    @Test
    void deveRetornarFaltaProjetoTarefas() {
        EngSoft engsoft = new EngSoft();
        Git.getInstancia().addLDCEmFalta(engsoft);

        assertEquals(false, engsoft.apresentar());
    }

    @Test
    void deveRetornarFaltaCodigoTarefas() {
        EngSoft engsoft = new EngSoft();
        Codigo.getInstancia().addLDCEmFalta(engsoft);

        assertEquals(false, engsoft.apresentar());
    }

    @Test
    void deveRetornarFaltaGitTarefas() {
        EngSoft engsoft = new EngSoft();
        Projeto.getInstancia().addLDCEmFalta(engsoft);

        assertEquals(false, engsoft.apresentar());
    }

    @Test
    void deveRetornarEngSoftApresentaTodosLDCs() {
        EngSoft engsoft = new EngSoft();

        assertEquals(true, engsoft.apresentar());
    }

}