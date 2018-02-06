package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    private ArrayList<T> member = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (member.contains(player)) {
            System.out.println(player.getName() + " is already on this team.");
            return false;
        } else {
            member.add(player);
            System.out.println(player.getName() + " picked for the team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.member.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore == theirScore) {
            tied++;
        } else lost++;

        played++;

        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }


    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {        //current object vs given parameter
            return -1;
        }
        else if (this.ranking() < team.ranking()) {
            return 1;
        }
        else return 0;
    }
}
