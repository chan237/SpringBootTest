package com.kh.domain;

import java.util.Date;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;


@Data
@Builder
public class Board {

	private int boardNo;
	@NonNull
	private String title;
	@NonNull
	private String content;
	private String writer;
	private Date regDate;
}
