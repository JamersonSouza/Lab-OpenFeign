package tech.jamersondev.springFeignLab.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "ibge-consumer", url = "${IBGE-API-URL}")
public interface FeignConsumerIBGEApi {

    @GetMapping("{nome}")
    String getNameBySexo(@PathVariable("nome") String nome, @RequestParam(required = false) String sexo);

    @GetMapping("ranking/")
    String getRankingByCounty(@RequestParam(name = "localidade", required = false) String county);

    @GetMapping("ranking/")
    String rankingByDecade(@RequestParam(name = "decada",required = false) Integer decade);

    @GetMapping("ranking/")
    String rankingBySexo(@RequestParam(required = false) String sexo);
}
