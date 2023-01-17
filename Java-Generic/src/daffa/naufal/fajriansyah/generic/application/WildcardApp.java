package daffa.naufal.fajriansyah.generic.application;

import daffa.naufal.fajriansyah.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {

        print(new MyData<Integer>(100));
        print(new MyData<String>("Daffa"));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));

    }

    public static void print(MyData<?> myData){
        System.out.println(myData.getData());
    }
}
