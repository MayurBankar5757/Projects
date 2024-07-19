package com.tka.Dao;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Player;

@Repository
public class PlayerDao {
	@Autowired
	SessionFactory factory;

//	public String inserData() {
//		Session session = factory.openSession();
//		Transaction tx = session.beginTransaction();
////		Player p  = new Player("jaiswal", 25, 4);
////		Player p1 = new Player("Virat", 35, 15);
////		Player p2 = new Player("Rohit", 37, 18);
////		Player p3 = new Player("Raina", 35, 14);
////		Player p4 = new Player("Suryakumar", 35, 4);
////        session.save(p4);
////        session.save(p3);
////        session.save(p2);
////        session.save(p1);
////        session.save(p);
////        session.close();
////        tx.commit();
//		return "Data Inserted sucessfully";
//	}
// Fetch all the Player at time
	public List<Player> getData() {
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Player.class);
	   List<Player>al = c.list();
		
		return al;
	}

// Fetch single Player at a time
	public Player fetchSinglePlayer() {
		Session session = factory.openSession();
		Player p = session.load(Player.class, 1);
		return  p;
	}
	
	//Add single Player at a time

	public void addSinglePlayer(Player p) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(p);
		tx.commit();
		session.close();
	}

// Add Multiple Player at a time
	public void addMultipleData(List<Player> p) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		for (Player player : p) {
		    session.save(player);
		}

		tx.commit();
		session.close();
		
	}
	// To Update existing Player

	public void updateSinglePlayer(Player p) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(p);
		tx.commit();
		session.close();
		
	}

	// To Update Multiple Players
	public void updateMultiplePlayer(List<Player> p) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		for (Player player : p) {
		    session.update(player);
		}

		tx.commit();
		session.close();
		
	}
	public void delete(Player p) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        // Fetch the entity before deleting
        Player playerToDelete = session.get(Player.class, p.getPid());
        if (playerToDelete != null) {
            session.delete(playerToDelete);
        }
        
        tx.commit();
        session.close();
    }
	   public void deleteMultiplePlayers(List<Player> players) {
	        Session session = factory.openSession();
	        Transaction tx = session.beginTransaction();

	        for (Player player : players) {
	            // Fetch the entity before deleting
	            Player playerToDelete = session.get(Player.class, player.getPid());
	            if (playerToDelete != null) {
	                session.delete(playerToDelete);
	            }
	        }

	        tx.commit();
	        session.close();
	    }
}
