module com.samydev.gencv {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires spring.data.commons;
    requires jakarta.persistence;
    requires lombok;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires itextpdf;

    opens com.samydev.gencv to javafx.fxml;
    exports com.samydev.gencv;
}