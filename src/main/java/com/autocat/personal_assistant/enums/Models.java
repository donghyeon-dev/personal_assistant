package com.autocat.personal_assistant.enums;

import lombok.*;

@Getter
public enum Models {

    GPT_4("gpt-4", "Currently points to gpt-4-0613. See continuous model upgrades.\t8,192 tokens\tUp to Sep 2021"),
    GPT_3_5("gpt-3.5-turbo-0613", "Snapshot of gpt-3.5-turbo from June 13th 2023. Will be deprecated on June 13, 2024.	4,096 tokens	Up to Sep 2021");

    String model;
    String description;

    Models(String model, String description) {
        this.model = model;
        this.description = description;
    }

}
