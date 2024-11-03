package com.pr70.TP.TP4;

import javax.swing.*;
import java.awt.*;

public class BoutonCalculatrice extends JButton {
    public BoutonCalculatrice(String texte) {
        super(texte);
        setFont(new Font("Arial", Font.PLAIN, 24));
        setFocusPainted(false);
        setBorderPainted(false);
    }
}
