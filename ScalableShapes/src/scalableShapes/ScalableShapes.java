/**
 * 
 */
package scalableShapes;

/**
 * @author macdja38
 *
 */
public class ScalableShapes {
	public String nCharacters(int n, char characters) {
		String returnString = "";
		for(int j=0; j<=n; j++) {
			returnString+=characters;
		}
		return returnString;
	}
	public void Draw(int shape, int height, char character) {
		switch (shape) {	
		case 1:
			for(int i=0; i<height; i++) {
				System.out.println(nCharacters(i,character));
			}
			break;
		case 2:
			System.out.println("Pyramid alt " + character);
			for(int i=0; i<height; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print(character);
				}
				System.out.println();
			}
		}
	}
}