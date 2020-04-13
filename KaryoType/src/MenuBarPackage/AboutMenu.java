/*
 * 
 * this class is to fulfill the menu of "Help"
 * 
 */
package MenuBarPackage;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
public class AboutMenu 
{
	private Menu helpMenu;
	public AboutMenu(Menu helpMenu)
	{
		this.helpMenu = helpMenu;
		this.helpMenu();
	}
	private void helpMenu()
	{
		//set item in "Help" menu 
		MenuItem aboutMenu = new MenuItem("About");
		//add element into menu
		 helpMenu.getItems().addAll(aboutMenu);
	}
}
