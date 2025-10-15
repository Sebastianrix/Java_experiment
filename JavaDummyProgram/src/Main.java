public class Main{

public static void main (String[] args) {
Student s1 = new Student();
    s1.setFirstName("John");
    s1.setLastName("Johnson");

System.out.println(s1.getFirstName());


}}


class Student{
private String firstName;
private String lastName;


public void setFirstName(String firstName){
this.firstName = firstName;
}
public void setLastName(String lastName){
this.lastName = lastName;
}

public String getFirstName(){
    return firstName;
}
public String getLastName(){
    return lastName;
}

public void addDays(int antal){

}

}