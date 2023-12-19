package com.autocat.personal_assistant.dto;

import com.autocat.personal_assistant.enums.Models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * BlahBlah Entity 의 DT 를 도와주는 DTO 클래스
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class AssistantDto {

    String id;

    String object;

    @JsonProperty("created_at")
    Long createdAt;

    String name;

    String description;

    String model;

    String instructions;

    List<Tools> tools;




    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Tools{
        String type;
    }
}
