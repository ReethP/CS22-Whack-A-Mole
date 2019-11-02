package project22;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AboutScene {
	private Stage stage;
	private Scene primaryScene;
	private Pane aboutPane;
	private Scene scene;
	private BackgroundImage background;
	private ImageView arrowBack;
    public AboutScene(Stage stage, Scene scene)  {
    	
    	this.stage = stage;
    	this.primaryScene = scene;
    	this.aboutPane = new Pane();
    	this.scene = new Scene(this.aboutPane, 768, 460.8);

        this.background= new BackgroundImage(new Image("file:src/About.jpg"), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(768, 460.8, true, true, true, true));
        this.aboutPane.setBackground(new Background(background));
        

        this.arrowBack = new ImageView();
        this.arrowBack.setImage(new Image("file:src/arrow.png"));
        this.arrowBack.setFitHeight(60);
        this.arrowBack.setFitWidth(60);
        this.arrowBack.setX(10);
        this.arrowBack.setY(10);
        this.arrowBack.setPickOnBounds(false); // allows click to not on transparent areas
        this.arrowBack.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked ArrowBack"); // change functionality
            this.stage.setScene(this.primaryScene);
            
        });
        this.aboutPane.getChildren().add(this.arrowBack);
  
    }
    public Scene getScene() {
        return this.scene;
    }
    

}
