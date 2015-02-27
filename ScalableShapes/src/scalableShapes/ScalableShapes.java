package scalableShapes;

/**
 * Class for drawing a shape and support code
 * @author macdja38
 */
public class ScalableShapes {
	/**
	 * shape to draw
	 * 	1. Trangle
	 *	2. Alt Trangle
	 *	3. Pyramid
	 *	4. Square
	 *	5. Hollow Square
	 *	6. Rectangle
	 *	7. Diamond
	 *	8. Spaceship
	 *	9. House
	 *	10. Arrow
	 */
	private int Shape;
	private int Height;
	private char Character;
	/**
	 * returns a string of characters of a given length
	 * @param n length of string to return
	 * @param characters characters to make it from
	 * @return n long string of characters
	 * @author macdja38
	 */
	public String nCharacters(int n, char characters) {
		String returnString = "";
		for(int j=0; j<n; j++) {
			returnString+=characters;
		}
		return returnString;
	}
	public void SetShape(int shape) {
		 Shape = shape;
	}
	public void SetHeight(int height) {
		Height = height;
	}
	public void SetChar(char character) {
		Character = character;
	}
	/**
	 * prints the shapes the draw function can draw
	 * @author macdja38
	 */
	public void PrintShapes() {
		System.out.println("1. Trangle");
		System.out.println("2. Alt Trangle");
		System.out.println("3. Pyramid");
		System.out.println("4. Square");
		System.out.println("5. Hollow Square");
		System.out.println("6. Rectangle");
		System.out.println("7. Diamond");
		System.out.println("8. Spaceship");
		System.out.println("9. House");
		System.out.println("10. Arrow");
	}
	/**
	 * 
	 * @param shape		shape to draw, can be 1-6 for triangle, alternate triangle, pyramid, square, hollow square and rectangle respectively
	 * @param height	height to draw the shape
	 * @param character character the shape will be composed of
	 * @return shape is drawn to console
	 * @author macdja38
	 */
	public void Draw() {
		switch (Shape) {
		case 1: //triangle
			for(int i=1; i<=Height; i++) {
				System.out.println(nCharacters(i,Character));
			}
			break;
		case 2: //alternate triangle 
			for(int i=1; i<=Height; i++) {
				System.out.println(nCharacters((2*i)-1,Character));
			}
			break;
		case 3: //pyramid; line based
			for(int i=1; i<=Height; i++) {
				System.out.print(nCharacters(Height-i,' '));
				System.out.println(nCharacters((2*i)-1,Character));
			}
			break;
		case 4: //square
			for(int i=1; i<=Height; i++) {
				System.out.println(nCharacters(Height, Character));
			}
			break;
		case 5: //hollow square
			System.out.println(nCharacters(Height, Character));
			for(int i=1; i<=Height-2; i++) {
				System.out.print(Character);
				System.out.print(nCharacters(Height-2, ' '));
				System.out.println(Character);
			}
			if(Height>1) {
				System.out.println(nCharacters(Height, Character));
			}
			break;
		case 6: //rectangle
			for(int i=1; i<=Height; i++) {
				System.out.println(nCharacters(Height*2, Character));
			}
			break;
		case 7: //diamond
			for(int i=1; i<=Height/2+1; i++) {
				System.out.print(nCharacters((Height-(2*(i-1))),' '));
				System.out.println(nCharacters((4*i)-3,Character));
			}
			for(int i=Height/2; i>0; i--) {
				System.out.print(nCharacters(Height-2*(i-1),' '));
				System.out.println(nCharacters((4*i)-3,Character));
			}
			break;
		case 8: //spaceship
			for(int i=1; i<=Height/2+1; i++) {
				System.out.print(nCharacters(Height-i,' '));
				System.out.println(nCharacters((4*i)-3,Character));
			}
			for(int i=Height/2; i>0; i--) {
				System.out.print(nCharacters(Height-i,' '));
				System.out.println(nCharacters((4*i)-3,Character));
			}
			break;
		case 9: //house
			for(int i=1; i<=Height/2; i++) {
				System.out.print(nCharacters((Height-(2*(i))),' '));
				System.out.println(nCharacters((4*i)-3,Character));
			}
			for(int i=1; i<=Height/2; i++) {
				System.out.println(nCharacters(2*Height-3, Character));
			}
			break;
		case 10: //arrow
			for(int i=1; i<=Height/2; i++) {
				System.out.println(' ' + nCharacters(2*Height-5, Character));
			}
			for(int i=1; i<=Height/2; i++) {
				System.out.print(nCharacters(((2*i+Height)-(Height)-2),' '));
				System.out.println(nCharacters((Height*2+1)-(4*i),Character));
			}
			break;
		}
	}
}