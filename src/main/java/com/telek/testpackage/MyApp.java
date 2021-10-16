package com.telek.testpackage;

import com.telek.Main;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

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
