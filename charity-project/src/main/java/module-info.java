module greengates.ib.charity.project {
    requires javafx.controls;
    requires javafx.fxml;

    opens greengates.ib.charity.project to javafx.fxml;
    exports greengates.ib.charity.project;
    exports greengates.ib.charity.project.controller;

    requires transitive javafx.graphics;
}