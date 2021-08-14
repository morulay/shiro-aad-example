package com.github.morulay.shiro.aad.example;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserApi {

  @GetMapping("/users/current")
  public UserInfo getUserInfo() {
    UserInfo userInfo = new UserInfo();
    Subject subject = SecurityUtils.getSubject();
    if (!subject.isRunAs()) {
      userInfo.setUsername((String) subject.getPrincipal());
    } else {
      userInfo.setUsername((String) subject.getPreviousPrincipals().getPrimaryPrincipal());
      userInfo.setRunAsUsername((String) subject.getPrincipal());
    }

    return userInfo;
  }
}
