/*
 * 
 * this class is to initialize a menuBar to contain the elements of menu
 * 
 */
package MenuBarPackage;
import ToolBarPackage.ToolBarSpace;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
public class MenuBarInitialize 
{
	private Group root;
	private Scene scene;
	public MenuBarInitialize(Group root, Scene scene)
	{
		this.scene = scene;
		this.root = root;
		this.initialize();
	}
	private void initialize()
	{
		//borderPane separate the window into five areas 
		//this will help to set the location of every elements
		BorderPane borderPane = new BorderPane();
		//make the size of borderPane be equal to scene
		 borderPane.prefHeightProperty().bind(scene.heightProperty());
		 borderPane.prefWidthProperty().bind(scene.widthProperty());
		 //initialize a new MenuBar to contain menu
		 MenuBar menuBar = new MenuBar();
		 //set the menuBar into the top
		 borderPane.setTop(menuBar);
		 //initialize a new BorderPane toolPane so that we can set the toolBar in the top of
		 //area just below the menuBar
		 BorderPane toolPane = new BorderPane();
		 //initialize toolBar and set it into the top of toolPane
		  new ToolBarSpace(toolPane);
		  //set the toolPane below the borderPane
		 borderPane.setCenter(toolPane);
		 // File menu - open, new, save, exit
		 Menu fileMenu = new Menu("File");
		 new FileMenu(fileMenu, toolPane);
		 // Tools menu
		 Menu toolsMenu = new Menu("Tools");
		 new ToolsMenu(toolsMenu);
		 //View menu
		 Menu viewMenu = new Menu("View");
		 new ViewMenu(viewMenu);
		 //help menu
		 Menu helpMenu = new Menu("Help");
		 new AboutMenu(helpMenu);
		 //add all items to menu bar
		 menuBar.getMenus().addAll(fileMenu, toolsMenu, viewMenu, helpMenu);
		 //add borderPane into root
		 root.getChildren().add(borderPane);
	}
}
