package com.ScoreGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Score s1=new Score();
        int x1=s1.Myscore(30);
        System.out.println(x1);
        String commentry=s1.ShowComentry(x1);
        System.out.println(commentry);
        boolean Check=s1.IsLegal1(x1);
        System.out.println(Check);
        
    
        
        //System.out.println(ThreadLocalRandom.current().nextInt());
    }

}