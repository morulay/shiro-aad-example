package com.github.morulay.shiro.aad.example;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

  @GetMapping({"/", "/login", "/lobby"})
  public String index() {
    return "forward:/index.html";
  }

  @GetMapping("/run-as")
  public String runAs(@RequestParam String username) {
    PrincipalCollection runAsPrincipal = new SimplePrincipalCollection(username, "Run as realm");
    SecurityUtils.getSubject().runAs(runAsPrincipal);
    return "redirect:/";
  }

  @GetMapping("/run-as-me")
  public String releaseRunAs() {
    SecurityUtils.getSubject().releaseRunAs();
    return "redirect:/";
  }
}
