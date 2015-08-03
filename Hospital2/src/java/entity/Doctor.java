

package entity;

import javax.persistence.*;



@Entity
public class Doctor {
    
    @Id
    @GeneratedValue
    private int id;
    private String contact;
    private String dept;   
    private String email;
    private String gender;
    private String image;
    private String location;
    private String name; 
    
    
    

    public Doctor(int id, String contact, String dept, String email, String gender, String image, String location, String name) {
        this.id = id;
        this.contact = contact;
        this.dept = dept;
        this.email = email;
        this.gender = gender;
        this.image = image;
        this.location = location;
        this.name = name;
        
        
        
    }
    

    public Doctor(int id) {
        this.id = id;
    }

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
}
