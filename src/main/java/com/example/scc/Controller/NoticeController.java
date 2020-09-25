package com.example.scc.Controller;

import com.example.scc.domain.Notice;
import com.example.scc.service.NoticeService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Log
@Controller
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public void list(Model model) throws Exception{

        model.addAttribute("notice", new Notice());

        model.addAttribute("list",service.list());
    }



    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(Notice notice, Model model) throws Exception {
        service.register(notice);

        model.addAttribute("msg", "등록이 완료되었습니다.");

        return "notice/success";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public void registerForm(Notice notice, Model model) throws Exception {

        log.info("list : access to all");
    }
}