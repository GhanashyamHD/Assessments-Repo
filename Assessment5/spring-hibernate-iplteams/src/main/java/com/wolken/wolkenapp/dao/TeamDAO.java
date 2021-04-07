package com.wolken.wolkenapp.dao;

import java.util.List;

import com.wolken.wolkenapp.dto.TeamDTO;

public interface TeamDAO {
	public String addTeam(TeamDTO dto);
	public String deleteTeamByName(String teamName);
	public String updateCaptainByTeamName(String teamName , String captain);
	public List<TeamDTO> getAllTeams();

}
