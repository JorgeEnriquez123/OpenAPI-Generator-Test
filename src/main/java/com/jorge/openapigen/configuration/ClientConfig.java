package com.jorge.openapigen.configuration;

import com.jorge.client.api.CustomersApi;
import com.jorge.client.invoker.ApiClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ClientConfig {
    @Bean
    public ApiClient apiClient() {
        WebClient webClient = WebClient.builder()
                //You can use property values or leave it blank (ApiClient has a default url)
                .baseUrl("http://localhost:8080/api/v1")
                .build();
        return new ApiClient(webClient);
    }

    @Bean
    public CustomersApi customersApi() {
        return new CustomersApi(apiClient());
    }
}
