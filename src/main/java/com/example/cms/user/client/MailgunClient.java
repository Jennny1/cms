package com.example.cms.user.client;

import com.example.cms.user.client.mailgun.SendMailForm;
import feign.Response;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "mailgun", url = "https://api.mailgun.net/v3/")
@Qualifier("mailgun")
public interface MailgunClient {

  @PostMapping("sandbox0684147633ec48138d59b2ecf1a774e1.mailgun.org/messages")
  ResponseEntity sendEmail(@SpringQueryMap SendMailForm form);

}
