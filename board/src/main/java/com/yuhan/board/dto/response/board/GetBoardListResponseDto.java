package com.yuhan.board.dto.response.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;

import com.yuhan.board.dto.response.ResponseDto;
import com.yuhan.board.entity.resultSet.BoardListResultSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class GetBoardListResponseDto extends ResponseDto{
    private List<BoardSummary> boardList;

    public GetBoardListResponseDto(List<BoardListResultSet> resultSet){
        super("SU","Success");

        List<BoardSummary> boardList = new ArrayList<>();
        
        for(BoardListResultSet result : resultSet) {


        }
        this.boardList = boardList;
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class BoardSummary {
   
    private Integer boardNumber;
    private String boardTitle;
    private String boardContent;
    private String boardImageUrl;
    private String boardWriteDatetime;
    private int viewCount;
    private String boardWriterEmail;
    private String boardWriterprofileImageUrl;
    private int commentCount;
    private int likeCount;
}
