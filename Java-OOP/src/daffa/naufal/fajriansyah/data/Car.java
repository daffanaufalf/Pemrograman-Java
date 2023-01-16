// Membuat Interface
package daffa.naufal.fajriansyah.data;

import daffa.naufal.fajriansyah.annotation.Fancy;

@Fancy(name = "Car", tags = {"Application", "Java"})
public interface Car extends HasBrand, IsMaintenance {
    void drive();

    int getTire();

    default boolean isBig(){
        return false;
    }
}
