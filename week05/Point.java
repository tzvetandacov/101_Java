package week05;

public class Point {
	private int x;
	private int y;

	public Point() {
		x = 0;
		y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(Point p) {
		p.x = x;
		p.y = y;
	}

	public int getX(Point p) {
		return p.x;
	}

	public int getY(Point p) {
		return p.y;
	}

	public static String getOrigin() {
		return "0, 0";
	}

	public String toString(Point p) {
		return (p.x + ", " + p.y);
	}

	public boolean equals(Point p) {
		if (this.x == p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}
	}
	public int hashCode() {
        int hash = 17;
  
        hash = hash * 23 + this.hashCode();
        hash = hash * 23 + this.hashCode();
        return hash;
}
}
