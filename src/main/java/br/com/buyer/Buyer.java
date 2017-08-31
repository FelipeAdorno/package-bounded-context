package br.com.buyer;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Felipe Adorno - felipeadsc@gmail.com
 */
@Data
@Entity
public class Buyer {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String governmentId;

}
