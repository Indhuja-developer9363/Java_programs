//EXAMPLE FOR INHERITANCE
class Team{
    String name;
    String strength;
    Team(){
        name = "Dhoni";
        strength = "Hardworker";
    }
    void display(){
        System.out.println(name+" "+strength);
    }
}
class Cricket extends Team{
    String Team1;
    int members;

    Cricket( String Team1,int members){
        this.Team1=Team1;
        this.members=members;
    }
    void details(){
        System.out.println("CSK..!");
    }
}
public class Exinheri{
    public static void main(String[]args){
        Team c = new Team("Dhoni",7);
        c.display();
        c.details();
    }
}