package com.itheima.a02oopextenddemo2;

public class Test {
    public static void main(String[] args) {
        Hasaki h = new Hasaki();
        h.eat();
        h.drink();
        h.destroyHome();
        h.homeGuard();

        ShapiDog s = new ShapiDog();
        s.eat();
        s.homeGuard();
        s.drink();

        ChineseDog c = new ChineseDog();
        c.eat();
        c.homeGuard();
        c.drink();
    }
}
