package mainPackage;
import BackgroundPackage.WindowInitialize;
import PasswordLogin.PasswordStart;
import javafx.application.Application;
import javafx.stage.Stage;
public class Main extends Application
{
    public static void main(String[] args) 
    {
        launch(args);//initialize javaFX settings when start the program
    }

    @Override
    public void start(Stage primaryStage)
    {
    	//initialize user window without showing it
    	WindowInitialize window = new WindowInitialize(primaryStage);
    	//show password window and show user window if password is correct
    	new PasswordStart(window);
    	
    }

}