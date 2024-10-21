package com.pr70.TP.TP1.Occurence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Occurence {
    private String sourceText;
    private String sibleText;
    private final ArrayList<String> voyelles = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u", "y"));

    public Occurence(String sourceText, String sibleText) {
        this.sourceText = sourceText;
        this.sibleText = sibleText;
    }

    public int compterOccurence() {
        return StringUtils.countMatches(this.sourceText, this.sibleText);
    }

    public String contientVoyelles() {
        StringBuilder result = new StringBuilder();
        for (String voyelle : voyelles) {
            String contient = StringUtils.contains(this.sourceText.toLowerCase(), voyelle) ? "Oui" : "Non";
            result.append(voyelle).append(": ").append(contient).append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("- Entrer le texte dans lequel vous souhaitez rechercher : ");
        String source = scanner.nextLine();
        System.out.print("- Entrer le texte que vous souhaitez chercher : ");
        String sible = scanner.nextLine();

        Occurence occurence = new Occurence(source, sible);

        System.out.println("* Votre texte contient " + occurence.compterOccurence() + " fois la chaîne de caractères '" + sible + "'.");

        System.out.println("* Analyse de voyelles : ");
        System.out.println(occurence.contientVoyelles());

        scanner.close();
    }
}
