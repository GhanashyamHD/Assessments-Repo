package com.wolken.wolkenapp.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.dto.TeamDTO;

@Component
public class TeamDAOImpl implements TeamDAO {
	@Autowired
	LocalSessionFactoryBean bean;
	Logger logger = Logger.getLogger(TeamDAOImpl.class);
//	@Override
	// public String saveTeam(TeamDTO dto) {
	// TODO Auto-generated method stub
//		Configuration configuration = bean.getConfiguration();
//		configuration.configure();
//		SessionFactory factory = configuration.buildSessionFactory();
//		Session session = factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		session.save(dto);
//		transaction.commit();
//		session.close();
//		BasicDataSource basicDataSource = new BasicDataSource();
//		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		basicDataSource.setUrl("jdbc:mysql://localhost:3306/wolken");
//        basicDataSource.setUsername("root");
//        basicDataSource.setPassword("Leela12345$$");

	// return "data added";
	// }
//	@Override
//	public String deleteTeamByName(int  teamId) {
//		// TODO Auto-generated method stub
//		SessionFactory factory = bean.getObject();
//		Session session = factory.openSession();
//		Transaction transaction = session.beginTransaction();
//      Query query = session.getNamedQuery("delete");
//      query.setParameter("teamId", teamId );
//      query.executeUpdate();
//      transaction.commit();
//      session.close();
//      return "Team Deleted"; 
//        
//		
//	}
	@Override
	public String addTeam(TeamDTO dto) {
		try {
			logger.info("inside try of add");
			SessionFactory factory = bean.getObject();
			logger.info("factory object created");
			Session session = factory.openSession();
			logger.info("session object created");
			Transaction transaction = session.beginTransaction();
			logger.info("transaction object created");
			session.save(dto);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error in add dao");
			logger.error(e.getMessage());
		}
		return "Data Added";
	}

	@Override
	public String deleteTeamByName(String teamName) {
		try {
			logger.info("inside try of delete");
			SessionFactory factory = bean.getObject();
			logger.info("factory object created");
			Session session = factory.openSession();
			logger.info("session object created");
			Transaction transaction = session.beginTransaction();
			logger.info("transaction object created");
			Query query = session.getNamedQuery("delete");
			query.setParameter("teamName", teamName);
			query.executeUpdate();
			transaction.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error in add delete");
			logger.error(e.getMessage());
		}
		return "Team Deleted";
	}

	@Override
	public String updateCaptainByTeamName(String teamName, String captain) {
		try {
			logger.info("inside try of update");
			SessionFactory factory = bean.getObject();
			logger.info("factory object created");
			Session session = factory.openSession();
			logger.info("session object created");
			Transaction transaction = session.beginTransaction();
			logger.info("transaction object created");
			Query query = session
					.createQuery("update TeamDTO dto set dto.captain = :captain where dto.teamName = :teamName");
			query.setParameter("captain", captain);
			query.setParameter("teamName", teamName);

			query.executeUpdate();
			transaction.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error in update dao");
			logger.error(e.getMessage());
		}
		return "Data Updated";
	}

	@Override
	public List<TeamDTO> getAllTeams() {
		logger.info("inside getall");
		SessionFactory factory = bean.getObject();
		logger.info("factory object created");
		Session session = factory.openSession();
		logger.info("session object created");
		Transaction transaction = session.beginTransaction();
		logger.info("transaction object created");
		Query query = session.getNamedQuery("selectall");
		List<TeamDTO> teamslist = query.list();
		session.close();
		return teamslist;
	}
}
