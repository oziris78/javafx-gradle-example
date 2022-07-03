package com.twistral.testpackage;

import com.twistral.Main;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.media.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;
import javafx.util.*;


public class MyApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FlowPane pane = new FlowPane();

        // FONT TEST
        Text text = new Text("test text");
        text.setFont(Font.loadFont(Main.class.getResource("marcellus.ttf").toString(), 60d));
        text.setFill(Color.RED);
        pane.getChildren().addAll(text);

        // IMAGE TEST
        ImageView imageView = new ImageView(new Image(Main.class.getResource("tom.jpg").toString()));
        imageView.setFitWidth(300d);
        pane.getChildren().addAll(imageView);

        // AUDIO TEST
        Button btn = new Button("play audio");
        MediaPlayer mediaPlayer = new MediaPlayer(new Media(Main.class.getResource("hit.wav").toString()));
        btn.setOnAction(event -> {
            mediaPlayer.seek(Duration.ZERO);
            mediaPlayer.play();
        });
        pane.getChildren().add(btn);

        Scene scene = new Scene(pane, 300, 300);
        stage.setScene(scene);
        stage.show();
    }

}
