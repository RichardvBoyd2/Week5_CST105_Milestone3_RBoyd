/** Program: Player Manager
 * File: PlayerManager.java
 * Summary: Creates a list of players and manages the info
 * Author: Richard Boyd
 * Date: January 14th 2018
 */

import java.util.*;
public class PlayerManager {
	
	static ArrayList<Player> list = new ArrayList<Player>();  //Creates ArrayList
	
	
	public static void main(String[] args) {   // Driver for testing
		PlayerManager myManager = new PlayerManager(list);
		System.out.println(myManager);  //Displays the list of players from the toString method
		System.out.println( (list.get(0)).getAge() ); //getter for the first player's age
		(list.get(0)).setAge(35); //setter changing the age of the first player
		System.out.println( (list.get(0)).getAge() ); //getter checking the setter's work
		System.out.println( (list.get(5)).getPosition() ); //getter displaying the position of the 6th player
		System.out.println( (list.get(2)).getRecYrds() );  //getter displaying the third player's receiving yards
	}
	
	public PlayerManager(ArrayList<Player> myTeam) {  //Constructor of the PlayerManager
		createPlayers(); //calls the createPlayers method
		myTeam = list;
	}
	
	private static void createPlayers() {  //Player names and stats hard coded into the createPlayers method
		Player manning = new Player("Peyton Manning", "Quarterback", "Offense", 34, 12, 679, 450, 18, 18, 0, 0);
		list.add(manning);
		Player brown = new Player("Donald Brown", "Running back", "Offense", 23, 1, 0, 0, 129, 497, 20, 205);
		list.add(brown);
		Player garcon = new Player("Pierre Garcon", "Wide Receiver", "Offense", 24, 2, 0, 0, 2, 6, 67, 784);
		list.add(garcon);
		Player cutler = new Player("Jay Cutler", "Quarterback", "Offense", 27, 4, 432, 261, 50, 232, 0, 0);
		list.add(cutler);
		Player forte = new Player("Matt Forte", "Running back", "Offense", 25, 2, 0, 0, 237, 1069, 51, 547);
		list.add(forte);
		Player knox = new Player("Johnny Knox", "Wide Receiver", "Offense", 24, 1, 0, 0, 1, 2, 51, 960);
		list.add(knox);
		
	}

	public String toString() { //the toString method for PlayerManager
		String teamList = list.toString();
		return teamList;
	}

}
