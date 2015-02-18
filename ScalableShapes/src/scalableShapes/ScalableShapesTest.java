/**
 * 
 */
package scalableShapes;

/**
 * code to test ScalableShapes code, requests filtered input from the user and passes ScalableShapes known valid parameters
 * @author macdja38
 *
 */
public class ScalableShapesTest {
	public static void main(String args[]) {
		char character; //character printed to form shape
		int shape; //shape the user would like
		int height; //height of the shape
		while(true) {
			System.out.println("Please input the shape you would like: [1-10]"); 
			shape = Keyboard.getInteger(1,10);
			System.out.println("Please input the height: [1-100]");
			height = Keyboard.getInteger(1,100);
			System.out.println("Please input a character:");
			character = Keyboard.getCharacter();
			new ScalableShapes().Draw(shape, height, character);
			System.out.println("Would you like another shape? [true/false]");
			if (Keyboard.getBoolean() == false) {
				break;
			}
		}
	}
}
