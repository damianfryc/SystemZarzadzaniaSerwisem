package sample;

import javax.persistence.*;

@Entity
@Table(name = "TabelaMagazyn")
public class Magazyn {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementot")
    private int id;

    @Column(name = "name")
    private String name;

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
}
