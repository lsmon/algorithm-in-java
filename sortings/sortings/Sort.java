package sortings;

import java.util.List;

public class Sort {
	public static void insertionSortingIntegers(List<Integer> s){
		for (int i = 1; i < s.size(); i++) {
			int j = i;
			while ( j>0 && s.get(j) > s.get(j-1)){
				Integer a = s.get(j);
				Integer b = s.get(j - 1);
				Sort.swap(a, b);
				s.set(j, a);
				s.set(j-1, b);
				j = j - 1;
			}
		}
	}
	
	public static void insertionSortingDoubles(List<Double> s){
		for (int i = 1; i < s.size(); i++) {
			int j = i;
			while ( j>0 && s.get(j) < s.get(j-1)){
				Double a = s.get(j);
				Double b = s.get(j-1);
				Sort.swap(a, b);
				s.set(j, a);
				s.set(j-1, b);
			}
		}
	}
	
	public static void insertionSortingFloats(List<Float> s){
		for (int i = 1; i < s.size(); i++) {
			int j = i;
			while ( j>0 && s.get(j) < s.get(j-1)){
				Float a = s.get(j);
				Float b = s.get(j-1);
				Sort.swap(a, b);
				s.set(j, a);
				s.set(j-1, b);
			}
		}
	}
	
	private static void swap(Object a, Object b) {
		Object t = a;
		a = b;
		b = t;
	}
}
