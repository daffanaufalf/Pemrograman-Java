package daffa.naufal.fajriansyah.generic.application;

import daffa.naufal.fajriansyah.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Daffa");
        process(stringMyData);

        MyData<? extends Object> myData = stringMyData;

    }

    public static void process(MyData<? extends Object> myData){

        System.out.println(myData.getData()); // Covariant (Read only)

        // myData.setData(); // Error

    }
}
