package com.autocat.personal_assistant.client;

import com.autocat.personal_assistant.dto.AssistanRequestDto;
//import com.autocat.personal_assistant.dto.RequestHeaderDto;
import com.autocat.personal_assistant.enums.Models;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class OpenAIClientTest {

    @Autowired
    OpenAIClient openAIClient;

    @DisplayName("createAssistant 테스트")
    @Test
    void createAssistant(){
        openAIClient.createAssistant(
                "Bearer ${API_KEY}",
                "assistants=v1",
                AssistanRequestDto.builder()
                        .instructions("Instruct the assistant to do something")
                        .name("God of Programming")
                        .model(Models.GPT_3_5.getModel())
                        .build());
    }

}