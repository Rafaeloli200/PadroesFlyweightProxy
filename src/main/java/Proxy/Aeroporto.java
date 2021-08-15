package Proxy;

import java.util.Arrays;
import java.util.List;

public class Aeroporto implements IAeroporto {

    private Integer id;
    private String nome;
    private String cidade;
    private Float acentosClasseA;
    private Float acentosClasseB;

    public Aeroporto(int id) {
        this.id = id;
        Aeroporto objeto = BD.getAeroporto(id);
        this.nome = objeto.nome;
        this.cidade = objeto.cidade;
        this.acentosClasseA = objeto.acentosClasseA;
        this.acentosClasseB = objeto.acentosClasseB;
    }

    public Aeroporto(Integer id, String nome, String cidade, Float acentosClasseA, Float acentosClasseB) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.acentosClasseA = acentosClasseA;
        this.acentosClasseB = acentosClasseB;
    }

    public Integer getMatricula() {
        return id;
    }

    @Override
    public List<String> obterDadosPessoais() {
        return Arrays.asList(this.nome, this.cidade);
    }

    @Override
    public List<Float> obterAcentos(Colaborador colaborador) {
        return Arrays.asList(this.acentosClasseA, this.acentosClasseB);
    }
}
