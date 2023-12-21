package com.example.cms.user.service;

import com.example.cms.user.domain.SignUpForm;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SignUpCustomerServiceTest {

  @Autowired
  private SignUpCustomerService service;

  @Test
  void signUp() {
    SignUpForm form = SignUpForm.builder()
        .name("name")
        .birth(LocalDate.now())
        .email("aaa@gmail.com")
        .password("1")
        .phone("01011111111")
        .build();

    Assert.isTrue(service.signUp(form).getId() != null);
  }
}