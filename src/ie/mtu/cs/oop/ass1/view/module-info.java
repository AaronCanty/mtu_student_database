/* Aaron Canty
 * R00206055
 * Phase 3
 */
module OOP_ASS1_R00206055 {
		requires javafx.controls;
		requires javafx.graphics;
		requires javafx.base;
		
		opens ie.mtu.cs.oop.ass1.view to javafx.graphics, javafx.fxml, javafx.controls;
		opens ie.mtu.cs.oop.ass1.controller to javafx.graphics, javafx.fxml, javafx.controls;
		opens ie.mtu.cs.oop.ass1.model to javafx.graphics, javafx.fxml;


}
