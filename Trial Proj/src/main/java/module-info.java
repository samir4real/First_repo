module cse213.trial_proj {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.trial_proj to javafx.fxml;
    exports cse213.trial_proj;
}