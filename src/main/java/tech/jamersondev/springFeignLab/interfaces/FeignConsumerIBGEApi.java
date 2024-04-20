package tech.jamersondev.springFeignLab.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(value = "ibge-consumer", url = "${IBGE-API-URL}")
public interface FeignConsumerIBGEApi {

    @GetMapping("{nome}")
    String getNameBySexo(@PathVariable("nome") String nome);

}
