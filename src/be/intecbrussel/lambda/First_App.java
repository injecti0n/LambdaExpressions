package be.intecbrussel.lambda;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class First_App {

	public static void main(String[] args) {
		// parameters -> expression  
				Runnable runLambda = () -> System.out.println("Hello Lambda !");
		 
				System.out.println("with Lambda Expression");
				runLambda.run();
				
				
				Set test = new HashSet();
				test.add("test1");
				test.add("test2");
				test.add("test3");
				test.add("test4");
				
				String[] strArray = {"Atilla","Tarik","Jamie","Jason","Mulham"};
				
				List characters = Arrays.asList(strArray);
				
				characters.forEach((character) -> System.out.println(character));				

	}

}
