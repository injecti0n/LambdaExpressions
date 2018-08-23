package be.intecbrussel.lambda;

public class First_App {

	public static void main(String[] args) {
		// parameters -> expression  
				Runnable runLambda = () -> System.out.println("Hello Lambda !");
		 
				System.out.println("with Lambda Expression");
				runLambda.run();

	}

}
