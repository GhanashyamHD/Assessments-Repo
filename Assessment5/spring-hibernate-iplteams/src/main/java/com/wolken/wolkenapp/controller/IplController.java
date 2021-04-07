package com.wolken.wolkenapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dao.TeamDAO;
import com.wolken.wolkenapp.dto.TeamDTO;
import com.wolken.wolkenapp.service.TeamService;



@Component
@RequestMapping("/")
public class IplController {
    @Autowired
	TeamDAO dao;
	@Autowired
	TeamService service;
	@RequestMapping("/team.ghd")
	public String iplController(@ModelAttribute TeamDTO dto ,HttpServletRequest request) {
		String msg = service.validateAndAdd(dto);
		request.setAttribute("msg", msg);
	
	   return "home.jsp";
	}
	
	@RequestMapping("/delete.ghd")
	public String deleteController( HttpServletRequest req) {
		String msg = service.validateAndDeleteByName(req.getParameter("teamName"));
		req.setAttribute("msg", msg);
		return "home.jsp";
	}
	@RequestMapping("/get.ghd")
	public String displayTeams(HttpServletRequest req){
	  List<TeamDTO>  teamsList = dao.getAllTeams();
	  for (TeamDTO dto : teamsList) {
			System.out.println(dto);
	  }
	  
		req.setAttribute("teamsList", teamsList);
		return "display.jsp";
	}
	
	@RequestMapping("/update.ghd")
	public String updateTeamCaptainByTeamName(HttpServletRequest req) {
		String newCaptainName= req.getParameter("newTeamCaptain");
		String TeamNameToUpdate= req.getParameter("teamName");
		String msg = service.validateAndUpdateCaptainByTeamName(newCaptainName, TeamNameToUpdate);
		req.setAttribute("msg", msg);
		return "home.jsp";
	
	}
}
