package com.yuhan.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuhan.board.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{ // <어떤 클래스 엔티티인지, pk 어떤타입인지>
    
}
