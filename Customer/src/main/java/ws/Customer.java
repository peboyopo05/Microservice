package ws;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String surname;
    private String gender;
    private String tel;

    //TODO: 1 add 5 more fields (5 marks)+
    //TODO: 2 add getters and setters for the fields (5 marks)+

    public Customer() {}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    //-------------------------------------//
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    //---------------------------------------//
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }
    //-------------------------------------//
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    //-----------------------------------//
    public void setTel(String tel) {
    this.tel = tel;
    }
    public String getTel() {
        return tel;
    }
    //----------------------------------------//


    @Override
    public String toString() {
        return String.format("Customer [id=%s, name=%s, surname=%s, tel=%s, gender=%s]" ,id,name,surname,gender,tel);
    }
}
