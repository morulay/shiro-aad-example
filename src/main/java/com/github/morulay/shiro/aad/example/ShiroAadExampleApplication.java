package com.github.morulay.shiro.aad.example;

import org.apache.shiro.realm.Realm;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShiroAadExampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(ShiroAadExampleApplication.class, args);
  }

  @Bean
  public Realm realm() {
    return new SimpleAccountRealm("Test");
  }

  // @Bean
  // public PrincipalFactory principalFactory() {
  // return username -> username;
  // }
}
