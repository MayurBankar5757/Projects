package com.tka.Service;

import java.util.ArrayList;
import java.util.List;
/*@Service, indicating that it is a service component. 
 * This allows Spring to automatically detect and manage this class as a Spring bean,
 *  making it eligible for dependency injection and other Spring features.FF
 *  
 *  @Autowired : 
 *  
 *  Automatic Dependency Injection: @Autowired allows Spring to automatically resolve and
 *   inject the required dependencies into a bean.
	Constructor, Field, or Setter Injection: It can be used on constructors, fields, 
	or setter methods to indicate where Spring should inject the dependencies.
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Dao.PlayerDao;
import com.tka.entity.Player;

@Service
public class PlayerService {
	@Autowired
	PlayerDao d;
	
//	public String insertData() {
//		d.inserData();
//		return "Data Inserted";
//	}

	public List<Player> getData() {
		// TODO Auto-generated method stub
		return d.getData();
	}

	public void addSinglePlayer(Player p) {
		// TODO Auto-generated method stub
		d.addSinglePlayer(p);
		
	}

	public Player fetchSinglePlayer() {
		// TODO Auto-generated method stub
		return d.fetchSinglePlayer();
	}

	public void addMultipleData(List<Player> p) {
		// TODO Auto-generated method stub
		d.addMultipleData(p);
		
	}

	public void updateSinglePlayer(Player p) {
		// TODO Auto-generated method stub

		d.updateSinglePlayer(p);
	}

	public void updateMultiplePlayer(List<Player> p) {
		// TODO Auto-generated method stub
		d.updateMultiplePlayer(p);
	}
	public void delete(Player p) {
		
		d.delete(p);
	}
	 public void deleteMultiplePlayers(List<Player> players) {
	        d.deleteMultiplePlayers(players);
	    }

	public List<Player> getPlayerByTeam(String team) {
		// TODO Auto-generated method stub
		List<Player> al = d.getData();
		List<Player> p = new ArrayList<>();
		for(Player t:al) {
			if(t.getTeam()==null) {
				continue;
			}
			if(t.getTeam().equalsIgnoreCase(team)) {
				p.add(t);
			}
		}
		return p;
	}
	/*
	 * We can Write condition like it also remember it
	 * public List<Player> getPlayerByTeam(String team) {
    List<Player> al = d.getData(); // Assuming d is your data service or repository
    List<Player> result = new ArrayList<>();

    for (Player player : al) {
        String playerTeam = player.getTeam();
        
        if (playerTeam != null && playerTeam.equalsIgnoreCase(team)) {
            result.add(player);
        }
    }

    return result;
}
*/

	public List<Player> getPlayerByNameandteam(String pName, String team) {
		// TODO Auto-generated method stub
		List<Player> al = d.getData();
		List<Player> p = new ArrayList<>();
		for(Player t:al) {
	
			if(t.getTeam()!= null &&t.getpName().equalsIgnoreCase(pName)&& t.getTeam().equalsIgnoreCase(team)) {
				p.add(t);
			}
		}
		return p;
	}

}
