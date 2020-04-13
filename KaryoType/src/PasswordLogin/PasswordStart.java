/*
 * 
 * this class is to open the windows of password
 * 
 */
package PasswordLogin;
import BackgroundPackage.WindowInitialize;
import javafx.beans.property.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class PasswordStart 
{
	private Stage primaryStage = new Stage();
	private final static String MY_PASS = "password1";
	private final static BooleanProperty GRANTED_ACCESS = new SimpleBooleanProperty(false);
	private final static int MAX_ATTEMPTS = 3;
	private final IntegerProperty ATTEMPTS = new SimpleIntegerProperty(0);
	private WindowInitialize window;
	public PasswordStart(WindowInitialize window)
	{
		this.window = window;
		this.start();
	}
	private void start()
	{
		// create a model representing a user
				User user = new User();
				// create a transparent stage
				primaryStage.initStyle(StageStyle.TRANSPARENT);
				Group root = new Group();
				Scene scene = new Scene(root, 320, 112, Color.rgb(0, 0, 0, 0));
				primaryStage.setScene(scene);
				// all text, borders, svg paths will use white
				Color foregroundColor = Color.rgb(255, 255, 255, .9);
				// rounded rectangular background
				Rectangle background = new Rectangle(320, 112);
				new BackgroundSetting(background, foregroundColor);
				// a read only field holding the user name.
				Text userName = new Text();
				// wrap text node
				HBox userNameCell = new HBox();
				// pad lock
				SVGPath padLock = new SVGPath();
				new BasicElement(user, userName, userNameCell,
						padLock, primaryStage, foregroundColor);
				// first row
				HBox row1 = new HBox();
				row1.getChildren()
					.addAll(userNameCell, padLock);
				// password text field
				PasswordField passwordField = new PasswordField();
				passwordField.setFont(Font.font("SanSerif", 20));
				passwordField.setPromptText("Password");
				passwordField.setStyle("-fx-text-fill:black; "
						+ "-fx-prompt-text-fill:gray; "
						+ "-fx-highlight-text-fill:black; "
						+ "-fx-highlight-fill: gray; "
						+ "-fx-background-color: rgba(255, 255, 255, .80); ");
				passwordField.prefWidthProperty()
					.bind(primaryStage.widthProperty()
						.subtract(55));
				user.passwordProperty()
					.bind(passwordField.textProperty());
				// error icon
				SVGPath deniedIcon = new SVGPath();
				deniedIcon.setFill(Color.rgb(255, 0, 0, .9));
				deniedIcon.setStroke(Color.WHITE);
				//
				deniedIcon.setContent("M24.778,21.419 19.276,15.917 24.777,10.415 21.949,7.585 16.447,13.087 10.945,7.585 8.117,10.415 13.618,15.917 8.116,21.419 10.946,24.248 16.447,18.746 21.948,24.248z");
				deniedIcon.setVisible(false);
				SVGPath grantedIcon = new SVGPath();
				grantedIcon.setFill(Color.rgb(0, 255, 0, .9));
				grantedIcon.setStroke(Color.WHITE);
				//
				grantedIcon.setContent("M2.379,14.729 5.208,11.899 12.958,19.648 25.877,6.733 28.707,9.561 12.958,25.308z");
				grantedIcon.setVisible(false);
				StackPane accessIndicator = new StackPane();
				accessIndicator.getChildren()
					.addAll(deniedIcon, grantedIcon);
				accessIndicator.setAlignment(Pos.CENTER_RIGHT);
				grantedIcon.visibleProperty().bind(GRANTED_ACCESS);
				// second row
				HBox row2 = new HBox(3);
				row2.getChildren()
					.addAll(passwordField, accessIndicator);
				HBox.setHgrow(accessIndicator, Priority.ALWAYS);
				// user hits the enter key
				passwordField.setOnAction(actionEvent -> {
					if (GRANTED_ACCESS.get()) {
						//System.out.printf("User %s is granted access.\n",user.getUserName());
						//System.out.printf("User %s entered the password: %s\n",user.getUserName(), user.getPassword());
						//Platform.exit();
						primaryStage.close();
						window.show();
						} 
					else {                 
						deniedIcon.setVisible(true);
						}
					ATTEMPTS.set(ATTEMPTS.add(1).get());
					//System.out.println("Attempts: " + ATTEMPTS.get());
					
					});
				// listener when the user types into the password field
				passwordField.textProperty().addListener((obs, ov, nv) -> {
					boolean granted = passwordField.getText()
							.equals(MY_PASS);
					GRANTED_ACCESS.set(granted);
					if (granted) {
						deniedIcon.setVisible(false);
						
						}
					});
				// listener on number of attempts
				ATTEMPTS.addListener((obs, ov, nv) -> {
					if (MAX_ATTEMPTS == nv.intValue()) {
						// failed attemps
						System.out.printf("User %s is denied access.\n",
								user.getUserName());
						//Platform.exit();
						primaryStage.close();
						
						
						}
					});
				VBox formLayout = new VBox(4);
				formLayout.getChildren().addAll(row1, row2);
				formLayout.setLayoutX(12);
				formLayout.setLayoutY(12);
				root.getChildren().addAll(background, formLayout);
				primaryStage.show();	

	}
	
}
