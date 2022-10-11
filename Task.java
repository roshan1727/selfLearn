class Student
{
    String name;
    int rollno;
    char section;
}
public class Task {

	public static void main(String[] args) {
		Student students[] = new Student[20];
	    
        students[0] = new Student();
        students[0].name = "Gokul";
        students[0].rollno = 06;
        students[0].section = 'A';
    
        students[1] = new Student();
        students[1].name = "Suresh";
        students[1].rollno = 10;
        students[1].section = 'B';
    
        students[2] = new Student();
        students[2].name = "Ramesh";
        students[2].rollno = 17;
        students[2].section = 'A';
    
        students[3] = new Student();
        students[3].name = null;
        students[3].rollno = 07;
        students[3].section = 'A';
    
        students[4] = new Student();
        students[4].name = "Vignesh";
        students[4].rollno = 13;
        students[4].section = 'B';
        
        students[5] = new Student();
        students[5].name = "Pravin";
        students[5].rollno = 9;
        students[5].section = 'B';
        
        students[6] = new Student();
        students[6].name = "Anijith";
        students[6].rollno = 15;
        students[6].section = 'A';
    
        students[7] = new Student();
        students[7].name = "Vinith";
        students[7].rollno = 14;
        students[7].section = 'A';
        
        students[8] = new Student();
        students[8].name = "Dinesh";
        students[8].rollno = 11;
        students[8].section = 'B';
        
        students[9] = new Student();
        students[9].name = "Alagu";
        students[9].rollno = 12;
        students[9].section = 'A';
        
        students[10] = new Student();
        students[10].name = "Saran";
        students[10].rollno = 19;
        students[10].section = 'B';
        
        students[11] = new Student();
        students[11].name = "Arun";
        students[11].rollno = 16;
        students[11].section = 'A';
        
        students[12] = new Student();
        students[12].name = "Pathmavasan";
        students[12].rollno = 18;
        students[12].section = 'B';
        
        students[13] = new Student();
        students[13].name = "Dharun";
        students[13].rollno = 20;
        students[13].section = 'A';
        
        students[14] = new Student();
        students[14].name = "Surya";
        students[14].rollno = 01;
        students[14].section = 'A';
        
        students[15] = new Student();
        students[15].name = "Thiru";
        students[15].rollno = 02;
        students[15].section = 'B';
        
        students[16] = new Student();
        students[16].name = "Ram";
        students[16].rollno = 03;
        students[16].section = 'B';
        
        students[17] = new Student();
        students[17].name = "Srinath";
        students[17].rollno = 04;
        students[17].section = 'B';
        
        students[18] = new Student();
        students[18].name = "Sathish";
        students[18].rollno = 05;
        students[18].section = 'A';
        
        students[19] = new Student();
        students[19].name = null;
        students[19].rollno = 8;
        students[19].section = 'A';
    
        for(int i = 0; i < students.length; i++)
        {
        	if(students[i].name==null) {
        		System.out.println(students[i].rollno);
        	}
            System.out.println( "NAME:"+students[i].name + " ROLLNO: " + students[i].rollno + " CLASS: " + students[i].section + " section." );
        }
        System.out.println("NAME:"+students[20].name + " ROLLNO: " + students[20].rollno + " CLASS: " + students[20].section + " section.");
        try {
        	System.out.println("NAME:"+students[20].name + " ROLLNO: " + students[20].rollno + " CLASS: " + students[20].section + " section.");
        }
        catch(Exception e){
        	System.out.println("There is no student in this category");       	
        }
        finally {
        	students[20]=new Student();
        	students[20].name="Pradeesh";
        	System.out.println(students[20].name);
        }
    }	
}