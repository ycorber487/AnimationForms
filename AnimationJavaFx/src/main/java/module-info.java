module org.example.animationjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.animationjavafx to javafx.fxml;
    exports org.example.animationjavafx;
}