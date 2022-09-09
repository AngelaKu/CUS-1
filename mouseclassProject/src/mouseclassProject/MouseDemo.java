package mouseclassProject;

public class MouseDemo {

	public static void main(String[] args) {
		
				Mouse m1=new Mouse();
				m1.showInfo();
				
				System.out.println();
				
				m1.setName("Mickey");
				m1.setAge(90);
				m1.setWeight(100.50);
				
				
				
				Mouse m2=new Mouse();
				
				m2.showInfo();

	}

}

/*
Name	:House mouse
Age	12
Weight	0.68

Name	:Mickey
Age	90
Weight	100.5

Name	:House mouse
Age	12
Weight	0.68
*/