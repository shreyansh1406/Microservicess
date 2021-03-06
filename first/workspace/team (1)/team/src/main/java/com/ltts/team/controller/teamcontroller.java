package com.ltts.team.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.team.dao.teamdao;
import com.ltts.team.model.team;

@RestController
public class teamcontroller {
		
	@Autowired
	teamdao td;
	
	  @GetMapping(value="/teams")
	    public List<team> index() {
	        return td.getAllTeams();
	    }
	    
}
 