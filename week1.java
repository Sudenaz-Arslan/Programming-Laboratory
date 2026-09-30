package lab;

import java.util.Scanner;

public class week1 {

    public static void main(String[] args) {

        Scanner keyb = new Scanner(System.in);

        int[] matchA = new int[5];
        int[] matchB = new int[5];
        int[] matchC = new int[5];
        int[] matchD = new int[5];

        System.out.println("Match 1 :Team A vs Team B" );
        System.out.println("Match 2 :Team A vs Team C" );
        System.out.println("Match 3 :Team A vs Team D" );
        System.out.println("Match 4 :Team B vs Team C" );
        System.out.println("Match 5 :Team B vs Team D" );
        System.out.println("Match 6 :Team C vs Team D" );
        System.out.println("-------------------------" );

        // --- MATCH 1 ---
        System.out.println("Match 1 :Team A vs Team B");
        System.out.print("Team A goals : ");
        int a1 = keyb.nextInt();
        matchA[0] += a1;

        System.out.print("Team B goals : ");
        int b1 = keyb.nextInt();
        matchB[0] += b1;

        matchA[1] += b1;
        matchB[1] += a1;

        if (a1 > b1) {
            System.out.println("Team A wins.");
            matchA[2] += 1;
            matchB[4] += 1;
        } else if (a1 < b1) {
            System.out.println("Team B wins.");
            matchB[2] += 1;
            matchA[4] += 1;
        } else {
            System.out.println("The Teams Draws.");
            matchA[3] += 1;
            matchB[3] += 1;
        }
        // --- MATCH 2 ---
        System.out.println("\nMatch 2 :Team A vs Team C");
        System.out.print("Team A goals : ");
        int a2 = keyb.nextInt();
        matchA[0] += a2;

        System.out.print("Team C goals : ");
        int c2 = keyb.nextInt();
        matchC[0] += c2;

        matchA[1] += c2;
        matchC[1] += a2;
        if (a2 > c2) {
            System.out.println("Team A wins.");
            matchA[2] += 1;
            matchC[4] += 1;
        } else if (a2 < c2) {
            System.out.println("Team C wins.");
            matchC[2] += 1;
            matchA[4] += 1;

        } else {
            System.out.println("The Teams Draws.");
            matchA[3] += 1;
            matchC[3] += 1;
        }
        // --- MATCH 3 ---
        System.out.println("\nMatch 3 :Team A vs Team D");
        System.out.print("Team A goals : ");
        int a3 = keyb.nextInt();
        matchA[0] += a3;

        System.out.print("Team D goals : ");
        int d3 = keyb.nextInt();
        matchD[0] += d3;

        matchA[1] += d3;
        matchD[1] += a3;

        if (a3 > d3) {
            System.out.println("Team A wins.");
            matchA[2] += 1;
            matchD[4] += 1;
        } else if (a3 < d3) {
            System.out.println("Team D wins.");
            matchD[2] += 1;
            matchA[4] += 1;
        } else {
            System.out.println("The Teams Draws.");
            matchA[3] += 1;
            matchD[3] += 1;
        }
        // --- MATCH 4 ---
        System.out.println("\nMatch 4 :Team B vs Team C");
        System.out.print("Team B goals : ");
        int b4 = keyb.nextInt();
        matchB[0] += b4;

        System.out.print("Team C goals : ");
        int c4 = keyb.nextInt();
        matchC[0] += c4;

        matchB[1] += c4;
        matchC[1] += b4;

        if (b4 > c4) {
            System.out.println("Team B wins.");
            matchB[2] += 1;
            matchC[4] += 1;
        } else if (b4 < c4) {
            System.out.println("Team C wins.");
            matchC[2] += 1;
            matchB[4] += 1;
        } else {
            System.out.println("The Teams Draws.");
            matchB[3] += 1;
            matchC[3] += 1;
        }

        // --- MATCH 5 ---
        System.out.println("\nMatch 5 :Team B vs Team D");
        System.out.print("Team B goals : ");
        int b5 = keyb.nextInt();
        matchB[0] += b5;
        
        System.out.print("Team D goals : ");
        int d5 = keyb.nextInt();
        matchD[0] += d5;

        matchB[1] += d5;
        matchD[1] += b5;

        if (b5 > d5) {
            System.out.println("Team B wins.");
            matchB[2] += 1;
            matchD[4] += 1;
        } else if (b5 < d5) {
            System.out.println("Team D wins.");
            matchD[2] += 1;
            matchB[4] += 1;

        } else {
            System.out.println("The Teams Draws.");
            matchB[3] += 1;
            matchD[3] += 1;
        }
        // --- MATCH 6 ---
        System.out.println("\nMatch 6 :Team C vs Team D");
        System.out.print("Team C goals : ");
        int c6 = keyb.nextInt();
        matchC[0] += c6;

        System.out.print("Team D goals : ");
        int d6 = keyb.nextInt();
        matchD[0] += d6;

        matchC[1] += d6;
        matchD[1] += c6;

        if (c6 > d6) {
            System.out.println("Team C wins.");
            matchC[2] += 1;
            matchD[4] += 1;
        } else if (c6 < d6) {
            System.out.println("Team D wins.");
            matchD[2] += 1;
            matchC[4] += 1;

        } else {
            System.out.println("The Teams Draws.");
            matchC[3] += 1;
            matchD[3] += 1;
        }
        System.out.println("\n-------------------------");

        // --- PUAN VE AVERAJ HESAPLAMALARI ---
        int totalpointA = (matchA[2] * 3) + matchA[3];
        int avgA = matchA[0] - matchA[1];
        int totalpointB = (matchB[2] * 3) + matchB[3];
        int avgB = matchB[0] - matchB[1];
        
        int totalpointC = (matchC[2] * 3) + matchC[3];
        int avgC = matchC[0] - matchC[1];

        int totalpointD = (matchD[2] * 3) + matchD[3];
        int avgD = matchD[0] - matchD[1];

        // tablo

        System.out.println("TEAM A");
        System.out.println("Team A plays 3 match .");
        System.out.println("Wins : " + matchA[2] + " Draws : " + matchA[3] + " Loses : " + matchA[4]);
        System.out.println("Total point : " + totalpointA + " Avg : " + avgA + "\n");

        System.out.println("TEAM B");
        System.out.println("Team B plays 3 match .");
        System.out.println("Wins : " + matchB[2] + " Draws : " + matchB[3] + " Loses : " + matchB[4]);
        System.out.println("Total point : " + totalpointB + " Avg : " + avgB + "\n");

        System.out.println("TEAM C");
        System.out.println("Team C plays 3 match .");
        System.out.println("Wins : " + matchC[2] + " Draws : " + matchC[3] + " Loses : " + matchC[4]);
        System.out.println("Total point : " + totalpointC + " Avg : " + avgC + "\n");

        System.out.println("TEAM D");
        System.out.println("Team D plays 3 match .");
        System.out.println("Wins : " + matchD[2] + " Draws : " + matchD[3] + " Loses : " + matchD[4]);
        System.out.println("Total point : " + totalpointD + " Avg : " + avgD + "\n");

        System.out.println("-------------------------");
        // şampiyon ve en çok gol atan takım
        
        String[] teamNames = {"Team A", "Team B", "Team C", "Team D"};
        int[] points = {totalpointA, totalpointB, totalpointC, totalpointD};
        int[] goalDiffs = {avgA, avgB, avgC, avgD};
        int[] goalsFor = {matchA[0], matchB[0], matchC[0], matchD[0]};

        int championIndex = 0;
        int topScorerIndex = 0;
        
        for (int i = 1; i < 4; i++) {
            if (points[i] > points[championIndex]) {
                championIndex = i;
            } 
            // Puanlar eşitse averaja (Goal Difference) bakar
            else if (points[i] == points[championIndex]) {
                if (goalDiffs[i] > goalDiffs[championIndex]) {
                    championIndex = i;
                }
            }

            // En çok gol atan takımı bulma
            if (goalsFor[i] > goalsFor[topScorerIndex]) {
                topScorerIndex = i;
            }
        }
        System.out.println("Tournament Champion: " + teamNames[championIndex]);
        System.out.println("Top Scoring Team: " + teamNames[topScorerIndex] + " (with " + goalsFor[topScorerIndex] + " goals)");

    }

}