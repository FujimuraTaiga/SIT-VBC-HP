package club.volleyball.SIT;

import java.io.Serializable;

import lombok.Data;

@Data
public class BirthStone implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String month;

    private String name;

    private String color;
}