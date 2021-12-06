package study.inflearn.springintroduction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import study.inflearn.springintroduction.service.MemberService;

@Controller
public class MemberController {

    private final MemberService memberService;

    // 스프링이 연관된 객체를 스프링 컨테이너에서 찾아서 넣어줌
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
