package com.jorge.openapigen.feign;

import com.jorge.client.api.CustomersApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "customer-service", url = "${customer.api.url}")
public interface CustomerClient extends CustomersApi {
    // No code is needed here, as the Feign client will automatically implement the methods defined in the CustomersApi interface.
}
