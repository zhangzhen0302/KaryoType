package PasswordLogin;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class BasicElement 
{
	private Text userName;
	private HBox userNameCell;
	private User user;
	private SVGPath padLock;
	private Stage primaryStage;
	private Color foregroundColor;
	public BasicElement(User user, Text userName, HBox userNameCell,
			SVGPath padLock, Stage primaryStage, Color foregroundColor)
	{
		this.user = user;
		this.userName = userName;
		this.userNameCell = userNameCell;
		this.padLock = padLock;
		this.primaryStage = primaryStage;
		this.foregroundColor = foregroundColor;
		this.setting();
	}
	private void setting()
	{
		userName.setFont(Font.font("SanSerif", FontWeight.BOLD, 30));
		userName.setFill(foregroundColor);
		userName.setSmooth(true);
		userName.textProperty()
			.bind(user.userNameProperty());
		// wrap text node
		userNameCell.prefWidthProperty()
			.bind(primaryStage.widthProperty()
					.subtract(45));
		userNameCell.getChildren().add(userName);
		// pad lock
		padLock.setFill(foregroundColor);
		padLock.setContent("M24.875,15.334v-4.876c0-4.894-3.981-8.875-8.875-8.875s-8.875,3.9818.875,8.875v4.876H5.042v15.083h21.916V15.334H24.875zM10.625,10.458c0-2.964,2.411-5.375,5.3755.375s5.375,2.411,5.375,5.375v4.876h-10.75V10.458zM18.272,26.956h-4.545l1.222-3.667c-0.782-0.3891.324-1.188-1.324-2.119c0-1.312,1.063-2.375,2.375-2.375s2.375,1.062,2.375,2.375c0,0.932-0.542,1.731.324,2.119L18.272,26.956z");
	}
}
