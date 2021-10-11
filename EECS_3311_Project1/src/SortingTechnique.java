import java.util.ArrayList;
import java.util.Collections;

public class SortingTechnique {
	
	private ArrayList<Shape> list;
	
	static SortingTechnique instance = null;
	
	private SortingTechnique(ArrayList<Shape> list) {
		this.list = list;
		
	}
	
	public static SortingTechnique sortShapes(ArrayList<Shape> list) {

		
		Shape temp;
	    boolean sorted = false;

	    while (!sorted) {
	        sorted = true;
	        for (int i = 0; i < list.size()-1; i++) {
	            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
	                temp = list.get(i);
	                list.set(i, list.get(i + 1));
	                list.set(i + 1, temp);
	                sorted = false;
	            }
	        }
	    }
		return instance;
		
	}

}
