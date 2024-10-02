package com.ritish.portfolio.Experience;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String company;
    private String role;
    private String icon_url;
    private String jobType;
    private String location;
    private String tenure;
    private String locationType;

}
