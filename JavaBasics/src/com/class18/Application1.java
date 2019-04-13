package com.class18;

public class Application1 {

	public static void main(String[] args) {
		

		        Animal anim = new Animal();
		        
		        System.out.println("This is anim" );
		        
		        System.out.println(anim.age);
		        System.out.println(anim.weight);
		        System.out.println(anim.breed);
		        System.out.println(anim.name);
		      
		        System.out.println(anim.canBark());
		        
		        
		        System.out.println(Animal.isWild());
		        
		        
		        anim.name = "Joe";
		        anim.age = 40;
		        System.out.println(anim.age);
		        
		Animal anim2 = new Animal();        

		System.out.println("This is anim2" );
		
				        System.out.println(anim2.age);
				        System.out.println(anim2.weight);
				        System.out.println(anim2.breed);
				        System.out.println(anim2.name);
		           
		        Animal anim3 = new Animal();        

		        System.out.println("This is anim3" );

		                System.out.println(anim3.age);
		                System.out.println(anim3.weight);
		                System.out.println(anim3.breed);
		                System.out.println(anim3.name);


		                int my_array[] = { -1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		                System.out.println("Printing the minimum value");
		                
		                System.out.println(Minimum.minOfValues(my_array));
		                System.out.println(Minimum.minOfValues(my_array));
						System.out.println(Minimum.maxOfValues(my_array));

		                Minimum min = new Minimum();
		                min.print();
		    }

		}