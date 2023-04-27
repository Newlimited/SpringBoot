package com.yuhan.board.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.yuhan.board.dto.request.Board.PatchBoardRequestDto;
import com.yuhan.board.dto.request.Board.PostBoardRequestDto;
import com.yuhan.board.dto.response.ResponseDto;
import com.yuhan.board.dto.response.board.GetBoardListResponseDto;
import com.yuhan.board.dto.response.board.GetBoardResponseDto;
import com.yuhan.board.service.BoardService;

@Service
public class BoardServiceImplement implements BoardService {

    @Override
    public ResponseEntity<ResponseDto> postBoard(PostBoardRequestDto dto) {
       
        throw new UnsupportedOperationException("Unimplemented method 'postBoard'");
    }

    @Override //<? super GetBoardResponseDto> 와일드 카드의 하한을 제한. GetBoardResponseDto와 그 조상들만가능
    // 반환하는 타입이 반환되는 타입이 다르다. 
    // 성공되면 GetBoardResponseDto 클래스의 반환타입으로 반환될거고 
    // 실패하면 code, message 형태인 조상클래스의 반환타입으로 반환될것이다.
    public ResponseEntity<? super GetBoardResponseDto> getBoard(Integer boardNumber) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getBoard'");
    }

    @Override
    public ResponseEntity<? super GetBoardListResponseDto> getBoardList() {
      
        throw new UnsupportedOperationException("Unimplemented method 'getBoardList'");
    }

    @Override
    public ResponseEntity<? super GetBoardListResponseDto> getBoardTop3() {
     
        throw new UnsupportedOperationException("Unimplemented method 'getBoardTop3'");
    }

    @Override
    public ResponseEntity<ResponseDto> patchBoard(PatchBoardRequestDto dto) {
     
        throw new UnsupportedOperationException("Unimplemented method 'patchBoard'");
    }

    @Override
    public ResponseEntity<ResponseDto> deleteBoard(String userEmail, Integer boardNumber) {
     
        throw new UnsupportedOperationException("Unimplemented method 'deleteBoard'");
    }
    
}