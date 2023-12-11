module es.ieslosmontecillos.tableviewjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.tableviewjavafx to javafx.fxml;
    exports es.ieslosmontecillos.tableviewjavafx;
}