package tech.jamersondev.springFeignLab.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import tech.jamersondev.springFeignLab.Util.Conversor;
import tech.jamersondev.springFeignLab.interfaces.FeignConsumerIBGEApi;
import tech.jamersondev.springFeignLab.model.Names;

import java.util.Arrays;

public class LabMain {
    private final FeignConsumerIBGEApi ibgeConsumer;
    private final Conversor conversor;

    public LabMain(FeignConsumerIBGEApi ibgeConsumer, Conversor conversor) {
        this.ibgeConsumer = ibgeConsumer;
        this.conversor = conversor;
    }

    public void getName() throws JsonProcessingException {
        String body = ibgeConsumer.getNameBySexo("Jamerson");
        Names[] data = conversor.getData(body, Names[].class);
        System.out.println(Arrays.toString(data));
    }
}
