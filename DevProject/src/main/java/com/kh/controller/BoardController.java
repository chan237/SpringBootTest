package com.kh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {

    // /board/register (GET)
    @GetMapping("/register")
    public String registerFormDirect() {
        log.info("GET 방식 등록");
        return "board/register";
    }

    // /board/register (POST)
    @PostMapping("/register")
    public String registerDirect() {
        log.info("POST 방식 등록");
        return "board/list";
    }

    // /board/modify (GET)
    @GetMapping("/modify")
    public String modifyFormDirect() {
        log.info("GET 방식 수정");
        return "board/modify";
    }

    // /board/modify (POST)
    @PostMapping("/modify")
    public String modifyDirect() {
        log.info("POST 방식 수정");
        return "board/list";
    }

    // /board/remove (POST)
    @PostMapping("/remove")
    public String removeDirect() {
        log.info("Direct POST 방식 삭제");
        return "board/list";
    }

    // /board/list (GET)
    @GetMapping("/list")
    public String listDirect() {
        log.info("Direct GET 방식 목록");
        return "board/list";
    }
}

