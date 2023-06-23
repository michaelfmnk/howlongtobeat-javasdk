package dev.fomenko.hltbsdk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HltbSearchResponse {
    private String color;
    private String title;
    private String category;
    private int count;
    @JsonProperty("pageCurrent")
    private int pageCurrent;
    @JsonProperty("pageTotal")
    private int pageTotal;
    @JsonProperty("pageSize")
    private int pageSize;
    private List<HltbGame> data;
    private List<Object> userData;
    private Object displayModifier;
}
