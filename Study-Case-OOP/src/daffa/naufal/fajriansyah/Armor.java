package daffa.naufal.fajriansyah;

public class Armor {

    String name;
    double defencePower;

    public Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    public void display() {
        System.out.println("Armor: " + this.name + " \nDefence: " + this.defencePower);
    }

}