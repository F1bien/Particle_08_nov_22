

public class Main {

	public static void main(String[] args) {
		
		Particella P1 = new Particella(); 
		Particella P2 = new Particella(9, 13); 

		System.out.println("Hello, the P1 is at :x " +
							P1.WhereX() + " :y " + P1.WhereY());

		P1.Move(4, 7);

		System.out.println("The P1 now is at :x " +
							P1.WhereX() + " :y " + P1.WhereY());

		System.out.println("Hello, the P2 is at :x " +
							P2.WhereX() + " :y " + P2.WhereY());

		if ( P2.SetX(100) == false ) 
			System.out.println("Error position");
		else 
		System.out.println("The P2 now is at :x " +
							P2.WhereX() + " :y " + P2.WhereY());

		P2.Reset(0, 0);
		System.out.println("The P2 resetd :x " +
							P2.WhereX() + " :y " + P2.WhereY());

		P2.RandomPos(4, 8);
		System.out.println("Random position for P2 :x " +
							P2.WhereX() + " :y " + P2.WhereY());

		P2.SetX(4);
		P2.SetY(7);
		System.out.println("The P2 now is at :x " +
							P2.WhereX() + " :y " + P2.WhereY());
		
		if ( P1.Collision(P2) == true ) 
			System.out.println("P1 collides with P2 at x: " +
								P1.WhereX() + " :y " + P1.WhereY());
		else 
			System.out.println("P2 don't collides with P1");

		P2.RandomPos(0, 10);
		System.out.println("Random position for P2 :x " +
							P2.WhereX() + " :y " + P2.WhereY());

		P1.RandomPos(0, 10);
		System.out.println("Random position for P1 :x " +
							P1.WhereX() + " :y " + P1.WhereY());

		if ( P1.Near(P2, 8) == true )
			System.out.println("P1 is near P2");
		else 
			System.out.println("P1 isn't near P2");

		System.out.println("Distance between P1 and P2 is : " +
							P1.Distance(P2));

	}

}
