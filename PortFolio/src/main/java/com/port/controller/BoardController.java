package com.port.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.port.service.BoardService;

@Controller
@RequestMapping(value="/")
public class BoardController {

    @Inject
    private BoardService service;

    @RequestMapping(value= "/listAll", method = RequestMethod.GET) // 주소 호출 명시 . 호출하려는 주소 와 REST 방식설정 (GET)
    public void listAll(Model model)throws Exception { // 메소드 인자값은 model 인터페이스(jsp전달 심부름꾼)
        model.addAttribute("list",service.listAll()); // jsp에 심부름할 내역(서비스 호출)
    }
}