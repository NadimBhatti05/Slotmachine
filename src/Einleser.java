import java.time.LocalDate;
import java.util.Scanner;

public class Einleser {
   static Scanner scanner;

   public Einleser() {
      scanner = new Scanner(System.in);

   }
   public double readDouble() {
      while(!scanner.hasNextDouble()) {
         System.out.println("Bitte eine zahle eingeben");
         scanner.next();
      }
      double zahl1 = scanner.nextDouble();
      scanner.nextLine(); //Um /n loszuwerden
      return zahl1;
   }
   public int readInt() {
      while(!scanner.hasNextInt()) {
         System.out.println("Bitte eine Ganzzahl eingeben");
         scanner.next();
      }
      int zahl = scanner.nextInt();
      scanner.nextLine();
      return zahl;
   }
   public boolean readBoolean() {
      while(!scanner.hasNextBoolean()) {
         System.out.println("Bitte einen true oder false eingeben");
      }
      boolean bool = scanner.nextBoolean();
      scanner.nextLine();
      return bool;
   }
   public boolean readBooleanGerman() {
      boolean bool;
      String insert = scanner.nextLine();
      if (insert.equalsIgnoreCase("Ja")) {
         bool = true;
      }else if(insert.equalsIgnoreCase("nein")) {
         bool = false;
      }
      else {
         System.out.println("Geben sie ja oder nein ein");
         bool = readBooleanGerman();
      }

      return bool;
   }
   public char readChar() {
      char ch = scanner.nextLine().charAt(0);
      while(!Character.isLetter(ch)) {
         System.out.println("Bitte einen Buchstaben eingeben");
         ch = scanner.nextLine().charAt(0);
      }

      return ch;
   }
   public LocalDate getDatum() {

      int year;
      int month;
      int day;

      System.out.println("Bitte das Jahr eingeben");
      year = readInt();

      System.out.println("Bitte dem Monat eingeben");
      month = readInt();

      System.out.println("Bitte den Tag eingeben");
      day = readInt();

      LocalDate datum = LocalDate.of(year, month, day);

      return datum;


   }
   public String readString() {
      while (!scanner.hasNext()) {
         System.out.println("Bitte einen String eingeben");
         scanner.nextLine();
      }
      return scanner.next();
   }

}

