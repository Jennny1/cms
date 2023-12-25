package com.example.cms.user.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;

@Configuration
public class FeignConfig {
  @Qualifier("mailgun")
  @Bean
  public BasicAuthenticationInterceptor basicAuthenticationInterceptor() {
    return new BasicAuthenticationInterceptor("api","pubkey-167c06dd5a59371bc6771088c178d487");
  }
}
