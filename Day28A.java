
class EducationalInstitutes
{
	void admitstudent()
	{
		System.out.println("EducationalInstitutes admitting studens");
	}
	void conductexams()
	{
		System.out.println("EducationalInstitutes conducting exams");
	}
}

class school extends EducationalInstitutes
{
	void conductexams()
	{
		System.out.println("school conducting mid and unit term and final examms");
	}
	void conductFieldTrips()
	{
		System.out.println("school conduct a field trips");
	}
}

class college extends EducationalInstitutes
{
	void conductexams()
	{
		System.out.println("college conducting a semister exams");
	}
	void conductInternships()
	{
		System.out.println("college conducting a internships");
	}
}

class univercity extends EducationalInstitutes
{
	void conductexams()
	{
		System.out.println("univercity conducts final exams");
	}
	void conductReaserches()
	{
		System.out.println("univercity conducting a reaserches");
	}
}



public class Day28A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	EducationalInstitutes e=new EducationalInstitutes();
		school s=new school();
		college c=new college();
		univercity u=new univercity();
		

		s.admitstudent();
		s.conductexams();
		s.conductFieldTrips();
		
		c.admitstudent();
		c.conductexams();
		c.conductInternships();
		
		u.admitstudent();
		u.conductexams();
		u.conductReaserches();
		
		
		
		
		
		
		
	}

}
