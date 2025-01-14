package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import com.tka.Service.PlayerService;
import com.tka.entity.Player;
/*
 * @RequestBody
 * 
Purpose: Binds the HTTP request body to a method parameter.

Usage: Typically used when you want to pass a JSON or XML payload in the body of a POST, PUT, or PATCH request.
 */
/*@PathVariable
Purpose: Extracts values from the URI path.

Usage: Typically used in GET, DELETE, or any request where you want to extract a part of the URL as a parameter.
*/

/*@GetMapping
 * 
 * Purpose: Handles HTTP GET requests.
Usage: Typically used to retrieve data from the server.
Idempotent: Yes, meaning that multiple identical requests should have the same effect as a single request.
Caching: GET requests are often cached by browsers.
@RestController
 * 
 * 
 * @PostMapping
Purpose: Handles HTTP POST requests.
Usage: Typically used to submit data to be processed to the server (e.g., form submission, uploading a file).
Idempotent: No, meaning that multiple identical requests may 
result in multiple resources being created or modified.
Caching: POST requests are not typically cached by browsers.
 * 
 * @PutMapping
Purpose: Handles HTTP PUT requests.
Usage: Typically used to update a resource completely (replacing the resource with the new data).
Idempotent: Yes, meaning that multiple identical requests should have the same effect as a single request.
 * 
 * @DeleteMapping
Purpose: Handles HTTP DELETE requests.
Usage: Typically used to delete a resource.
Idempotent: Yes, meaning that multiple identical requests should have the same effect as a single request.
 * 
 * 
 * 
 * @PatchMapping
 Purpose: Handles HTTP PATCH requests.
 Usage: Typically used to partially update a resource (modifying only certain fields).
 Idempotent: Yes, but its idempotence is more nuanced compared to PUT.

 * 
 * 
 * 
 */

@RestController

public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
	
	// we can define a default value here using @ value annotation 
	@Value("${c1.n}")
	int a ;
	
	@Value("${c2.n}")
	int b ;
	@GetMapping("/getData")
	public List<Player> getData() {
		System.out.println(a+b);
		return playerService.getData();
		
	}

	@GetMapping("/fetchSinglePlayer")
	public Player fetchSinglePlayer() {
		return playerService.fetchSinglePlayer();
	}

	@PostMapping("/addSinglePlayer")
	public void addSinglePlayer(@RequestBody Player player) {
		playerService.addSinglePlayer(player);
	}

	@PostMapping("/addMultiplePlayer")
	public void addMultipleData(@RequestBody List<Player> players) {
		playerService.addMultipleData(players);
	}

	@PostMapping("/updateSinglePlayer")
	public void updateSinglePlayer(@RequestBody Player player) {
		playerService.updateSinglePlayer(player);
	}

	@PutMapping("/updateMultiplePlayer")
	public void updateMultiplePlayer(@RequestBody List<Player> players) {
		playerService.updateMultiplePlayer(players);
	}

	@DeleteMapping("/delete")
	public void delete(@RequestBody Player player) {
		playerService.delete(player);
	}

	@DeleteMapping("/deleteMultiplePlayers")
	public void deleteMultiplePlayers(@RequestBody List<Player> players) {
		playerService.deleteMultiplePlayers(players);
	}
	@GetMapping("/getPlayerByTeam/{team}")
	public List<Player> getPlayerByTeam(@PathVariable String team){
		return playerService.getPlayerByTeam(team);
	}
	@GetMapping("/getPlayerByNameandteam")
	public List<Player> getPlayerByNameandteam(@RequestParam String pName,@RequestParam String team ){
		return playerService.getPlayerByNameandteam(pName,team);
	}

	
}
