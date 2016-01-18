package week05;

public class LineSegment implements Comparable<LineSegment> {
	private Point x;
	private Point y;

	public LineSegment(Point x, Point y) {
		this.x = x;
		this.y = y;
	}

	public LineSegment(LineSegment l) {
		this.x = l.x;
		this.y = l.y;
	}

	public Point getX(LineSegment l) {
		return l.x;
	}

	public Point getY(LineSegment l) {
		return l.y;
	}

	public int getLength() {
		return this.y.getX(y) - this.x.getX(x);
	}

	public String toString(LineSegment l) {
		return "Line[(" + l.x.getX(x) + ", " + l.x.getY(y) + "), ("
				+ l.y.getX(x) + ", " + l.y.getY(y) + ")]";
	}

	@Override
	public int compareTo(LineSegment o) {
		if (this.getLength() < o.getLength()) {
			return -1;
		} else if (this.getLength() == o.getLength()) {
			return 0;
		} else {
			return 1;
		}
	}
}