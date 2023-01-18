package daffa.naufal.fajriansyah;

public class Player {

    String name;
    double health;
    int level;

    public Weapon weapon;
    public Armor armor;

    public Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public void attack(Player enemy) {
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " Attacking " + enemy.name + " With Power " + attackPower);
        enemy.defence(attackPower);
    }

    public void defence (double attackPower) {

        double damage;

        if (this.armor.defencePower < attackPower){
            damage = attackPower - this.armor.defencePower;
        } else {
            damage = 0;
        }

        this.health -= damage;
        System.out.println(this.name + " Gets Damage " + damage);

    }

    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void equipArmor(Armor armor) {
        this.armor = armor;
    }

    public void display() {
        System.out.println("\nName: " + this.name);
        System.out.println("Health: " + this.health + " Hp");
        this.weapon.display();
        this.armor.display();
    }

}