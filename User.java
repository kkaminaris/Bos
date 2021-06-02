package sample;

public class User{
    protected String name;
    protected String phone_number;
    protected String email;
    protected String password;

    public String getname() {
        return name;
    }
    public void setname(String editedname){ this.name = editedname;}

    public String getphone_number() {
        return phone_number;
    }
    public void setphone_number(String editedphone_number){ this.phone_number = editedphone_number;}

    public String getemail() {
        return email;
    }
    public void setemail(String editedemail){ this.email = editedemail;}

    public String getpassword() {
        return password;
    }
    public void setpassword(String editedpassword){ this.password = editedpassword;}
}
