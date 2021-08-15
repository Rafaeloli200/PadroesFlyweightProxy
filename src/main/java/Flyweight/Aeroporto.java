package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {

    private List<Colaborador> colaboradores = new ArrayList<>();

    public void matricular(String nomeColaborador, String nomeCidade, String uf) {
        Cidade cidade = CidadeFactory.getCidade(nomeCidade, uf);
        Colaborador colaborador = new Colaborador(nomeColaborador, cidade);
        colaboradores.add(colaborador);
    }

    public List<String> obterColaboradores() {
        List<String> saida = new ArrayList<String>();
        for (Colaborador colaborador : this.colaboradores) {
            saida.add(colaborador.obterColaborador());
        }
        return saida;
    }


}
