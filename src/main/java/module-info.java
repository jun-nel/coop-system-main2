module dev.jun {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires transitive core.fx;
    requires transitive core.db;
    requires javafx.base;
    requires core.util;
    requires atlantafx.base;
    requires javafx.graphics;

    opens dev.jun to javafx.fxml;
    opens dev.jun.app to javafx.fxml;
    

    exports dev.jun;
    exports dev.jun.app;
}
