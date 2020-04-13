package BackgroundPackage;
import java.util.Random;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
/*
 * 
 * this class is not used
 * it's used to put the "KaryoType" into scene but it's not looks good
 * 
 */
public class KTBackground 
{
	private Scene scene;
	private Group root;
	public KTBackground(Scene scene, Group root)
	{
		this.scene = scene;
		this.root = root;
		this.ktbackground();
	}
	private void ktbackground()
	{
		Random rand = new Random(System.currentTimeMillis());
		Font serif = Font.font("Serif", 15);
		DropShadow dropShadow = new DropShadow();
    	for (int i = 0; i < 100; i++) {
    		int x = rand.nextInt((int) scene.getWidth());
    		int y = rand.nextInt((int) scene.getHeight());
    		int red = rand.nextInt(255);
    		int green = rand.nextInt(255);
    		int blue = rand.nextInt(255);
    		Text text = new Text(x, y, "KaryoType");
    		text.setFont(serif);
    		dropShadow.setOffsetX(2.0f);
    		dropShadow.setOffsetY(2.0f);
    		dropShadow.setColor(Color.rgb(50, 50, 50, .588));
    		text.setEffect(dropShadow);
    		int rot = rand.nextInt(360);
    		text.setFill(Color.rgb(red, green, blue, .99));
    		text.setRotate(rot);
    		root.getChildren().add(text);
    	}
	}
}
