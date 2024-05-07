module com.samydev.gencv {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.samydev.gencv to javafx.fxml;
    exports com.samydev.gencv;
}