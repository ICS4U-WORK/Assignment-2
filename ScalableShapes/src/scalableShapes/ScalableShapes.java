package scalableShapes;

/**
 * Class for drawing a shape and support code
 * @author macdja38
 */
public class ScalableShapes {
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
	public void Draw(int shape, int height, char character) {
		switch (shape) {
		case 1: //triangle
			for(int i=1; i<=height; i++) {
				System.out.println(nCharacters(i,character));
			}
			break;
		case 2: //alternate triangle 
			for(int i=1; i<=height; i++) {
				System.out.println(nCharacters((2*i)-1,character));
			}
			break;
		case 3: //pyramid; line based
			for(int i=1; i<=height; i++) {
				System.out.print(nCharacters(height-i,' '));
				System.out.println(nCharacters((2*i)-1,character));
			}
			break;
		case 4: //square
			for(int i=1; i<=height; i++) {
				System.out.println(nCharacters(height, character));
			}
			break;
		case 5: //hollow square
			System.out.println(nCharacters(height, character));
			for(int i=1; i<=height-2; i++) {
				System.out.print(character);
				System.out.print(nCharacters(height-2, ' '));
				System.out.println(character);
			}
			if(height>1) {
				System.out.println(nCharacters(height, character));
			}
			break;
		case 6: //rectangle
			for(int i=1; i<=height; i++) {
				System.out.println(nCharacters(height*2, character));
			}
			break;
		case 7: //diamond
			for(int i=1; i<=height/2+1; i++) {
				System.out.print(nCharacters((height-(2*(i-1))),' '));
				System.out.println(nCharacters((4*i)-3,character));
			}
			for(int i=height/2; i>0; i--) {
				System.out.print(nCharacters(height-2*(i-1),' '));
				System.out.println(nCharacters((4*i)-3,character));
			}
			break;
		case 8: //spaceship
			for(int i=1; i<=height/2+1; i++) {
				System.out.print(nCharacters(height-i,' '));
				System.out.println(nCharacters((4*i)-3,character));
			}
			for(int i=height/2; i>0; i--) {
				System.out.print(nCharacters(height-i,' '));
				System.out.println(nCharacters((4*i)-3,character));
			}
			break;
		case 9: //house
			for(int i=1; i<=height/2; i++) {
				System.out.print(nCharacters((height-(2*(i))),' '));
				System.out.println(nCharacters((4*i)-3,character));
			}
			for(int i=1; i<=height/2; i++) {
				System.out.println(nCharacters(2*height-3, character));
			}
			break;
		case 10: //arrow
			for(int i=1; i<=height/2; i++) {
				System.out.println(' ' + nCharacters(2*height-5, character));
			}
			for(int i=1; i<=height/2; i++) {
				System.out.print(nCharacters(((2*i+height)-(height)-2),' '));
				System.out.println(nCharacters((height*2+1)-(4*i),character));
			}
			break;
		}
	}
}