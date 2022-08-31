import java.util.Random;
public class SlotApp {
   public static void main(String[] args) {
      Einleser einleser = new Einleser();
      Random random = new Random();
      double budget = 0;
      double einsatz = 0;
      while(einsatz != 0.5 && einsatz != 1 && einsatz != 5 && einsatz != 10 && einsatz != 50 && einsatz != 100){
         System.out.print(
             "Wählen Sie ihren Einsatz aus" +
                 "\n[0.5], [1], [5], [10], [50] oder [100] CHF" +
                 "\n   > "
         );
         einsatz = einleser.readDouble();
      }
      System.out.print("Wie gross ist ihr Budget?   > ");
      budget = einleser.readDouble();
      String y = "";
      while (!y.equalsIgnoreCase("x")){
         System.out.print(
             "\n[s] um zu drehen" +
                 "\n[x] um aufzuhören" +
                 "\n[r] für Regeln/Infos" +
                 "\n   > "
         );
         y = einleser.readString();
         if (y.equalsIgnoreCase("s") && budget-einsatz >= 0){
            System.out.println("\nEinsatz: " + einsatz + "\n");
            int slot1 = random.nextInt(9);
            int slot2 = random.nextInt(9);
            int slot3 = random.nextInt(9);
            for (int i = 0; i < 8; i++) {
               System.out.print("     |     " + SlotBilder.bilder[slot1][i] + "     |     ");
               System.out.print("     |     " + SlotBilder.bilder[slot2][i] + "     |     ");
               System.out.print("     |     " + SlotBilder.bilder[slot3][i] + "     |     ");
               System.out.println(" ");
            }
            if(slot1 == 0 && slot2 == 0 && slot3 == 0){
               budget += einsatz*50;
               System.out.println("\nJACKPOT!!!!!");
            }
            else if(slot1 == 0 || slot2 == 0 || slot3 == 0){
               budget += einsatz*2;
            }
            else if(

                slot1 == 1 && slot2 == 1 && slot3 == 1 ||
                    slot1 == 2 && slot2 == 1 && slot3 == 1 ||
                    slot1 == 2 && slot2 == 2 && slot3 == 1 ||
                    slot1 == 1 && slot2 == 2 && slot3 == 1 ||
                    slot1 == 1 && slot2 == 1 && slot3 == 2 ||
                    slot1 == 2 && slot2 == 1 && slot3 == 2 ||
                    slot1 == 1 && slot2 == 2 && slot3 == 2 ||
                slot1 == 2 && slot2 == 2 && slot3 == 2 ||
                slot1 == 3 && slot2 == 3 && slot3 == 3 ||
                    slot1 == 4 && slot2 == 3 && slot3 == 3 ||
                    slot1 == 3 && slot2 == 4 && slot3 == 3 ||
                    slot1 == 3 && slot2 == 3 && slot3 == 4 ||
                    slot1 == 4 && slot2 == 4 && slot3 == 3 ||
                    slot1 == 3 && slot2 == 4 && slot3 == 4 ||
                    slot1 == 4 && slot2 == 3 && slot3 == 4 ||
                slot1 == 4 && slot2 == 4 && slot3 == 4 ||
                slot1 == 5 && slot2 == 5 && slot3 == 5 ||
                    slot1 == 6 && slot2 == 5 && slot3 == 5 ||
                    slot1 == 5 && slot2 == 6 && slot3 == 5 ||
                    slot1 == 5 && slot2 == 5 && slot3 == 6 ||
                    slot1 == 6 && slot2 == 6 && slot3 == 5 ||
                    slot1 == 5 && slot2 == 6 && slot3 == 6 ||
                    slot1 == 6 && slot2 == 5 && slot3 == 6 ||
                slot1 == 6 && slot2 == 6 && slot3 == 6 ||
                slot1 == 7 && slot2 == 7 && slot3 == 7 ||
                    slot1 == 7 && slot2 == 8 && slot3 == 7 ||
                    slot1 == 8 && slot2 == 7 && slot3 == 7 ||
                    slot1 == 7 && slot2 == 7 && slot3 == 8 ||
                    slot1 == 8 && slot2 == 8 && slot3 == 7 ||
                    slot1 == 7 && slot2 == 8 && slot3 == 8 ||
                    slot1 == 8 && slot2 == 7 && slot3 == 8 ||
                slot1 == 8 && slot2 == 8 && slot3 == 8

            ) {
               budget += einsatz*12;
               System.out.println("\nGlückwunsch! Sie haben eine Reihe!");
            }
            budget -= einsatz;
            System.out.println("\nBudget: " + budget);
         }
         else if(budget-einsatz < 0){
            System.out.println("\nSie haben kein Geld mehr!");
            y = "x";
         }
         else if(y.equalsIgnoreCase("r")){
            System.out.println(
                " - 1 Mal \"F\" = Gewinn von: " + einsatz*2 + " CHF" +
                    "\n - 3 Mal eine Frucht = Gewinn von: " + einsatz*30 + " CHF" +
                    "\n - Jackpot: 3 Mal \"F\" = Gewinn von: " + einsatz*150 + " CHF"

            );
         }

      }

   }
}
