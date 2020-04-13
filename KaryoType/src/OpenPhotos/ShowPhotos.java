/*
 * 
 * this class get the file information from class SelectPhotos
 * and put the photos into tabPane
 * 
 */
package OpenPhotos;
import java.io.File;
import javafx.scene.Group;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class ShowPhotos 
{
	private TabPane tabPane;
	private File file;
	//ScrollPane is a window with two slider so that we can view the picture 
	//that bigger than our scene
	private ScrollPane sp = new ScrollPane();
	public ShowPhotos(TabPane tabPane, File file)
	{
		this.tabPane = tabPane;
		this.file = file;
		this.addTab();
	}
	private void addTab()
	{
		//set file-name as the name of tab
		Tab tableTab = new Tab(file.getName());
		//make the tab can be closed when ever we want
		 tableTab.setClosable(true);
		 //initialize a new root to contain the elements of tabPane
		 Group root = new Group();
		 root.setVisible(true);
		 //open the photos as a image file
		 Image image = new Image("file:"+file.getPath());
		 //set the ScrollPane
		 sp.setContent(new ImageView(image));
		 sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		 sp.setMaxWidth(tabPane.getWidth());
		 sp.setMaxHeight(tabPane.getHeight()-39);
		 //add the ScrollPane into root
		 root.getChildren().add(sp);
		 //set the root into the center of tab
		 tableTab.setContent(root);
		 //add the tab into tabPane
		 tabPane.getTabs().add(tableTab);
	}
}
