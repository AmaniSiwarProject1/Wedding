package Wedding.Planner;

public class Users{
	 
	 private String fullname;
	    private String password;
	    private String email;

	    public Users(String email,String fullname, String password) {
	        this.fullname = fullname;
	        this.password = password;
	        this.email=email;

} public String getEmail() {
   return email;
}
public void setEmail(String email) {
   this.email = email;
}
public String getpassword() {
   return password;
}
public void setPassword(String password) {
   this.password = password;
}
public String getfullname() {
   return fullname;
}
public void setusername(String rul) {
   this.fullname = fullname;
}}