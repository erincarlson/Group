import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;


public class Main extends Application
{
	Fridge fridge = new Fridge();
	ArrayList<String> stuff = new ArrayList<String>();
	ArrayList<String> recipes = new ArrayList<String>();
	Scene Opening, Other;
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		primaryStage.setTitle("Kitchen Helper");
		
		Label label1 = new Label("Welcome to Kitchen Helper");
		Label label2 = new Label("What do we have to work with today?");
		Label label3 = new Label(" ");
		
		VBox layout1 = new VBox(25);
		
		
		   
		
		
		
		
		
		
		// first 5 is top, second is left, third is bottom, last the 15 is from the right
		layout1.setPadding(new Insets(5,5,5,15));
		
		Button btnDairy = new Button("Dairy");
		Button btnMeat = new Button("Meat");		
		Button btnFruit = new Button("Fruit");
		Button btnVeg = new Button("Vegetables");
		Button btnGrain = new Button("Grains");
		Button btnDone = new Button("Done");
		btnDone.setStyle("-fx-font: 15 arial; -fx-background-radius: 30; -fx-base: #123456; -fx-font-weight: bold;");
		

		btnDairy.setOnAction(e -> DairyMenu(primaryStage));
		btnMeat.setOnAction(e -> MeatMenu(primaryStage));
		btnFruit.setOnAction(e -> FruitMenu(primaryStage));	
		btnVeg.setOnAction(e -> VeggieMenu(primaryStage));
		btnGrain.setOnAction(e -> GrainMenu(primaryStage));
		btnDone.setOnAction(e -> 
		{
			try 
			{
				conclusion(primaryStage);
			}
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		}
		);
		
		
		HBox hbButtons = new HBox();
		hbButtons.setSpacing(250);		 

		hbButtons.getChildren().addAll(label3, btnDone);
		   
	
		layout1.getChildren().addAll(label1, label2, btnDairy, btnMeat, btnFruit, btnVeg, btnGrain, hbButtons);

		
		Opening = new Scene(layout1, 400, 400);

