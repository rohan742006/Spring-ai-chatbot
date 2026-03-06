package com.example.Spring_AI;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class FirstAIController {
    private final ChatClient chatClient;

    public FirstAIController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping(value = "/ask")
    public Flux<String> ask(@RequestParam String q){
        return chatClient
                .prompt(q)
               /* .system("""
You are a strict movie expert.
Only answer questions related to movies, actors, directors, box office,
film industry, genres, reviews, or cinema history.

If the question is not related to movies,
respond exactly with:
"I can only answer movie-related questions."
""")*/
                .user(q)
                .stream()
                .content();
    }
}
