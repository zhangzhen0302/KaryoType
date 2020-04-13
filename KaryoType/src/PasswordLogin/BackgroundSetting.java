package PasswordLogin;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
public class BackgroundSetting 
{
	private Rectangle background;
	private Color foregroundColor;
	public BackgroundSetting(Rectangle background, Color foregroundColor)
	{
		this.background = background;
		this.foregroundColor = foregroundColor;
		this.setting();
	}
	private void setting()
	{
		background.setX(0);
		background.setY(0);
		background.setArcHeight(15);
		background.setArcWidth(15);
		background.setFill(Color.rgb(0, 0, 0, .55));
		background.setStrokeWidth(1.5);
		background.setStroke(foregroundColor);
	}
}
