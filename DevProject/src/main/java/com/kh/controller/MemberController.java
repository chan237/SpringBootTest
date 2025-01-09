package com.kh.controller;

import java.util.List;
import com.kh.domain.FileMember;
import com.kh.domain.Member;
import com.kh.domain.MultiFileMember;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import lombok.extern.java.Log;

@Log
@Controller
public class MemberController {
	@RequestMapping(value = "/registerFileUpForm", method = RequestMethod.GET)
	public String registerFileUpForm() {
		log.info("registerFileUpForm");
		return "registerFileUpForm";
	}

	@RequestMapping(value = "/registerFileUp01", method = RequestMethod.POST)
	public String registerFileUp01(MultipartFile picture) throws Exception {
		log.info("registerFileUp01");

		log.info("originalName: " + picture.getOriginalFilename());
		log.info("size: " + picture.getSize());
		log.info("contentType: " + picture.getContentType());

		return "success";
	}

	@RequestMapping(value = "/registerFileUp02", method = RequestMethod.POST)
	public String registerFileUp02(String userId, String password, MultipartFile picture) throws Exception {
		log.info("registerFileUp02");

		log.info("userId = " + userId);
		log.info("password = " + password);
		log.info("originalName: " + picture.getOriginalFilename());
		log.info("size: " + picture.getSize());
		log.info("contentType: " + picture.getContentType());

		return "success";
	}

	@RequestMapping(value = "/registerFileUp03", method = RequestMethod.POST)
	public String registerFileUp03(Member member, MultipartFile picture) throws Exception {
		log.info("registerFileUp03");
		log.info("userId = " + member.getUserId());
		log.info("password = " + member.getPassword());

		log.info("originalName: " + picture.getOriginalFilename());
		log.info("size: " + picture.getSize());
		log.info("contentType: " + picture.getContentType());
		return "success";
	}

	@RequestMapping(value = "/registerFileUp04", method = RequestMethod.POST)
	public String registerFileUp04(FileMember fileMember) throws Exception {
		log.info("registerFileUp04");

		log.info("userId = " + fileMember.getUserId());
		log.info("password = " + fileMember.getPasswoard());
		MultipartFile picture = fileMember.getPicture();
		log.info("originalName: " + picture.getOriginalFilename());
		log.info("size: " + picture.getSize());
		log.info("contentType: " + picture.getContentType());

		return "success";
	}

	@RequestMapping(value = "/registerFileUp05", method = RequestMethod.POST)
	public String registerFileUp05(MultipartFile picture, MultipartFile picture2) throws Exception {
		log.info("registerFileUp05");

		log.info("picture originalName: " + picture.getOriginalFilename());
		log.info("picture size: " + picture.getSize());
		log.info("picture contentType: " + picture.getContentType());

		log.info("picture2 originalName: " + picture2.getOriginalFilename());
		log.info("picture2 size: " + picture2.getSize());
		log.info("picture2 contentType: " + picture2.getContentType());

		return "success";
	}

	@RequestMapping(value = "/registerFileUp06", method = RequestMethod.POST)
	public String registerFileUp06(List<MultipartFile> pictureList) throws Exception {
		log.info("registerFileUp06");
		log.info("registerFileUp06 pictureList.size() = " + pictureList.size());
		for (MultipartFile picture : pictureList) {
			log.info("picture originalName: " + picture.getOriginalFilename());
			log.info("picture size: " + picture.getSize());
			log.info("picture contentType: " + picture.getContentType());
		}
		return "success";
	}

	@RequestMapping(value = "/registerFileUp07", method = RequestMethod.POST)
	public String registerFileUp07(MultiFileMember multiFileMember) throws Exception {
		log.info("registerFileUp07");

		List<MultipartFile> pictureList = multiFileMember.getPictureList();
		log.info("registerFileUp07 pictureList.size() = " + pictureList.size());
		for (MultipartFile picture : pictureList) {
			log.info("picture originalName: " + picture.getOriginalFilename());
			log.info("picture size: " + picture.getSize());
			log.info("picture contentType: " + picture.getContentType());
		}
		return "success";
	}

	@RequestMapping(value = "/registerFileUp08", method = RequestMethod.POST)
	public String registerFileUp08(MultipartFile[] pictureList) throws Exception {
		log.info("registerFileUp08");

		log.info("registerFileUp08 pictureList.length = " + pictureList.length);
		for (MultipartFile picture : pictureList) {
			log.info("picture originalName: " + picture.getOriginalFilename());
			log.info("picture size: " + picture.getSize());
			log.info("picture contentType: " + picture.getContentType());
		}

		return "success";
	}
}
