package org.fundamentals;

import java.util.Scanner;

public class FerragniParty {
    public static void main(String[] args) {
        String[] Invitati={"Dua Lipa","Paris Hilton","Manuel Agnelli", "J-Ax","Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei"," Martina Maccherone",
                "Rachel Zeilic"};
        String nomeUtente;
        Scanner keyboardReader = new Scanner(System.in);
        boolean isInvited = false;
        System.out.print("come ti chiami?");
        nomeUtente = keyboardReader.nextLine();
        for (int i = 0; i < Invitati.length; i++) {
            if (Invitati[i].equals(nomeUtente)){
                isInvited = true;
                break;
            }

        }
        if (isInvited){
            System.out.println("Entra");
        }
        else{
            System.out.println("Vai via!Non penso proprio!");
        }
    }
}
