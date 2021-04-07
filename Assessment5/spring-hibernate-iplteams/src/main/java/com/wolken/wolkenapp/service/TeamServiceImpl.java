package com.wolken.wolkenapp.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.dao.TeamDAO;
import com.wolken.wolkenapp.dto.TeamDTO;

@Component
public class TeamServiceImpl implements TeamService {
 @Autowired
 TeamDAO dao;
 Logger logger = Logger.getLogger(TeamServiceImpl.class);
	
	@Override
	public String validateAndAdd(TeamDTO dto) {
		// TODO Auto-generated method stub
		logger.info("inside add service");
		if(dto != null) {
			logger.info(dto.getTeamId());
			if(dto.getTeamId() > 0 && dto.getTeamId() <1000) {
				logger.info(dto.getCaptain());
				if(dto.getCaptain() != null ) {
					logger.info(dto.getTeamName());
					if(dto.getTeamName() != null) {
						logger.info(dto.getHomeGround());
						if(dto.getHomeGround() != null) {
							 dao.addTeam(dto);
							 return "Team Added";
						}
					}
					
				}
			}
		}
		
		return "failed";
	}

	@Override
	public String validateAndDeleteByName(String teamName) {
		// TODO Auto-generated method stub
		if(teamName != null && teamName.length() <100 ) {
			logger.info("valid team name");
			 dao.deleteTeamByName(teamName);
			 return "Deleted Successfully";
			
		}
		return "Failed to delete";
	}

	@Override
	public String validateAndUpdateCaptainByTeamName(String captain, String teamName) {
		// TODO Auto-generated method stub
		if(teamName != null && teamName.length() < 100) {
			System.out.println("teamName passed");
			if(captain != null && captain.length() < 100) {
				logger.info("captain");
				 dao.updateCaptainByTeamName(teamName, captain);
				 return "Successfully updated";
			}
		}
		
		return "Failed to update";
	}

	@Override
	public List<TeamDTO> getAllValues() {
		// TODO Auto-generated method stub
        return  dao.getAllTeams();
		
		
	}

}
