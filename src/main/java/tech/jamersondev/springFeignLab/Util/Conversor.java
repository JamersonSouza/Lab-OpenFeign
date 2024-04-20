package tech.jamersondev.springFeignLab.Util;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import tech.jamersondev.springFeignLab.interfaces.ConvertDataIBGE;


public class Conversor implements ConvertDataIBGE {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T[] getData(String json, Class<T[]> tClass) throws JsonProcessingException {
        return mapper.readValue(json, tClass);
    }
}
