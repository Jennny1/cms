package com.example.cms.user.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "mailgun")
public class MailgunClient {


}
