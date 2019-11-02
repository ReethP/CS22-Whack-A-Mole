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

public class Menu {
	private Stage stage;
	private Pane root;
	private Scene scene;
	private BackgroundImage background;
	private ImageView play;
	private ImageView instructions;
	private ImageView about;
	
	public Menu(Stage primaryStage) {
		this.stage = primaryStage;
		this.root = new Pane();
		this.scene = new Scene(this.root, 768, 460.8);
		this.background = new BackgroundImage(new Image("file:src/WHACKMENU.jpg"), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(768, 460.8, true, true, true, true));

	}
	public void setMenu() {
		
		this.stage.setTitle("Whack-A-Mole");
        this.root.setBackground(new Background(this.background));
        this.stage.getIcons().add(new Image("file:src/mole1.png"));
        
        this.play = new ImageView();
        this.play.setImage(new Image("file:src/button1.png"));
        this.play.setFitHeight(45.6);
        this.play.setFitWidth(141.6);
        this.play.setX(300);
        this.play.setY(330);
        this.play.setPickOnBounds(false); // allows click on transparent areas
        this.play.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked Play"); // change functionality
            
        });
        
        this.instructions = new ImageView();
        this.instructions.setImage(new Image("file:src/button2.png"));
        this.instructions.setFitHeight(39.3);
        this.instructions.setFitWidth(141.6);
        this.instructions.setX(300);
        this.instructions.setY(377);
        this.instructions.setPickOnBounds(false); // allows click on transparent areas
        this.instructions.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked Instructions");
            InstructionsScene instructions = new InstructionsScene(this.stage, this.scene);
            this.stage.setScene(instructions.getScene());     
        });
        
        this.about = new ImageView();
        this.about.setImage(new Image("file:src/button3.png"));
        this.about.setFitHeight(60);
        this.about.setFitWidth(60);
        this.about.setX(700);
        this.about.setY(400);
        this.about.setPickOnBounds(false); // allows to not click on transparent areas
        this.about.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked About"); // change functionality
            AboutScene about = new AboutScene(this.stage, this.scene);
            this.stage.setScene(about.getScene());
           
        });
         
        this.root.getChildren().add(this.play);
        this.root.getChildren().add(this.instructions);
        this.root.getChildren().add(this.about);
        this.stage.setResizable(false);
        this.stage.setScene(this.scene);
        this.stage.show();
	}
}
