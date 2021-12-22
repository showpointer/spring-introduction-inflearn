package study.inflearn.springintroduction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.inflearn.springintroduction.domain.Member;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    Optional<Member> findByName(String name);
}