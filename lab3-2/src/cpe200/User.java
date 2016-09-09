package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;
    private String user_pattern = new String("^[A-Za-z][A-Za-z0-9]{7,}$") ;
    private String pass_pattern = new String("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}$");
    public User() {}
    public boolean setUserName(String name) {this.userName = (name.matches(user_pattern))?name:this.userName; return name.matches(user_pattern);}
    public boolean setPassword(String name) {this.password = (name.matches(pass_pattern))?name:this.password; return name.matches(pass_pattern);}
    public String getUserName() {return this.userName;}
    public String getPassword() {return this.password;}
}
/*
For username, alphanumeric(A-Z)(a-z)(0-9) only, no symbols.
The first character must be an english alphabet.
The username has to be at least eight character in length.
The method setUserName() must return false when an invalid name is assigned.

For password, it has to be alphanumeric only, no symbols.
There must be at least one number and one english alphabet in the password.
Also there must be at least one capitalized character and one non-capitalized character.
The length must be at least 12. The method setPassword() must return false when an invalid password is assigned.
*/
