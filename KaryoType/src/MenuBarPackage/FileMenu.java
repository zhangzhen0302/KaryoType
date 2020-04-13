/*
 * 
 * this class is to fulfill the menu of File
 * To open photos, this class has implement class SelectPhotos and ShowPhotos
 * 
 */
package MenuBarPackage;
import OpenPhotos.SelectPhotos;
import OpenPhotos.ShowPhotos;
import javafx.application.Platform;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
public class FileMenu 
{
	private Menu fileMenu;
	private BorderPane borderPane;
	//tabPane is the workspace for photos with closable tab
	private TabPane tabPane = new TabPane();
	
	public FileMenu(Menu fileMenu, BorderPane borderPane)
	{
		 this.fileMenu = fileMenu;
		 this.borderPane = borderPane;
		 this.FileManu();
	}
	private void FileManu()
	{
		//initialize every item in File menu
		MenuItem openPhotos = new MenuItem("Open Photo");
		MenuItem openKTFile = new MenuItem("Open KaryoType File");
		MenuItem saveAllPhoto = new MenuItem("Save All Photos");
		MenuItem saveID = new MenuItem("Save ID Only");
		MenuItem saveFile = new MenuItem("Save File");
		MenuItem saveResult = new MenuItem("Save Result");
		 MenuItem exitMenuItem = new MenuItem("Exit");
		 MenuItem newMenuItem = new MenuItem("New");
		 //set tabPane into the center of borderPane
		 borderPane.setCenter(tabPane);
		 //set reaction of open-photos
		 openPhotos.setOnAction(actionEvent -> {
			 //select photos from file-chooser
			 SelectPhotos selectPhotos = new SelectPhotos();
			 //when one picture was select, it will be added into tabPane
			new ShowPhotos(tabPane, selectPhotos.getImage());
			
		 });
		 //set the reaction of exit
		 exitMenuItem.setOnAction(actionEvent -> Platform.exit() );
		 //add all items into File menu
		 fileMenu.getItems().addAll(newMenuItem,
	     new SeparatorMenuItem(),
		 openPhotos,
		 openKTFile,
		 new SeparatorMenuItem(),
		 saveFile,
		 saveResult,
		 saveAllPhoto,
		 saveID,
		 new SeparatorMenuItem(),
		 exitMenuItem
		 );
	}
}
