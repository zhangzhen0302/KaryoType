/*
 * 
 * this class is to add items of View menu into View menu
 * 
 */
package MenuBarPackage;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
public class ViewMenu 
{
	private Menu viewMenu;
	public ViewMenu(Menu viewMenu)
	{
		this.viewMenu = viewMenu;
		this.viewMenu();
	}
	private void viewMenu()
	{
		MenuItem refresh = new MenuItem("Refresh");
		MenuItem topmost = new MenuItem("Topmost");
		MenuItem showgroup = new MenuItem("Show Group");
		MenuItem grid = new MenuItem("Grid");
		MenuItem coordinates = new MenuItem("Coordinates");
		MenuItem fontColor = new MenuItem("Font Color");
		MenuItem lineColor = new MenuItem("Line Color");
		MenuItem toolBox = new MenuItem("Tool Box");
		MenuItem dataBox = new MenuItem("Data Box");
		 viewMenu.getItems().addAll(refresh,
				 topmost,
				 new SeparatorMenuItem(),
				 showgroup,
				 grid,
				 coordinates,
				 new SeparatorMenuItem(),
				 fontColor,
				 lineColor,
				 new SeparatorMenuItem(),
				 toolBox,
				 dataBox
		 );
	}
}
