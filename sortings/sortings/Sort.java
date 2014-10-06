package sortings;

import java.util.List;

public class Sort {
	public static void insertionSortingIntegers(List<Integer> s){
		for (int i = 1; i < s.size(); i++) {
			int j = i;
			while ( j>0 && s.get(j) < s.get(j-1)){
				Sort.swap(s.get(j), s.get(j - 1));
				
			}
		}
	}
	
	public static void insertionSortingDoubles(List<Double> s){
		for (int i = 1; i < s.size(); i++) {
			int j = i;
			while ( j>0 && s.get(j) < s.get(j-1)){
				Sort.swap(s.get(j), s.get(j - 1));
				
			}
		}
	}
	
	public static void insertionSortingFloats(List<Float> s){
		for (int i = 1; i < s.size(); i++) {
			int j = i;
			while ( j>0 && s.get(j) < s.get(j-1)){
				Sort.swap(s.get(j), s.get(j - 1));
				
			}
		}
	}
	
	private static void swap(Object a, Object b) {
		Object t = a;
		a = b;
		b = t;
	}
}
