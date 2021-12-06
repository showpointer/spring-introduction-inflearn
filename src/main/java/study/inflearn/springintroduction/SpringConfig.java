package study.inflearn.springintroduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.inflearn.springintroduction.repository.MemberRepository;
import study.inflearn.springintroduction.repository.MemoryMemberRepository;
import study.inflearn.springintroduction.service.MemberService;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
