package com.hodor.view;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FenetrePrincipale {
    private Stage stage;
    private BorderPane root;
    private TabPane tabPane;

    public FenetrePrincipale(Stage stage) {
        this.stage = stage;
        root = new BorderPane();
        tabPane = new TabPane();
        root.setCenter(tabPane);
        initialiserMenuBar();
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Votre application");
    }

    private void initialiserMenuBar() {
        MenuBar menuBar = new MenuBar();

        // Menu Fichier
        Menu menuFichier = new Menu("Fichier");
        MenuItem menuItemNouveau = new MenuItem("Nouveau");
        MenuItem menuItemOuvrir = new MenuItem("Ouvrir");
        MenuItem menuItemEnregistrer = new MenuItem("Enregistrer");
        MenuItem menuItemQuitter = new MenuItem("Quitter");
        menuFichier.getItems().addAll(menuItemNouveau, menuItemOuvrir, menuItemEnregistrer, menuItemQuitter);

        // Menu Aide
        Menu menuAide = new Menu("Aide");
        MenuItem menuItemAPropos = new MenuItem("À propos");

        menuAide.getItems().add(menuItemAPropos);

        // Ajouter d'autres menus et éléments de menu ici si nécessaire

        menuBar.getMenus().addAll(menuFichier, menuAide);
        root.setTop(menuBar);

        ajouterOnglet("onglet 1");
        ajouterOnglet("onglet 2");
    }

    public void ajouterOnglet(String nomOnglet) {
        Tab onglet = new Tab(nomOnglet);
        tabPane.getTabs().add(onglet);
    }

    public void afficher() {
        stage.show();
    }
}
