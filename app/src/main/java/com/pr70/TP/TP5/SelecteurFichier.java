package com.pr70.TP.TP5;

import javax.swing.*;
import java.io.File;

public class SelecteurFichier {

    public String selectionnerFichierALire() {
        JFileChooser selecteur = new JFileChooser();
        int retour = selecteur.showOpenDialog(null);
        if(retour == JFileChooser.APPROVE_OPTION) {
           File fichier = selecteur.getSelectedFile();
           return fichier.getAbsolutePath();
        }
        return null;
    }

    public String selectionnerFichierAEcrire() {
        JFileChooser selecteur = new JFileChooser();
        int retour = selecteur.showSaveDialog(null);
        if(retour == JFileChooser.APPROVE_OPTION) {
           File fichier = selecteur.getSelectedFile();
           return fichier.getAbsolutePath();
        }
        return null;
    }
}
