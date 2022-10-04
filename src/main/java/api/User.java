package api;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.aspectj.weaver.ast.Instanceof;

@Entity
public class User {
    private @Id @GeneratedValue Long id;
    private String username;
    private String password;

    User(){}

    User(String name, String password) {
        this.username = username;
        this.password = password;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public boolean equals(Object o) {
        if(this == o) 
            return true;
        if(!(o instanceof User))
            return false;
        User user = (User) o;
        return Objects.equals(this.id, user.id) && Objects.equals(this.password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.password);
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            "}";
    }
}
