package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    // 단축키: command+N
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
