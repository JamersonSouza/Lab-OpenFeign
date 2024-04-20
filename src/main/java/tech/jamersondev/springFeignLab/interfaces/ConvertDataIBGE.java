package tech.jamersondev.springFeignLab.interfaces;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface ConvertDataIBGE {
    <T> T[] getData(String json, Class<T[]> tClass) throws JsonProcessingException;
}
