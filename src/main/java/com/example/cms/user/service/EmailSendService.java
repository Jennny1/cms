package com.example.cms.user.service;

import com.example.cms.user.client.MailgunClient;
import com.example.cms.user.client.mailgun.SendMailForm;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailSendService {

  private final MailgunClient mailgunClient;

  public ResponseEntity sendEmail() {
    SendMailForm form = SendMailForm.builder()
        .from("june9282@gmail.com")
        .to("theead@naver.com")
        .subject("test")
        .text("my text")
        .build();

    return mailgunClient.sendEmail(form);
  }
}
