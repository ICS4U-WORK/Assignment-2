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
		for(int j=0; j<n; j++) {
			returnString+=characters;
		}
		return returnString;
	}
	public void Draw(int shape, int height, char character) {
		switch (shape) {
		case 1:
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
		}
	}
}