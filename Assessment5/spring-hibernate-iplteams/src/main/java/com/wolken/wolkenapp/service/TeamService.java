package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.dto.TeamDTO;

public interface TeamService {
	public String validateAndAdd(TeamDTO dto);
	public String validateAndDeleteByName(String teamName);
	public String validateAndUpdateCaptainByTeamName(String captain, String teamName);
	public  List<TeamDTO> getAllValues();

}
