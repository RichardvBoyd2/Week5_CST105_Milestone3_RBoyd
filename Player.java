/** Program: Player
 * File: Player.java
 * Summary: Player class for NFL Draft Program
 * Author: Richard Boyd
 * Date:January 14th, 2018
 */

import java.text.DecimalFormat;

class Player {
	
	public static void main(String[] args) {
		
		DecimalFormat one = new DecimalFormat("#.#"); //creates format for percent stats that are calculated in this class
		
		Player player1 = new Player("Peyton Manning", "Quarterback", "Offense", 34, 12, 679, 450, 18, 18, 0, 0);
		Player player2 = new Player();    //testing both constructors
		player2.setName("Reggie Wayne");
		
		System.out.println(player1);
		System.out.println(one.format(player1.getPassCmpPercent()) + "%");  //testing various aspects of the "player" objects that were just created
		System.out.println(one.format(player1.getYrdsPerRush()));
		System.out.println(player1.getName());
		System.out.println(player2.getName());
	}
	
	private String name, position, team;  //defines properties
	private int age, yrs, passAtt, passCmp, rushAtt, rushYrds, rec, recYrds;
	
	public Player() {	//no argument constructor
	}
	
	public Player(String name1, String position1, String team1, int age1, int yrs1, int passAtt1, int passCmp1, int rushAtt1, int rushYrds1, int rec1, int recYrds1) {
		name = name1;
		position = position1;   //constructor with all arguments
		team = team1;
		age = age1;
		yrs = yrs1;
		passAtt = passAtt1;
		passCmp = passCmp1;
		rushAtt = rushAtt1;
		rushYrds = rushYrds1;
		rec = rec1;
		recYrds = recYrds1;
	}
	
	public String getName() {   //getters and setters
		return this.name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String getPosition() {
		return this.position;
	}
	public void setPosition(String newPosition) {
		this.position = newPosition;
	}
	
	public String getTeam() {
		return this.team;
	}
	public void setTeam(String newTeam) {
		this.team = newTeam; 
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public int getYrs() {
		return this.yrs;
	}
	public void setYrs(int newYrs) {
		this.yrs = newYrs;
	}
	
	public int getPassAtt() {
		return this.passAtt;
	}
	public void setPassAtt(int newPassAtt) {
		this.passAtt = newPassAtt;
	}
	
	public int getPassCmp() {
		return this.passCmp;
	}
	public void setPassCmp(int newPassCmp) {
		this.passCmp = newPassCmp;
	}
	
	public int getRushAtt() {
		return this.rushAtt;
	}
	public void setRushAtt(int newRushAtt) {
		this.rushAtt = newRushAtt;
	}
	
	public int getRushYrds() {
		return this.rushYrds;
	}
	public void setRushYrds(int newRushYrds) {
		this.rushYrds = newRushYrds;
	}
	
	public int getRec() {
		return this.rec;
	}
	public void setRec(int newRec) {
		this.rec = newRec;
	}
	
	public int getRecYrds() {
		return this.recYrds;
	}
	public void setRecYrds(int newRecYrds) {
		this.recYrds = newRecYrds;
	}
	
	public float getPassCmpPercent() {   //three getter methods that return a value calculated from other properties
		return ((((float)this.passCmp)/((float)this.passAtt))*100);
	}
	
	public float getYrdsPerRush() {
		return ((((float)this.rushYrds)/((float)this.rushAtt)));
	}
	
	public float getYrdsPerRec() {
		return ((((float)this.recYrds)/((float)this.rec)));
	}
	
	public String toString() {   //toString method
		return name;
	}
}
