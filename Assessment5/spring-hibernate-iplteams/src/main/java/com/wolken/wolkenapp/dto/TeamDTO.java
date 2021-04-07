package com.wolken.wolkenapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@Component
@ToString
@Entity
@Table(name = "team_details")
@NamedQueries({
@NamedQuery(name = "delete", query = "delete from TeamDTO dto where dto.teamName =:teamName"),
@NamedQuery(name = "selectall", query = "from TeamDTO dto")})
public class TeamDTO {
	@Id
	@Column(name= "team_Id")
	private int  teamId;
	@Column(name = "team_Name")
	private String teamName;
	@Column(name = "home_Ground")
	private String homeGround;
	@Column(name = "captain")
	private String captain;
	

}

