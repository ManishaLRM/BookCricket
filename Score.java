package com.ScoreGenerator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class Score {
int ball;
int total;
int x;
//Score(){
	
//}
public int getBall() {
	return ball;
}

public void setBall(int ball) {
	this.ball = ball;
}

public int getTotal() {
	return total;
}

public void setTotal(int total) {
	this.total = total;
}

Score(int ball,int total){
	this.ball=ball;
	this.total=total;
}

public Score() {
	// TODO Auto-generated constructor stub
}

public int Myscore(int ball) {
	Random random = new Random();
	if(ball!=0)
		 //total=Math.abs(ThreadLocalRandom.current().nextInt());
		// x= total%10;
			total= Math.abs (random.nextInt());
		x= total%10;
		if(x>7) {
			x=x-3;
		}
		return x;
}
public  String ShowComentry(int x)
{
	//Random random = new Random();
	String strans;
	String ans ="";
	//Score s1=new Score();
	//if(ball!=0)
	 //total=Math.abs(ThreadLocalRandom.current().nextInt());
	// x= total%10;
		//total= Math.abs (random.nextInt());
	//x= total%10;
	 switch(x) {
	 case 0: ans = ShowComZero();
	 return ans;
	 case 1: return "One run";
	 		
	// break;
	 case 2: //System.out.println("Two Runs");
	 return "Two Runs";
	// break;
	 case 3:  return "three";//System.out.println("Three Runs");
	// break;
	 case 4: ans = ShowComFour();
		 return ans;//System.out.println(ShowComFour());
	 //break;
	 case 5: return "leg by 1 run";//System.out.println("Hit on helmet");
	// break;	
	 case 6: ans =  ShowComSix();
		 return ans ;//System.out.println(ShowComSix());
	 case 7: ans =  ShowComSeven();
	 return ans ;
	 
	 
	// break;
	 }
	 
	// strans= x+"hello";

	return ans;
}
public String ShowComZero(){
	String [] arr = {"LBW", "Clean Bold", "Catch out"};
    Random random = new Random();

    // randomly selects an index from the arr
    int select = random.nextInt(arr.length); 

    // prints out the value at the randomly selected index
  //  System.out.println("Random String selected: " + arr[select]);
    
	return arr[select];
}
public String ShowComFour(){
	String [] arr = {"Four Runs", "Grate four", "Super four", "Spendid shot for four"};
    Random random = new Random();

    // randomly selects an index from the arr
    int select = random.nextInt(arr.length); 

    // prints out the value at the randomly selected index
  //  System.out.println("Random String selected: " + arr[select]);
    
	return arr[select];
}
public String ShowComSeven(){
	String [] arr = {"Oh it's wide", "Oh it's no ball", "Free hit"};
    Random random = new Random();

    // randomly selects an index from the arr
    int select = random.nextInt(arr.length); 

    // prints out the value at the randomly selected index
  //  System.out.println("Random String selected: " + arr[select]);
    
	return arr[select];
}
public String ShowComSix(){
	String [] arr = {"Six Runs", "What a Spldid Six", "Super Six", " what a long six"};
    Random random = new Random();

    // randomly selects an index from the arr
    int select = random.nextInt(arr.length); 

    // prints out the value at the randomly selected index
  //  System.out.println("Random String selected: " + arr[select]);
    
	return arr[select];
}
/*public int ProbableCount( int total) {
	int Range= total%100;
	
			return Range;
}*/
	public boolean IsLegal1(int x) {
		//String Illiegal="";
		
		if(x==7){
			return false;
		}
				
	return true;
	
	
	}


}//class ends here
