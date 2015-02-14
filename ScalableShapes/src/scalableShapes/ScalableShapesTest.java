/**
 * 
 */
package scalableShapes;

/**
 * @author macdja38
 *
 */
public class ScalableShapesTest {
	public static void main(String args[]) {
		char character; //character printed to form shape
		int shape; //shape the user would like
		int height; //height of the shape
		while(true) {
			System.out.println("Please input a 1-5 based on the shape you would like:"); 
			shape = Keyboard.getInteger(1,5);
			System.out.println("Please input the height:");
			height = Keyboard.getInteger();
			System.out.println("Please input a character:");
			character = Keyboard.getCharacter();
			new ScalableShapes().Draw(shape, height, character);
			break;
		}
		while(true) {
			if (Keyboard.getBoolean() == true) {
				break;
			}
		}
	}
}
