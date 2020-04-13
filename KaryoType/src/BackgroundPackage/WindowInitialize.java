/*
 * 
 * this class is used to create one basic container of windows
 * every elements will be put into this container
 * it's showed when password is correct
 * 
 */
package BackgroundPackage;
import MenuBarPackage.MenuBarInitialize;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class WindowInitialize 
{
	//the frame to contain every elements
	private Stage primaryStage = new Stage();
	public WindowInitialize(Stage primaryStage)
	{
		this.primaryStage = primaryStage;
		//initialize the stage
		this.initialize();
	}
	private void initialize()
	{
		//set the title of program
		primaryStage.setTitle("KaryoType");
		//create a root get elements for their location
		Group root = new Group();
		//create a scene to show the root
    	Scene scene = new Scene(root, 1200, 750, Color.GRAY);
    	//create background
    	//new KTBackground(scene, root);
    	//add MenuBar
    	new MenuBarInitialize(root, scene);
    	//put the scene into stage
    	primaryStage.setScene(scene);
    	
	}
	//this function is used after password is correct
	public void show()
	{
		//show stage with its all elements
		primaryStage.show();
	}
}
