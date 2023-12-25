package com.example.cms.user.controller;

import com.example.cms.user.service.EmailSendService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
  private final EmailSendService emailSendService;

  @GetMapping
  public ResponseEntity sendTestEmail() {
    return emailSendService.sendEmail();
  }
}
