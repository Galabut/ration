package com.ration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RationReqParams {

    @JsonProperty(required = true)
    @NotNull
    private Integer age;

    @JsonProperty(required = false)
    private List<String> healthFeatures;

    @JsonProperty(required = true)
    @NotNull
    private String sex;
}
