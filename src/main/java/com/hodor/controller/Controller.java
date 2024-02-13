package com.hodor.controller;

import com.hodor.model.Donnees;
import com.hodor.view.FenetrePrincipale;

import javafx.stage.Stage;

public class Controller {
    private Stage stage;
    private Donnees donnees;
    private FenetrePrincipale fenetrePrincipale;

    public Controller(Stage stage) {
        this.stage = stage;
        this.donnees = new Donnees();
        this.fenetrePrincipale = new FenetrePrincipale(stage);
    }

    public void demarrer() {
        fenetrePrincipale.afficher();
    }
}
