import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		// ArrayList<DATATYPE>
		ArrayList<String> bagStudents = new ArrayList<String>();
		
		bagStudents.add("Matt who comes late to class");
		bagStudents.add("Lauren the timeling");
		bagStudents.add("Charlie who was kind of on time");
		bagStudents.add("Storm the accurate");
		
		System.out.println(bagStudents);
		System.out.println("Size: " + bagStudents.size());
		//.size() is basically .length
		
		bagStudents.remove(2);
		System.out.println(bagStudents);
		System.out.println("Size: " + bagStudents.size());
		
		bagStudents.add(2, "Kenya the swift"); // puts her right after the third person, before fourth
		
		System.out.println(bagStudents);
		System.out.println("Size: " + bagStudents.size());
		
//		int age = 17; //primitive
//		age++;
//		System.out.println(age);
//		
//		Integer weight = 180;
//		Integer year = new Integer(2015);
//		weight = weight - 50;
//		System.out.println(year.MAX_VALUE); // Wrapper cllasses have features, primitives do not

		
	}
	
}
