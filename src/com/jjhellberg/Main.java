package com.jjhellberg;

public class Main {

    public static void main(String[] args) {
        Logic logic = new Logic();
        System.out.println(logic.getStepCount(args[0]));
        System.out.println(logic.getStepCount2(args[0]));
    }
}
