/*
 * 
 * this class is to add the items of Tool menu into Tool menu
 */
package MenuBarPackage;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
public class ToolsMenu 
{
	private Menu toolsMenu;
	public ToolsMenu(Menu toolsMenu)
	{
		this.toolsMenu = toolsMenu;
		this.toolsMenu();
	}
	private void toolsMenu()
	{
		//initialize the items in Tool menu
		MenuItem analysis = new MenuItem("Analysis");
		MenuItem group = new MenuItem("Group");
		MenuItem scales = new MenuItem("Scales");
		MenuItem combineResult = new MenuItem("Combine Results");
		//add items into Tool menu
		 toolsMenu.getItems().addAll(analysis,
		 group,
		 scales,
		 new SeparatorMenuItem(),
		 combineResult
		 );
	}
}