		primaryStage.setScene(Opening);
		primaryStage.show();
		
	}
	

	
	
	public void DairyMenu(Stage primaryStage)
	{
		VBox layout1 = new VBox(20);
		Label lblDairy = new Label("What dairy do you have in your fridge?");
		Scene Dairy = new Scene(layout1, 400, 400);
		layout1.setPadding(new Insets(5,5,5,15));

		Button btnAdd = new Button("Add");
		Button btnBack = new Button("Back");
		
		CheckBox [] boxes = new CheckBox[5];
		
		CheckBox c1 = new CheckBox("milk");
		CheckBox c2 = new CheckBox("eggs");
		CheckBox c3 = new CheckBox("mayonnaise");
		CheckBox c4 = new CheckBox("butter");
		CheckBox c5 = new CheckBox("cheese");
		
		boxes[0] = c1;
		boxes[1] = c2;
		boxes[2] = c3;
		boxes[3] = c4;
		boxes[4] = c5;
		
		btnAdd.setOnAction(e ->
		{
			try
			{				
				addFood(boxes, 4);
				SelectionMade(primaryStage);
				
			}catch (Exception e1)
			{
				e1.printStackTrace();
			}
		});
		
		btnBack.setOnAction(e->
		{
			try 
			{
				start(primaryStage);
			}
			catch (Exception e1) 
			{ e1.printStackTrace(); }
		});
		
		
		layout1.getChildren().addAll(lblDairy, c1, c2, c3, c4, c5, btnAdd, btnBack);
		primaryStage.setScene(Dairy);
		primaryStage.show();
	}	
	
	
		
	
	public void MeatMenu(Stage primaryStage)
	{
		VBox layout1 = new VBox(20);
		Label lblMeat = new Label("What meat do you have in your fridge?");
		Scene Meat= new Scene(layout1, 400, 400);
		layout1.setPadding(new Insets(5,5,5,15));

		Button btnAdd = new Button("Add");
		Button btnBack = new Button("Back");
		
		CheckBox [] boxes = new CheckBox[5];
		
		CheckBox c1 = new CheckBox("chicken");
		CheckBox c2 = new CheckBox("tuna");
		CheckBox c3 = new CheckBox("ground beef");
		CheckBox c4 = new CheckBox("pork");
		CheckBox c5 = new CheckBox("ham");
		
		boxes[0] = c1;
		boxes[1] = c2;
		boxes[2] = c3;
		boxes[3] = c4;
		boxes[4] = c5;
		
		btnAdd.setOnAction(e ->
		{
			try
			{				
				addFood(boxes, 4);
				SelectionMade(primaryStage);
				
			}catch (Exception e1)
			{ e1.printStackTrace(); }
		});

		btnBack.setOnAction(e->
		{
			try 
			{
				start(primaryStage);
			}
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		});
		
		
		layout1.getChildren().addAll(lblMeat, c1, c2, c3, c4, c5, btnAdd, btnBack);
		primaryStage.setScene(Meat);
		primaryStage.show();
	}
	
	
	
	
	public void FruitMenu(Stage primaryStage)
	{
		VBox layout1 = new VBox(20);
		Label fLabel = new Label("What fruit do you have in your fridge?");
		Scene Fruit= new Scene(layout1, 400, 400);
		layout1.setPadding(new Insets(5,5,5,15));

		Button btnAdd = new Button("Add");
		Button btnBack = new Button("Back");
		
		CheckBox [] boxes = new CheckBox[5];
		
		CheckBox c1 = new CheckBox("apples");
		CheckBox c2 = new CheckBox("bananas");
		CheckBox c3 = new CheckBox("strawberries");
		CheckBox c4 = new CheckBox("pineapple");
		CheckBox c5 = new CheckBox("blueberries");
		
		boxes[0] = c1;
		boxes[1] = c2;
		boxes[2] = c3;
		boxes[3] = c4;
		boxes[4] = c5;
		
		btnAdd.setOnAction(e ->
		{
			try
			{				
				addFood(boxes, 4);
				SelectionMade(primaryStage);
				
			}catch (Exception e1)
			{ e1.printStackTrace(); }
		});

		btnBack.setOnAction(e->
		{
			try 
			{
				start(primaryStage);
			}
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		});
		
		
		layout1.getChildren().addAll(fLabel, c1, c2, c3, c4, c5, btnAdd, btnBack);
		primaryStage.setScene(Fruit);
		primaryStage.show();
	}
	
	
	
	
	public void VeggieMenu(Stage primaryStage)
	{
		VBox layout1 = new VBox(20);
		Label vLabel = new Label("What vegetables do you have in your fridge?");
		Scene Veggie= new Scene(layout1, 400, 400);
		layout1.setPadding(new Insets(5,5,5,15));

		Button btnAdd = new Button("Add");
		Button btnBack = new Button("Back");
		
		CheckBox [] boxes = new CheckBox[5];
		
		CheckBox c1 = new CheckBox("carrots");
		CheckBox c2 = new CheckBox("celery");
		CheckBox c3 = new CheckBox("peppers");
		CheckBox c4 = new CheckBox("tomatoes");
		CheckBox c5 = new CheckBox("potatoes");
		
		boxes[0] = c1;
		boxes[1] = c2;
		boxes[2] = c3;
		boxes[3] = c4;
		boxes[4] = c5;
		
		btnAdd.setOnAction(e ->
		{
			try
			{				
				addFood(boxes, 4);
				SelectionMade(primaryStage);
				
			}catch (Exception e1)
			{
				e1.printStackTrace();
			}
		});

		btnBack.setOnAction(e->
		{
			try 
			{
				start(primaryStage);
			}
			catch (Exception e1) 
			{ e1.printStackTrace(); }
		});
		
		
		layout1.getChildren().addAll(vLabel, c1, c2, c3, c4, c5, btnAdd, btnBack);
		primaryStage.setScene(Veggie);
		primaryStage.show();
	}
	
	

	
	public void GrainMenu(Stage primaryStage)
	{
		VBox layout1 = new VBox(20);
		Label vLabel = new Label("What grains do you have in your fridge?");
		Scene Veggie= new Scene(layout1, 400, 400);
		layout1.setPadding(new Insets(5,5,5,15));

		Button btnAdd = new Button("Add");
		Button btnBack = new Button("Back");
		
		CheckBox [] boxes = new CheckBox[3];
		
		CheckBox c1 = new CheckBox("bread");
		CheckBox c2 = new CheckBox("rice");
		CheckBox c3 = new CheckBox("pasta");
		
		boxes[0] = c1;
		boxes[1] = c2;
		boxes[2] = c3;
		
		btnAdd.setOnAction(e ->
		{
			try
			{				
				addFood(boxes, 2);
				SelectionMade(primaryStage);
				
			}catch (Exception e1)
			{ e1.printStackTrace(); }
		});
		
		btnBack.setOnAction(e->
		{
			try 
			{
				start(primaryStage);
			}
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		});
		
		
		layout1.getChildren().addAll(vLabel, c1, c2, c3, btnAdd, btnBack);
		primaryStage.setScene(Veggie);
		primaryStage.show();
	}
	
	
	
	
	public void addFood(CheckBox[] boxes, int x)
	{			
				for(int i = 0; i<=x; i++)
				{
		            if(boxes[i].isSelected())
		            {
		                fridge.setFood(boxes[i].getText());		                
						stuff.add(fridge.getFood());
		            }
				}
	}
	
	
	
	
	public void SelectionMade(Stage primaryStage)
	{
		VBox layout1 = new VBox(20);
		layout1.setPadding(new Insets(5,5,5,15));

		Label sLabel = new Label("Adding items, you now have " + fridge.getCounter() + " items");

		Scene Selection= new Scene(layout1, 400, 400);
		
		Button btnCon = new Button("Continue");
		btnCon.setOnAction(e -> 
		{
			try 
			{
				start(primaryStage);
			}
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		}
		);
		
		Button btnDone = new Button("Done");
		btnDone.setOnAction(e -> 
		{
			try 
			{
				conclusion(primaryStage);
			}
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		}
		);
		

		layout1.getChildren().addAll(sLabel, btnCon, btnDone);
		primaryStage.setScene(Selection);
		primaryStage.show();
	}
	
	
	
	
	public void conclusion(Stage primaryStage)
	{
		VBox layout1 = new VBox(20);
		layout1.setPadding(new Insets(5,5,5,5));
		
		TextArea txtDone = new TextArea();
		txtDone.setEditable(false);
		
		Button btnCon = new Button("Continue");
		btnCon.setOnAction(e -> 
		{
			try 
			{
				stuff.clear();
				fridge.setCounter(0);
				start(primaryStage);
			}
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		}
		);
		Button btnExit = new Button("Exit");
		btnExit.setOnAction(e -> 
		{
			try 
			{
				cancel();
			}
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		}
		);
		
		if(fridge.getFood() == null)
			txtDone.setText("You have nothing. \n\nWith that you can make: " + fridge.normText(fridge.findRecipe(stuff)));
		else
			txtDone.setText("You have " + stuff + "\n\nWith that you can make: " + fridge.normText(fridge.findRecipe(stuff)));

		Scene Selection= new Scene(layout1, 400, 400);
		
		layout1.getChildren().addAll(txtDone, btnCon, btnExit);
		primaryStage.setScene(Selection);
		primaryStage.show();
	}
	
	
	
	
	// thing to bail out, mostly a formatting thing I will remove it prior to submitting it
	public static void cancel()
	{
		System.exit(0);
	}	

	
	
	
	public static void main(String[] args)
	{
		launch(args);	
	}
}


