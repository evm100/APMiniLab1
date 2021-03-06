package sorts;

import data.Alphabet;
import data.Animal;
import data.Cupcakes;
import data.Student;

/**
 * Circle Queue Driver takes a list of Objects and puts them into a Queue
 * @author     John Mortensen
 *
 */
public class CircleQueueDriverAL {
	
	private CircleQueueAL cqueue;	// circle queue object
	private int count; // number of objects in circle queue

	/* 
	 * Circle queue constructor
	 */
	public CircleQueueDriverAL()
	{
		count = 0;		
		cqueue = new CircleQueueAL();
	}

	/*
	 * Add any array of objects to the queue
	 */
	public void addCQueue(Object[] objects)
	{
		ConsoleMethods.println("Add " + objects.length);
		for (Object o : objects)
		{
			cqueue.add(o);
			ConsoleMethods.println("Add: " + cqueue.getObject() + " " + cqueue);
			this.count++;
		}
		ConsoleMethods.println();			
	}
	
	/* 
	 * Show key objects/properties of circle queue
	 */
	public void showCQueue()
	{
		ConsoleMethods.println("Size: " + count);
		ConsoleMethods.println("First Element: " + cqueue.getFirstObject());
		ConsoleMethods.println("Last Element: " + cqueue.getLastObject());
		ConsoleMethods.println("Full cqueue: " + cqueue);
		ConsoleMethods.println();
	}
	
	/* 
	 * Delete/Clear all object in circle queue
	 */
	public void deleteCQueue()
	{
		int length = this.count;
		ConsoleMethods.println("Delete " + length);
		
		for (int i = 0; i<length; i++)
		{
			ConsoleMethods.println("Delete: " + cqueue.delete() + " " + cqueue);
			this.count--;
		}
	}
	
	
	/* 
	 * Illustrate different Objects that can be placed on same Queue
	 */
	public static void main(String[] args)
	
	{			
		//queue
		CircleQueueDriverAL trial = new CircleQueueDriverAL();
		System.out.println("___________________________________________________________________");
		System.out.println("Sorting by Insertion");
		System.out.println("");
		//add different types of objects to the same opaque queue
		trial.addCQueue(Animal.animalData());
		trial.addCQueue(Cupcakes.cupCakeData());
		trial.addCQueue(Alphabet.alphabetData());
		trial.addCQueue(Student.studentData());
		//display queue objects in queue order
		trial.showCQueue();
		
		//sort queue objects by specific element within the object and display in sort order
		Animal.key = Animal.KeyType.name;
		Cupcakes.key = Cupcakes.KeyType.flavor;
		Alphabet.key = Alphabet.KeyType.letter;
		Student.key = Student.KeyType.name;
		trial.cqueue.insertionSort();
		System.out.println("Sorting by Insertion...");
		trial.showCQueue();
		
		//display queue objects
		Animal.key = Animal.KeyType.combo;
		Cupcakes.key = Cupcakes.KeyType.combo;
		Alphabet.key = Alphabet.KeyType.combo;
		Student.key = Student.KeyType.combo;
		trial.showCQueue();
		
		//delete queue objects
		trial.deleteCQueue();
		
		/*
		 * Running again but this time with selection
		 */
		
		//queue
		CircleQueueDriverAL trial2 = new CircleQueueDriverAL();
		System.out.println("___________________________________________________________________");
		System.out.println("Sorting by Selection");
		System.out.println("");
		//add different types of objects to the same opaque queue
		trial2.addCQueue(Animal.animalData());
		trial2.addCQueue(Cupcakes.cupCakeData());
		trial2.addCQueue(Alphabet.alphabetData());
		trial2.addCQueue(Student.studentData());
		//display queue objects in queue order
		trial2.showCQueue();
		
		//sort queue objects by specific element within the object and display in sort order
		Animal.key = Animal.KeyType.name;
		Cupcakes.key = Cupcakes.KeyType.flavor;
		Alphabet.key = Alphabet.KeyType.letter;
		Student.key = Student.KeyType.name;
		trial2.cqueue.selectionSort();
		System.out.println("Sorting by Selection...");
		trial2.showCQueue();
		
		//display queue objects
		Animal.key = Animal.KeyType.combo;
		Cupcakes.key = Cupcakes.KeyType.combo;
		Alphabet.key = Alphabet.KeyType.combo;
		Student.key = Student.KeyType.combo;
		trial2.showCQueue();
		
		//delete queue objects
		trial2.deleteCQueue();
	}
	
}
