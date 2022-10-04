import java.util.ArrayList;

public class Laboratory {
  private String name;
  private ArrayList<Student> students;
  private ArrayList<Professor> professors;

  public Laboratory() {
  }

  public Laboratory(String name) {
    this.name = name;
    this.students = new ArrayList<Student>();
    this.professors = new ArrayList<Professor>();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addMember(Student s) {
    this.students.add(s);
  }

  public void addMember(Professor p) {
    this.professors.add(p);
  }
 
  public ArrayList<String> getContactInfos() {
  
    ArrayList<String> ContactInfo = new ArrayList<String> ();
    
    for (int i = 0; i < students.size(); i++){
	contacts.add(students.getContactInfo())    
    }
    
    for (int i = 0; i < professors.size(); i++){
	contacts.add(professors.getContactInfo())    
    }
    return ContactInfo;
  }

  public boolean userExists(String userId) {
  	
  	for (int i = 0; i < students.size(); i++){
  		if(userId == students.get(i).getUserId()){
  			return false;
  		}
  	}
  	
  	for (int i = 0; i < professors.size(); i++){
  		if(userId == professors.get(i).getUserId()){
  			return false;
  		}
  	}
  	
  	return true;
  }

  public int countMembers() {
  
    int totalsize = professors.size() + students.size();
    return totalsize;
    
    
   
    
  }


}
