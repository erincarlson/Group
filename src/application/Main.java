/* Hey Guys
I had some spare time to get caught up on a bunch of school stuff this weekend,
I spent a little over and hour on this, to use as a user interface kind of thing

*************** THE ONLY BUTTON PATH THAT WORKS IS THAT WORKS IS DAIRY --> MILK -->  YES --> DAIRY

nothing else will do anything but its easy enough albeit time consuming if you guys the look of it.
We can talk about it on Tuesday but tell me what you think about it as a concept


*/
package application;

// We may need more of these Ill look into it but these seem good so far
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Arrays;


public class Main extends Application
{
	static Fridge fridge = new Fridge();
	int x =0;
	Scene Opening, Other;
		
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Label label1 = new Label("This is the opening Screen");
		VBox layout1 = new VBox(25);
		Button button1 = new Button("Dairy");
		Button button2 = new Button("Meat");
		Button button3 = new Button("Fruit");
		Button button4 = new Button("Vegetables");
		Button button5 = new Button("that is all I've got");
		primaryStage.setTitle("Graham's part of the project 4Head");
	
		button1.setOnAction(e -> DairyMenu(primaryStage));
		button2.setOnAction(e -> MeatMenu(primaryStage));
		button3.setOnAction(e -> FruitMenu(primaryStage));	
		button4.setOnAction(e -> VeggieMenu(primaryStage));
		button5.setOnAction(e -> SelectionMade(primaryStage));
		
		layout1.getChildren().addAll(label1, button1, button2, button3, button4, button5);

		Opening = new Scene(layout1, 400, 400);

		primaryStage.setScene(Opening);
		primaryStage.show();
		
	}
	
	public void DairyMenu(Stage primaryStage)
	{
		primaryStage.setTitle("Dairy Stuff ");
		VBox DairyLayout = new VBox(20);
		Label dLabel = new Label("What Dairy do you have in your fridge?");
		Scene Dairy = new Scene(DairyLayout, 400, 400);
		
		Button button1 = new Button("milk");
		
		// for anyone wondering this is what makes it go around in a circle, I would copy this to the other buttons basically
		button1.setOnAction(e -> 
		{
			try 
			{
				fridge.setWhat("milk");
				SelectionMade(primaryStage);
			}
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		}
		);
		
		Button button2 = new Button("eggs");
		
		Button button3 = new Button("cheese");
		
		DairyLayout.getChildren().addAll(dLabel, button1, button2, button3);
		primaryStage.setScene(Dairy);
		primaryStage.show();

	}
	
	public void MeatMenu(Stage primaryStage)
	{
		primaryStage.setTitle("Meat Stuff ");
		VBox MeatLayout = new VBox(20);
		Label mLabel = new Label("What Meats do you have in your fridge?");
		Scene Meat= new Scene(MeatLayout, 400, 400);
		
		Button button1 = new Button("chicken");
		
		Button button2 = new Button("tuna");
		
		Button button3 = new Button("ground beef");
		
		MeatLayout.getChildren().addAll(mLabel, button1, button2, button3);
		primaryStage.setScene(Meat);
		primaryStage.show();

	}
	
	public void FruitMenu(Stage primaryStage)
	{
		primaryStage.setTitle("Fruit Stuff ");
		VBox FruitLayout = new VBox(20);
		Label fLabel = new Label("What Fruit do you have in your fridge?");
		Scene Fruit= new Scene(FruitLayout, 400, 400);
		
		Button button1 = new Button("apples");
		
		Button button2 = new Button("mangos");
		
		Button button3 = new Button("bananas");
		
		FruitLayout.getChildren().addAll(fLabel, button1, button2, button3);
		primaryStage.setScene(Fruit);
		primaryStage.show();

	}
	
	public void VeggieMenu(Stage primaryStage)
	{
		primaryStage.setTitle("Veggie Stuff ");
		VBox VeggieLayout = new VBox(20);
		Label vLabel = new Label("What Vegetables do you have in your fridge?");
		Scene Veggie= new Scene(VeggieLayout, 400, 400);
		
		Button button1 = new Button("carrots");
		
		Button button2 = new Button("celery");
		
		Button button3 = new Button("I dont eat enough vegetables to think of 3");
		
		VeggieLayout.getChildren().addAll(vLabel, button1, button2, button3);
		primaryStage.setScene(Veggie);
		primaryStage.show();

	}
	
	public void SelectionMade(Stage primaryStage)
	{
		primaryStage.setTitle("Limbo");
		VBox selectionLayout = new VBox(20);
		Label sLabel = new Label("Ok adding " + fridge.getWhat() +" you have " + fridge.getCounter() + " things so far");
		Label sLabel2 = new Label("Do you have anything else back there?");

		Scene Selection= new Scene(selectionLayout, 400, 400);
		
		Button button1 = new Button("HELL YES");
		Button button2 = new Button("no");

		button1.setOnAction(e -> 
		{
			if(fridge.counter < 3)
			try 
			{
				start(primaryStage);
			}
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
			else
			{
				button1.setText("no you don't");
				button2.setText("...ok");
			}
		}
		);
		
		button2.setOnAction(e -> 
		{
			try 
			{
			ThatsAll(primaryStage);
			}
			catch (Exception e1) 
			{
			e1.printStackTrace();
			}});
						
		selectionLayout.getChildren().addAll(sLabel, sLabel2, button1, button2);
		primaryStage.setScene(Selection);
		primaryStage.show();
	}
	
	public static void ThatsAll(Stage primaryStage)
	{
		primaryStage.setTitle("Conclusion ");
		VBox concLayout = new VBox(20);
		Label cLabel = new Label("ok cool so you have " + Arrays.toString(fridge.getStuff()) + "?");
		Label cLabel2 = new Label("With those ingredients you can make ");

		Scene conclusion = new Scene(concLayout, 400, 400);
		
		// write what could be made if statements and shit
		
		
		concLayout.getChildren().addAll(cLabel, cLabel2);

		
		primaryStage.setScene(conclusion);
		primaryStage.show();
		
		
				
	}
	
	public static void main(String[] args) 
	{
		launch(args);	
	}
}
