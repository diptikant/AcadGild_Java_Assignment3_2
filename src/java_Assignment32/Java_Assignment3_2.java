package java_Assignment32;
/*
 * This class will help to master Super and this keyword in java.
 * 
 * Problem statement
 * Write a program in Java to show the use of super and this keyword with a constructor, methods,variables
 */

public class Java_Assignment3_2 {


	public static void main(String[] args) 
	{
		 Dog ob=new Dog(); // Creating child class instance
	     ob.printColor(); // calling child class method

	}

}

class Animal // Base Class
{
    String color="White";
    String aname;
    
    //Base class constructor
    public Animal(String s)
    {
       aname=s; 
    }
    
  //Base class method
    public void dispAnimal()
    {
        System.out.println("calling super class of animal: "+aname);
            
    }
}
class Dog extends Animal // Child Class
{
    String color="Black";
    
  //Child class constructor
    public Dog()
    {
        super("Doberman Dog");//use of constructor of base class
    }
    
  //Child class method
    void printColor()
    {
        System.out.println("The value of color using This : "+this.color);//this keyword refers to current class object
        System.out.println("The value of color using Super : "+super.color);//super is used to call parent class variable
        super.dispAnimal();//calling method of base class using super
    }
    
}