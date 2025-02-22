package Models;

public class Admin extends User{
    private String admin_name;
    private String admin_password;
    private String admin_email;

    public Admin(String admin_name, String admin_password, String admin_email) {
        super(admin_name, admin_password, admin_email);
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public String getAdmin_email() {
        return admin_email;
    }

    public void setAdmin_email(String admin_email) {
        this.admin_email = admin_email;
    }
}
