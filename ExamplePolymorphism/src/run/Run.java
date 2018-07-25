package run;
import animal.*;
import human.*;

public class Run {
	public static void main(String args[]) {
		Animal[] animalGroup = new Animal[3];
		
		animalGroup[0] = new Dog();
		animalGroup[1] = new Cat();
		animalGroup[2] = new Lion();
		
		// Polymorphism example
		for(Animal a : animalGroup) {
			a.makeNoise();
		}
		
		System.out.println();
		
		Vet vet1 = new Vet();
		vet1.inject(animalGroup[0]);
		vet1.inject(animalGroup[1]);
		//------------------------
		
		// UpDownCasting example
		//animalGroup[0].chaseCats();		ERROR
		if(animalGroup[0] instanceof Dog) {
			Dog dog1 = (Dog) animalGroup[0];	// Downcating
			dog1.chaseCats();
		}
		
	}
}


