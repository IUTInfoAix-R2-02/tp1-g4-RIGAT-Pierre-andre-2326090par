package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {

        // conteneur principal
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.TOP_CENTER);

        // conteneur central
        HBox centre = new HBox();

        // les boutons à la vertical
        VBox gauche = new VBox();
        gauche.setAlignment(Pos.CENTER);
        gauche.setSpacing(5);

        // les boutons normaux dans le conteneur central gauche
        Text textBtn = new Text("Boutons :");
        Button btn1 = new Button("Bouton 1");
        Button btn2 = new Button("Bouton 2");
        Button btn3 = new Button("Bouton 3");
        gauche.getChildren().addAll(textBtn, btn1, btn2, btn3);
        gauche.setAlignment(Pos.CENTER);
        gauche.setPadding(new Insets(Pos.CENTER.ordinal(), Pos.CENTER.ordinal(), Pos.CENTER.ordinal(), Pos.CENTER.ordinal()));

        centre.getChildren().add(gauche);

        Separator sepMilieu = new Separator();
        sepMilieu.setOrientation(Orientation.VERTICAL);
        centre.getChildren().add(sepMilieu);

        // les boutons à la vertical
        GridPane centreV = new GridPane();
        centreV.setAlignment(Pos.CENTER);
        centreV.setHgap(10);
        centreV.setVgap(10);

        Text name = new Text("Name:");
        TextField text = new TextField();

        Text email = new Text("Email:");
        TextField textE = new TextField();

        Text password = new Text("Password:");
        TextField textP = new TextField();

        Button btnSubmit = new Button("Submit");
        Button btnCancel = new Button("Cancel");

        centreV.add(name, 0, 0);
        centreV.add(text, 1, 0);
        centreV.add(email, 0, 1);
        centreV.add(textE, 1, 1);
        centreV.add(password, 0, 2);
        centreV.add(textP, 1, 2);
        centreV.add(btnSubmit, 0, 3);
        centreV.add(btnCancel, 1, 3);
        centreV.setAlignment(Pos.CENTER);
        centreV.setPadding(new Insets(50, 50, 50, 50));

        centre.getChildren().add(centreV);

        // la barre qui contient File, Edit, Help
        MenuBar barreOption = new MenuBar();

        // les textes File, Edit, Help dans la barre
        Menu file = new Menu("File");
        MenuItem newT = new MenuItem("New");
        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        MenuItem close = new MenuItem("Close");
        file.getItems().addAll(newT, open, save, close);

        Menu edit = new Menu("Edit");
        MenuItem copy = new MenuItem("Copy");
        MenuItem cut = new MenuItem("Cut");
        MenuItem paste = new MenuItem("Paste");
        edit.getItems().addAll(copy, cut, paste);

        Menu help = new Menu("Help");
        barreOption.getMenus().addAll(file, edit, help);

        Label basDePage = new Label("Ceci est un label de bas de page");
        basDePage.setAlignment(Pos.BOTTOM_CENTER);

        Separator sepFin = new Separator();

        vbox.getChildren().addAll(barreOption, centre, sepFin, basDePage);

        Scene mainScene = new Scene(vbox);

        primaryStage.setScene(mainScene);
        primaryStage.setWidth(600);
        primaryStage.setHeight(450);
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

