package com.example.study.repository;

import com.example.study.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //User 레파지토리에 long 타입 id이다.

    //select * from user where account = ?
    Optional<User> findByAccount(String account);

    Optional<User> findByEmail(String email);

    //findBy 사용하면 알아서 메소드 만들어준다!
    Optional<User> findByAccountAndEmail(String account, String email);
}
