package tech.jamersondev.springFeignLab.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import tech.jamersondev.springFeignLab.Util.Conversor;
import tech.jamersondev.springFeignLab.interfaces.FeignConsumerIBGEApi;
import tech.jamersondev.springFeignLab.model.Detail;
import tech.jamersondev.springFeignLab.model.Names;

import java.util.Arrays;
import java.util.List;

public class LabMain {
    private final FeignConsumerIBGEApi ibgeConsumer;
    private final Conversor conversor;

    public LabMain(FeignConsumerIBGEApi ibgeConsumer, Conversor conversor) {
        this.ibgeConsumer = ibgeConsumer;
        this.conversor = conversor;
    }

    public void getNameAndSexo() throws Exception {
        String body = ibgeConsumer.getNameBySexo("Jamerson", "M");
        Names[] data = conversor.getData(body, Names[].class);
        System.out.println(Arrays.toString(data));
    }

    public void getNameRankingByCounty() throws Exception{
        String body = ibgeConsumer.getRankingByCounty("2611606");
        Names[] data = conversor.getData(body, Names[].class);
        for (Names names : Arrays.stream(data).toList()) {
            List<Detail> detail = names.getDetail().stream().map(n -> new Detail(n.name(), n.frequency(),
                    n.ranking())).toList();
            System.out.println(names.getLocality() +"\n"+ detail);
        }
    }

    public void getNameRankingByDecade() throws Exception {
        String body = ibgeConsumer.rankingByDecade(2010);
        Names[] data = conversor.getData(body, Names[].class);
        for (Names names : Arrays.stream(data).toList()) {
            List<Detail> detail = names.getDetail().stream().map(n -> new Detail(n.name(), n.frequency(),
                    n.ranking())).toList();
            System.out.println(names.getLocality() +"\n"+ detail);
        }
    }

    public void getRankingBySexo() throws Exception {
        String body = ibgeConsumer.rankingBySexo("F");
        Names[] data = conversor.getData(body, Names[].class);
        for(Names names : Arrays.stream(data).toList()){
            List<Detail> detail = names.getDetail().stream().map(n -> new Detail(n.name(), n.frequency(),
                    n.ranking())).toList();
            System.out.println(names.getLocality() +"\n" + names.getSexo() +"\n"+ detail);
        }
    }
}
