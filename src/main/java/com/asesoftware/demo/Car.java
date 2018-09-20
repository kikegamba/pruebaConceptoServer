package com.asesoftware.demo;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Car 
{
    @Id @GeneratedValue
    private Long id;
    private @NonNull String name;
    
    public void setName(String nameP)
    {
    	name=nameP;
    }
    
    public String getName()
    {
    	return name;
    }
}


