package Proxy;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AeroportoProxyTest {

    @BeforeEach
    void setUp() {
        BD.addAeroporto(new Aeroporto(1, "Galeao", "Rio de Janeiro", 50.0f, 300.0f));
    }

    @Test
    void retornaDadosPessoaisAeroporto() {
        AeroportoProxy aeroporto = new AeroportoProxy(1);

        assertEquals(Arrays.asList("Galeao", "Rio de Janeiro"), aeroporto.obterDadosPessoais());
    }

    @Test
    void retonaAcentosAeroporto() {
        Colaborador colaborador = new Colaborador("Roberto", true);
        AeroportoProxy aeroporto = new AeroportoProxy(1);

        assertEquals(Arrays.asList(50.0f, 300.0f), aeroporto.obterAcentos(colaborador));
    }

    @Test
    void retonaMenssagemNaoAutorizado() {
        try {
            Colaborador colaborador = new Colaborador("Roberta", false);
            AeroportoProxy aeroporto = new AeroportoProxy(1);

            aeroporto.obterAcentos(colaborador);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Sem permissao de genrente", e.getMessage());
        }
    }
}
