package com.autocat.personal_assistant.client;

import com.autocat.personal_assistant.dto.AssistanRequestDto;
import com.autocat.personal_assistant.dto.AssistantDto;
//import com.autocat.personal_assistant.dto.RequestHeaderDto;
import com.autocat.personal_assistant.dto.ThreadDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "openai", url = "https://api.openai.com/v1")
public interface OpenAIClient {

    @PostMapping(value = "/assistants", consumes = MediaType.APPLICATION_JSON_VALUE)
    AssistantDto createAssistant(@RequestHeader(value = "Authorization") String authorization,
                                 @RequestHeader(value = "OpenAI-Beta") String openAiBeta,
                                 @RequestBody AssistanRequestDto requesttDto);

    @PostMapping("/threads")
    ThreadDto createThread();

}
