package user_portal;

import user_portal.DBConnection;

public class Model {
public Model(){
	DBConnection.getConnection();
}
private String UserName=null;
private String Pwd=null;
private String Course=null;
private String City=null;
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPwd() {
	return Pwd;
}
public void setPwd(String pwd) {
	Pwd = pwd;
}
public String getCourse() {
	return Course;
}
public void setCourse(String course) {
	Course = course;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}

public void retrieve() {
	DBConnection.retrieve(getUserName(), getPwd());
}
public void insert() {
	DBConnection.insert(getUserName(), getPwd(), getCourse(), getCity());
}
public void display() {
	DBConnection.display();
}
}
