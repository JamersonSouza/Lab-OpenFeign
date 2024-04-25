package tech.jamersondev.springFeignLab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Detail {
    String nome;
    Integer frequencia;
    Integer ranking;

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", frequencia=" + frequencia +
                ", ranking=" + ranking;
    }
}
