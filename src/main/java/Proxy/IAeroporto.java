package Proxy;

import java.util.List;

public interface IAeroporto {
    List<String> obterDadosPessoais();
    List<Float> obterAcentos(Colaborador colaborador);
}
