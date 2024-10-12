module com.migueljaque {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.migueljaque to javafx.fxml;
    exports com.migueljaque;
}
