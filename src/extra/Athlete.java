package extra;

public class Athlete {

    static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;
    

Athlete (String name, int speed){
    this.name = name;
    this.speed = speed;
    nextBibNumber = nextBibNumber + 1;
    bibNumber = nextBibNumber;
}
String getName(){
	return name;
}

int getBibNumber() {
	return bibNumber;
}

public static void main(String[] args) {
    //create two athletes      //print their names, bibNumbers, and the location of their race. }
Athlete matt = new Athlete("Matt", 0);
Athlete notMatt = new Athlete("notMatt", 1);

System.out.println(matt.getName());
System.out.println(notMatt.getName());
System.out.println(matt.getBibNumber());
System.out.println(notMatt.getBibNumber());
System.out.println(raceLocation);


}
}
