package lab;

import java.util.Scanner;

public class week2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter how many stops are on the route: ");
        int stopCount = keyboard.nextInt();

        System.out.print("Enter the bus's seating capacity: ");
        int capacity = keyboard.nextInt();
        
        keyboard.nextLine();

        String[] names = new String[stopCount];
        int[] boarding = new int[stopCount];
        int[] alighting = new int[stopCount];
        int[] occupancy = new int[stopCount];

        int current = 0;
        int overLimit = 0;
        int sum = 0;

        // Veri girişi ve anlık hata kontrolü
        for (int i = 0; i < stopCount; i++) {
            System.out.println("\n--- Stop " + (i + 1) + " ---");
            System.out.print("Enter stop name: ");
            names[i] = keyboard.nextLine();

            System.out.print("Passengers boarding at " + names[i] + ": ");
            boarding[i] = keyboard.nextInt();

            System.out.print("Passengers alighting at " + names[i] + ": ");
            alighting[i] = keyboard.nextInt();
            
            keyboard.nextLine();

            // İnen yolcu kontrolü veri girişi sırasında yapılıyor
            int hesaplanan = current + boarding[i] - alighting[i];
            if (hesaplanan < 0) {
                System.out.println("Data error at [" + names[i] + "]: cannot have more passengers alighting than are currently on the bus. Occupancy set to 0.");
                current = 0;
            } else {
                current = hesaplanan;
            }

            occupancy[i] = current;
        }
        
        System.out.println("\n--- TRIP ---");
        for (int i = 0; i < stopCount; i++) {
            System.out.println("Stop: " + names[i] + " -> Current passengers: " + occupancy[i]);
            
            if (occupancy[i] > capacity) {
                System.out.println("Warning: Bus is over capacity at [" + names[i] + "]!");
                overLimit++;
            }

            sum += occupancy[i];
        }

        System.out.println("---DETAILED REPORT ---");
        for (int i = 0; i < stopCount; i++) {
            System.out.println("Stop: " + names[i] + 
                               " | Boarding: " + boarding[i] + 
                               " | Alighting: " + alighting[i] + 
                               " | Occupancy: " + occupancy[i]);
        }
        
        int maxIndex = 0;
        for (int i = 1; i < stopCount; i++) {
            if (boarding[i] > boarding[maxIndex]) {
                maxIndex = i;
            }
        }

        double average = (double) sum / stopCount;

        System.out.println("\n--- STATISTICS ---");
        System.out.println("Busiest stop: " + names[maxIndex] + " (with " + boarding[maxIndex] + " boarding)");
        System.out.println("Average occupancy: " + average);
        System.out.println("Over capacity count: " + overLimit);

        if (current != 0) {
            System.out.println("Warning: " + current + " passengers still on the bus after final stop.");
        } else {
            System.out.println("All passengers successfully got off.");
        }
        
        keyboard.close();
    }
}