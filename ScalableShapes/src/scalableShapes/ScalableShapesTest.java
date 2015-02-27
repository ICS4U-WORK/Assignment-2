package scalableShapes;

/**
 * code to test ScalableShapes code, requests filtered input from the user and passes ScalableShapes known valid parameters
 * @author macdja38
 *
 */
public class ScalableShapesTest {
	public static void main(String args[]) {
		ScalableShapes Shape = new ScalableShapes();
		while(true) {
			System.out.println("Please input the shape you would like: [1-10]"); 
			Shape.PrintShapes();
			Shape.SetShape(Keyboard.getInteger(1,10));
			System.out.println("Please input the height: [1-100]");
			Shape.SetHeight(Keyboard.getInteger(1,100));
			System.out.println("Please input a character:");
			Shape.SetChar(Keyboard.getCharacter());
			Shape.Draw();
			System.out.println("Would you like another shape? [true/false]");
			if (Keyboard.getBoolean() == false) {
				break;
			}
		}
	}
}
