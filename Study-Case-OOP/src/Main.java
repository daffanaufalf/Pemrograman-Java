import daffa.naufal.fajriansyah.Armor;
import daffa.naufal.fajriansyah.Player;
import daffa.naufal.fajriansyah.Weapon;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Gugul", 100);
        Player player2 = new Player("Onyon", 50);

        Weapon sword = new Weapon("Shuushui Sword", 15);
        Weapon knife = new Weapon("Kitchen Knife", 1);

        Armor bladeArmor = new Armor("Silver Blade Armor", 10);
        Armor tshirt = new Armor("T-Shirt", 0);

        player1.equipWeapon(sword);
        player1.equipArmor(bladeArmor);
        player1.display();

        player2.equipWeapon(knife);
        player2.equipArmor(tshirt);
        player2.display();

        System.out.println("\nVS");
        System.out.println("\nChapter 1");
        player1.attack(player2);
        player1.display();
        player2.display();

        System.out.println("\nChapter 2");
        player2.attack(player1);
        player1.display();
        player2.display();

    }
}