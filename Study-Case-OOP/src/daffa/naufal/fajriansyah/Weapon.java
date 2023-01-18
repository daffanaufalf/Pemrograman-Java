package daffa.naufal.fajriansyah;

public class Weapon {

    String name;
    double attackPower;

    public Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    public void display() {
        System.out.println("Weapon: " + this.name + " \nAttack: " + this.attackPower);
    }

}