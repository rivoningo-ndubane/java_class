public class TestStudent
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		System.out.println(s1);
		
		s1.setName("Rivoningo");
		System.out.println("\nNow Name = " + s1.getName());
		
		s1.setStudentNumber("55829242");
		System.out.println("Now StudentNumber = " + s1.getStudentNumber());
		
		System.out.println(s1);
	}
}