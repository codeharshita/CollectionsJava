package OopsConcept;


class Subject{
	
	private String subId;
	private String name;
	public int maxMarks;
	public int marksObtain;
	
	
	
	//Class Constructor:-
	public Subject(String subId, String name,int maxMarks) {
		this.subId=subId;
		this.name=name;
		this.maxMarks=maxMarks;
		
	}
	
	
	


	




	public String getsubId() {
		return subId;
	}
	public String getName() {
		return name;
		
	}
	public int getmaxMarks() {
		return maxMarks;
	}
	public int getMarksObtain() {
		return marksObtain;
	}
	
	
	public void setMaxMarks(int m) {
		maxMarks=m;
	}
	public void setMarksObtain(int mks) {
		marksObtain=mks;
	}
	
	public String toString() {
		return "\nSubjectId:" +subId+ "\nName:" + name + "\nMaxMarks:" + maxMarks;
	}
	
	
}



public class Demo {

	public static void main(String[] args) {
		Subject[] subs = new Subject[3];
		subs[0]= new Subject ("s101","Physics",100);	
		subs[1]= new Subject ("s102","Maths",99);
		subs[2]= new Subject ("s103","Chemistry",98);
	
		//Enhanced Forloop
		for(Subject s:subs) {
			System.out.println(s);
		}
		
	}

}
