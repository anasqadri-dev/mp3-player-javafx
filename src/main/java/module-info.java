module javafx.musicplayer {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.media;


    opens javafx.musicplayer to javafx.fxml;
    exports javafx.musicplayer;
}