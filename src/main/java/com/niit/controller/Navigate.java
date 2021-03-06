package com.niit.controller;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.dao.Userdao;
import com.niit.models.Message;
import com.niit.models.OutputMessage;
import com.niit.service.Userservicedao;
import com.niit.service.forumservicedao;

@Controller
public class Navigate {
	
	
	@Autowired
	private Userdao userdao;
	@Autowired
	private Userservicedao userservicedao;
	
	
	
	
	@SuppressWarnings("unused")
	@Autowired
	private forumservicedao forumService;
	@RequestMapping(value={"/","/home"})
	public String Homepage()
	{
		return "home";
	}
	
	
	
	@RequestMapping("Blog")
	public String Blog(Model m)
	{
		m.addAttribute("BlogClicked", "true");
		return "home";
	}
	
	@RequestMapping("forum")
	public String Forum(Model m)
	{
		m.addAttribute("ForumClicked", "true");
		return "home";
	}
	@RequestMapping("login")
	public String Userdetails(Model m)
	{
		m.addAttribute("Loginclicked", "true");
		return "home";
	}
	@RequestMapping("/LoginSuccess")
	public String LoginSuccess(HttpSession session)
	{
		
		userservicedao.LoginSuccess(session);
		return "home";
	}
	@RequestMapping("forum/{fid}")
	public String ViewIndividualForum(@PathVariable("fid") int fid,  Model m)
	{
		m.addAttribute("forumList", forumService.getSingleForum(fid));
		m.addAttribute("IndividualForum", "true");
		return "home";
	}
	
	@RequestMapping("chat")
	public String Chat(Model m) {
		m.addAttribute("ChatClicked", "true");
		return "home";
	}

	@MessageMapping("/chat")
	@SendTo("/topic/message")
	public OutputMessage sendMessage(Message message) {
		return new OutputMessage(message, new Date());
	}
	
}
