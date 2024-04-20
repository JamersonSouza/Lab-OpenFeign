package tech.jamersondev.springFeignLab.model;

import tech.jamersondev.springFeignLab.model.records.Detail;

import java.util.List;

public class Names {
    private String nome;
    private String sexo;
    private String localidade;
    private List<Detail> res;

    public Names() {
    }

    public Names(String nome, String sexo, String localidade, List<Detail> res) {
        this.nome = nome;
        this.sexo = sexo;
        this.localidade = localidade;
        this.res = res;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public List<Detail> getRes() {
        return res;
    }

    public void setRes(List<Detail> res) {
        this.res = res;
    }

    @Override
    public String toString() {
            return
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", localidade='" + localidade + '\'' +
                ", res=" + res
               ;
    }
}
