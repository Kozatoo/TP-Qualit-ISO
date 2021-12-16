package Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class User {
    public String firstName;
    public String lastName;
    public String email;
    public String password;
    public Date dateOfBirth;
    public User(String firstName,String lastName,String email,String password,Date dateOfBirth) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.password=password;
        this.dateOfBirth=dateOfBirth;
    }
}
