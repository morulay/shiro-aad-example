package com.github.morulay.shiro.aad.example;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @RequestMapping("/")
  public String hello() {
    return "Hello " + SecurityUtils.getSubject().getPrincipal();
  }

  @RequestMapping("/run-as")
  public void runAs(@RequestParam String name) {
    PrincipalCollection runAsPrincipal = new SimplePrincipalCollection(name, "Run as realm");
    SecurityUtils.getSubject().runAs(runAsPrincipal);
  }

  @RequestMapping("/release-run-as")
  public void releaseRunAs() {
    SecurityUtils.getSubject().releaseRunAs();
  }
}
