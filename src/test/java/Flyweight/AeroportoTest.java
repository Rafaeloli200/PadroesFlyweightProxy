package Flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AeroportoTest {

    @Test
    void deveRetornarColaboradores() {
        Aeroporto aeroporto = new Aeroporto();
        aeroporto.matricular("Leandro", "Juiz de Fora", "MG");
        aeroporto.matricular("Carlos", "Juiz de Fora", "MG");
        aeroporto.matricular("Marcia", "Sao Paulo", "SP");

        List<String> saida = Arrays.asList(
                "Colaborador{nome='Leandro', cidade='Juiz de Fora', uf='MG'}",
                "Colaborador{nome='Carlos', cidade='Juiz de Fora', uf='MG'}",
                "Colaborador{nome='Marcia', cidade='Sao Paulo', uf='SP'}");

        assertEquals(saida, aeroporto.obterColaboradores());
    }

    @Test
    void deveRetornarTotalCidades() {
        Aeroporto aeroporto = new Aeroporto();
        aeroporto.matricular("Leandro", "Juiz de Fora", "MG");
        aeroporto.matricular("Carlos", "Juiz de Fora", "MG");
        aeroporto.matricular("Marcia", "Sao Paulo", "SP");

        assertEquals(2, CidadeFactory.getTotalCidades());
    }

}
