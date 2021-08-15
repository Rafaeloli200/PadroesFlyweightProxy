package Flyweight;

public class Colaborador {

    private String nome;
    private Cidade cidadeResidencia;

    public Colaborador(String nome, Cidade cidadeResidencia) {
        this.nome = nome;
        this.cidadeResidencia = cidadeResidencia;
    }

    public String obterColaborador() {
        return "Colaborador{" +
                "nome='" + this.nome + '\'' +
                ", cidade='" + cidadeResidencia.getNome() + '\'' +
                ", uf='" + cidadeResidencia.getUf() + '\'' +
                '}';
    }
}
