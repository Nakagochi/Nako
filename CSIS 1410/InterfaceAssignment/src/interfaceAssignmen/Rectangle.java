/*
	Assignment: LabInheritance
	Program:	Rectangle
	Programmer: Tysen - Tysen Christensen
	Created:	Sep 25, 2019Sep 25, 2019
*/
/**
 * FILE Rectangle.java
 */
package interfaceAssignmen;

/**
 * @author Tysen CLASS - Rectangle
 */
public class Rectangle implements Shape, Printable {
	final private int length;
	final private int width;

	/**
	 * CONSTRUCTOR
	 * 
	 * @param length side of Rectangle
	 * @param width  side of Rectangle
	 */
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	*@see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return String.format("Rectangle (%sX%s)", length, width);
	}

	/**
	*@see interfaceAssignmen.Shape#perimeter()
	*/
	@Override
	public double perimeter() {
		double per = (length * 2) + (width * 2);
		return per;
	}

	/**
	*@see interfaceAssignmen.Shape#area()
	*/
	@Override
	public double area() {
		double a = length * width;
		return a;
	}

	/**
	*@see interfaceAssignmen.Printable#print()
	*/
	@Override
	public void print() {
		for (int x = 1; x <= length; x++) {
			if (x == 1 || x == length) {
				for (int y = 1; y <= width; y++) {
					System.out.printf("* ");
					if(y ==width) {System.out.printf("%n");}
				}
			} else {
				for (int y = 1; y <= width; y++) {
					if (y == 1 || y == width) {
						System.out.printf("* ");
						if(y ==width) {System.out.printf("%n");}
					} else {
						System.out.printf("  ");
					}
				}
			}

		}

	}

}
