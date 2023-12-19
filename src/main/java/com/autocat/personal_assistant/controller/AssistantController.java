package com.autocat.personal_assistant.controller;

import com.autocat.personal_assistant.client.OpenAIClient;
import com.autocat.personal_assistant.dto.AssistanRequestDto;
import com.autocat.personal_assistant.enums.Models;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/assistant")
@RestController
@RequiredArgsConstructor
public class AssistantController {

    private final OpenAIClient openAIClient;

    @PostMapping("/create")
    public String createAssistant() {
        openAIClient.createAssistant(
              "Bearer ${API_KEY}",
                        "assistants=v1",
                AssistanRequestDto.builder()
                        .instructions("Instruct the assistant to do something")
                        .name("God of Programming")
                        .model(Models.GPT_3_5.getModel())
                        .build());
        return "Hello World";
    }
}
