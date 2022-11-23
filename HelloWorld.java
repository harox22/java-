public class HelloWorld extends Application{
	public void start(Stage mainStage){
		mainStage.setTitle("Hello World Program");

		Button btn=new Button();
		btn.setText("Print Hello World!");
		btn.setOnAction(new CustomEventHandler());

		StackPane root=new StackPane();
		root.getChildren().add(btn);

		Scene scene=new Scene(root,300,300);
		mainStage.setScene(scene);
		mainStage.show();	
	}

	private class CustomEventHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent event){
			System.out.println("Hello World");
		}

}

}