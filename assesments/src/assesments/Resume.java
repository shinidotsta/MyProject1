package assesments;

public class Resume
{
	String name;
	String age;
	String degree;
	String branch;
	String contactno;
	public Resume(String name2, String age2, String degree2, String branch2, String contactno2)
	{
		this.name=name2;
		this.age=age2;
		this.degree=degree2;
		this.branch=branch2;
		this.contactno=contactno2;
	}
public void dispaly()
{
	System.out.println("Name           :"+""+this.name);
	System.out.println("Age            :"+""+this.age);
	System.out.println("Degree         :"+""+this.degree);
	System.out.println("Branch         :"+""+this.branch);
	System.out.println("ContactNo      :"+""+this.contactno);
}

}
