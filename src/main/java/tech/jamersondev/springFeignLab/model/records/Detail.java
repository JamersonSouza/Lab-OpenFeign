package tech.jamersondev.springFeignLab.model.records;


import com.fasterxml.jackson.annotation.JsonProperty;

public record Detail(@JsonProperty("periodo") String period, @JsonProperty("frequencia") Integer frequency) {
}
