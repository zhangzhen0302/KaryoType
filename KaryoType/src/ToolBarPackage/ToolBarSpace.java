/*
 * 
 * this class is to initialize the toolBar 
 * add add the items into toolBar
 * and add the toolBar into borderPane which is just below the menuBar
 * 
 */
package ToolBarPackage;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
public class ToolBarSpace 
{
	private BorderPane borderPane;
	private ToolBar toolBar;
	public ToolBarSpace(BorderPane borderPane)
	{
		this.borderPane = borderPane;
		this.addSpace();
	}
	private void addSpace()
	{
		//create the button of save
		Button saveButton = new Button();
		//set the image of button
		ImageView imageView = new ImageView(new 
				Image(getClass().getResourceAsStream("save File.jpg")));
		saveButton.setGraphic(imageView);
		saveButton.setId("SaveButton");
		saveButton.setTooltip(new Tooltip("Save Photos... Ctrl+N"));
		saveButton.setOnAction(e ->
		//this is not the final reaction
		//just to show how to process
		System.out.println("New toolbar button	clicked"));
		//toolBar initialize and add the elements into toolBar
		toolBar = new ToolBar(saveButton, new Separator(Orientation.VERTICAL));
		//set location of toolBar 
		borderPane.setTop(toolBar);
	}
}
