
public class Particella {

	private int x, y;

	public Particella () {
		x = 0;
		y = 0;

	}

	public Particella ( int x, int y ) {
		this.x = x;
		this.y = y;

	}

	public void Move ( int x, int y ) {
		this.x += x;
		this.y += y;

	}

	public boolean SetX ( int x ) {
		if ( x >= 0 && x < 1920 ) {
			this.x = x;
			return true;
		}
		return false;
	}

	public boolean SetY ( int y ) {
		if ( y >= 0 && y < 1080 ) {
			this.y = y;
			return true;
		}
		return false;
	}

	public int WhereX () {
		return x;
	}

	public int WhereY () {
		return y;
	}

	public void Reset ( int x, int y ) {
		this.x = x;
		this.y = y;
	}

	public void RandomPos ( int Min, int Max ) {
		if ( Max > Min ) {
			this.x = Min + (int)(Math.random() * ((Max - Min) + 1));
			this.y = Min + (int)(Math.random() * ((Max - Min) + 1));
		}
	}

	public boolean Collision ( Particella P ) {
		if ( P.WhereX() == this.x && P.WhereY() == this.y ) {
			return true;
		}
		return false;
	}

	public boolean Near ( Particella P, int offset ) {
		if ( this.Distance(P) < offset ) 
			return true;
		return false;
	}

	public double Distance ( Particella P ) {
		return Math.sqrt(Math.pow((this.x - P.WhereX()), 2) + 
			Math.pow((this.y - P.WhereY()), 2));

	}

	

}
