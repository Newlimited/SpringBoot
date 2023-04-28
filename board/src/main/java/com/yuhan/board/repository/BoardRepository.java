package com.yuhan.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yuhan.board.entity.BoardEntity;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Integer > {

    public BoardEntity findByBoardNumber(int boardNumber); 
    //유니크라서 하나만 반환되기때매 리스트로 지정할 필요 없음

}
