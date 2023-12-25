package com.example.cms.user.client.service;

import com.example.cms.user.config.FeignConfig;
import com.example.cms.user.service.EmailSendService;
import feign.Response;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class EmailESendServiceTest {
  private final EmailSendService emailSendService;

  EmailESendServiceTest(EmailSendService emailSendService) {
    this.emailSendService = emailSendService;
  }

  @Test
  public void sendEmail() {
    String response = emailSendService.sendEmail().toString();
    System.out.println(response);
  }
}