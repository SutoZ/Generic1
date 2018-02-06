package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<> ();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add(6);


        printDoubled(items);

        FootBallPlayer joe = new FootBallPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        FootBallPlayer beckham = new FootBallPlayer("Beckham");

        Team<FootBallPlayer> asd = new Team<>("Asd");
        asd.addPlayer(joe);
      //  asd.addPlayer(pat);
      //  asd.addPlayer(Beckham);

        System.out.println(asd.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<FootBallPlayer> brokenTeam = new Team<>("This won't work!");
        brokenTeam.addPlayer(beckham);

        asd.matchResult(brokenTeam,2,5);


        System.out.println("Rankings");

        System.out.println(asd.getName() + ": " + asd.ranking());
        System.out.println(brokenTeam.getName()+ ": "  + brokenTeam.ranking());
        System.out.println();
        System.out.println(brokenTeam.compareTo(asd));
        System.out.println(asd.compareTo(brokenTeam));
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for(int i : n) {
            System.out.println( i * 2);

        }
    }
}
