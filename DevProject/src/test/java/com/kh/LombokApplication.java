package com.kh;

import java.util.Date;

import com.kh.domain.Board;
import com.kh.service.BoardService;

public class LombokApplication {

	public static void main(String[] args) {
		BoardService boardService = new BoardService();

		Board board = Board.builder().boardNo(1).title("Builder, Slf4j 테스트").writer("테스터")
				.content("@Builder, @Slf4j 애너테이션").regDate(new Date()).build();
		boardService.create(board);
		boardService.readByBoardNo(1);
		boardService.delete(board);
	}
}