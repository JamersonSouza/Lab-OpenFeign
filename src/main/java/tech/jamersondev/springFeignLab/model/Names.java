package tech.jamersondev.springFeignLab.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.jamersondev.springFeignLab.model.records.Detail;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Names {
    @JsonProperty("nome")
    private String name;
    private String sexo;
    @JsonProperty("localidade")
    private String locality;
    @JsonProperty("res")
    private List<Detail> detail;

    @Override
    public String toString() {
        return
                "Nome='" + name + '\'' +
                ", Sexo='" + sexo + '\'' +
                ", Localidade='" + locality + '\'' +
                ", Result=" + detail
                ;
    }
}
