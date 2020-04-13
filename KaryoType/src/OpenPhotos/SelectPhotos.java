/*
 * 
 * this class is to select a photos in location disk
 * and return it to class FileMenu
 * 
 */
package OpenPhotos;
import java.io.File;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
public class SelectPhotos 
{
	private File file;
	private Stage stage = new Stage();
	public SelectPhotos()
	{
		FileChooser fileChooser = new FileChooser();
        file = fileChooser.showOpenDialog(stage);
                //Image image1 = new Image(file.toURI().toString());
                //ImageView ip = new ImageView(image1);
            
	}
	public File getImage()
	{
		
		return file;
	}
}
