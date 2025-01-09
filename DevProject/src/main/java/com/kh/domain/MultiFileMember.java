package com.kh.domain;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class MultiFileMember {
	private String userId;
	private String passwoard;
	private List<MultipartFile> pictureList;
}
