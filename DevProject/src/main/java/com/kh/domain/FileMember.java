package com.kh.domain;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class FileMember {
	private String userId;
	private String passwoard;
	private MultipartFile picture;
}
