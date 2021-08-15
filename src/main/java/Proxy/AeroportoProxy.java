package Proxy;

import java.util.List;

public class AeroportoProxy implements IAeroporto {

    private Aeroporto aeroporto;

    private Integer id;

    public AeroportoProxy(Integer id) {
        this.id = id;
    }

    @Override
    public List<String> obterDadosPessoais() {
        if (this.aeroporto == null) {
            this.aeroporto = new Aeroporto(this.id);
        }
        return this.aeroporto.obterDadosPessoais();
    }

    @Override
    public List<Float> obterAcentos(Colaborador colaborador) {
        if (!colaborador.isGerente()) {
            throw new IllegalArgumentException("Sem permissao de genrente");
        }
        if (this.aeroporto == null) {
            this.aeroporto = new Aeroporto(this.id);
        }
        return this.aeroporto.obterAcentos(colaborador);
    }
}
