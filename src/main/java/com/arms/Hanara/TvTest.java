package com.arms.Hanara;
class Tv {
    String color;
    boolean power;
    int chanel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++chanel;
    }

    void channelDown() {
        --chanel;
    }
}
class TvTest {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.chanel = 7;
        t.channelDown();
        System.out.println("현재채널은" + t.chanel + "입니다.");
    }
}
