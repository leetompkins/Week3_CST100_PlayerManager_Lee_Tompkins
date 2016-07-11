import java.util.ArrayList;
import java.util.List;

public class PlayerManager {

	public static void main(String[] args) {
		CreatePlayers playersList = new CreatePlayers();
		
		
		
		
		


	}

}


class CreatePlayers {
	public CreatePlayers() {
		List<NFLPlayer> playerArray = new ArrayList<NFLPlayer>();
		NFLPlayer JohnDoe = new NFLPlayer(1);
		NFLPlayer b = new NFLPlayer(2);
		NFLPlayer c = new NFLPlayer(3);
		NFLPlayer d = new NFLPlayer(4);
		NFLPlayer e = new NFLPlayer(5);
		NFLPlayer f = new NFLPlayer(6);
		NFLPlayer g = new NFLPlayer(7);
		NFLPlayer h = new NFLPlayer(8);
		NFLPlayer i = new NFLPlayer(9);
		NFLPlayer j = new NFLPlayer(10);
		NFLPlayer k = new NFLPlayer(11);
		NFLPlayer l = new NFLPlayer(12);
		NFLPlayer m = new NFLPlayer(13);
		NFLPlayer n = new NFLPlayer(14);
		NFLPlayer o = new NFLPlayer(15);
		NFLPlayer p = new NFLPlayer(16);
		NFLPlayer q = new NFLPlayer(17);
		NFLPlayer r = new NFLPlayer(18);
		NFLPlayer s = new NFLPlayer(19);
		NFLPlayer t = new NFLPlayer(20);
		NFLPlayer u = new NFLPlayer(21);
		NFLPlayer v = new NFLPlayer(22);
		NFLPlayer w = new NFLPlayer(23);
		NFLPlayer x = new NFLPlayer(24);
		NFLPlayer y = new NFLPlayer(25);
		NFLPlayer z = new NFLPlayer(26);
		playerArray.add(JohnDoe);
		playerArray.add(b);
		playerArray.add(c);
		playerArray.add(d);
		playerArray.add(e);
		playerArray.add(f);
		playerArray.add(g);
		playerArray.add(h);
		playerArray.add(i);
		playerArray.add(j);
		playerArray.add(k);
		playerArray.add(l);
		playerArray.add(m);
		playerArray.add(n);
		playerArray.add(o);
		playerArray.add(p);
		playerArray.add(q);
		playerArray.add(r);
		playerArray.add(s);
		playerArray.add(t);
		playerArray.add(u);
		playerArray.add(v);
		playerArray.add(w);
		playerArray.add(x);
		playerArray.add(y);
		playerArray.add(z);
		
	}	
}






 class NFLPlayer {
	// variable declaration
	private String name;
	private String playerType;    // Offense of Defense 
	private int yearsPro;
	private int careerTD;
	private int careerTackles;
	private int careerYards;
	private int age;
	private static int idNum;
	

	// Methods
	public static void setID(int newID){
		// set ID
		idNum = newID;
	}
	public int getID(){
		// get ID
		return idNum;
	}
	
	public void  setName(String newName) {
		// Set Name 
		name = newName;
	}
	public void setType(String newPlayerType){
		// Set Type
		playerType = newPlayerType;
	}
	public void setYears(int newYearsPro){
		//Set years Pro
		yearsPro = newYearsPro;
	} 
	public void setTD(int newCareerTD){
		// Set Career TD's 
		careerTD = newCareerTD;
	}
	public void setTackle(int newCareerTackles){
		// Set Career Tackles 
		careerTackles = newCareerTackles;
	}
	public void setYards(int newCareerYards){
		// Set Career Yards
		careerYards = newCareerYards;
	}
	public String getName(){
		// Get player name 
		return name;
	}
	public String getPlayerType(){
		// Get player type
		return playerType;
	}
	public int getYearsPro(){
		// Get years Pro
		return yearsPro;
	}
	public int getCareerTD(){
		// Get career TD's
		return careerTD;
	}
	public int getCareerTackles(){
		// Get career tackles 
		return careerTackles;
	}
	public int getCareerYards(){
		// Get career Yards
		return careerYards;
	}
	public int getAge(){
		// Get player age 
		return age;
	}
	
	// Constructors 
	
	NFLPlayer() {
		
	}
	NFLPlayer(int idNum) {
		
	}
	
	NFLPlayer(String name, String playerType, int yearsPro, int careerTD, int careerTackles, int careerYards, int careerAge, int idNum) {
		
	}
}

