package ogp_intlist;

import java.util.Arrays;

public class IntList {
	
	/**
	 * @invar | elements != null
	 * NIET .. Arrays.stream(elements).allMatch(e -> e!= null)
	 * dit geldt dan voor elk element in de array .. mag wel cijfer 0 zijn maar niet 'soort' null
	 * @representationObject
	 */

	// eigenschap module
	private int[] elements;
	
	// gebruikt om AssertEquals na te kijken, terug te krijgen als array
	public int[] toArray() {
		return elements.clone(); // !! REPRESENTATION EXPOSURE, teruggegeven door module
		} 

	// lege IntList aanmaken
	public IntList() {
		this.elements = new int[0];
	}
	
	// nieuwe IntList wordt uit int[] aangemaakt
	public IntList(int[] elements) {
		this.elements = elements.clone(); // !! REPRESENTATION EXPOSURE, gegeven door klant.
	}
	
	// klant krijgt lengte IntList terug
	public int length() {
		return elements.length;
	}
	
	// klant krijgt int op index terug
	public int intAt(int index) {
		return elements[index];
	}
	
	// nieuwe value vanachter erbij zetten, lengte verhoogt met 1
	public void add_end(int value) {
		
		//if (value == null)
			//throw new IllegalArgumentException();
		int[] elements_new = new int[elements.length +1];
		for (int i = 0; i < elements.length; i++) 
			elements_new[i] = elements[i];
			
		elements_new[elements.length] = value;
		this.elements = elements_new;				// nieuwe array dus eigenschap klasse vervangen
	}
	
	// laatste value aan einde array verwijderen
		public void delete_end() {
			
			//if (value == null)
				//throw new IllegalArgumentException();
			
			int[] elements_new = new int[elements.length - 1];
			
			for (int i = 0; i < elements.length - 1; i++) 
				elements_new[i] = elements[i];
				
			this.elements = elements_new;				// nieuwe array dus eigenschap klasse vervangen
		}
}
