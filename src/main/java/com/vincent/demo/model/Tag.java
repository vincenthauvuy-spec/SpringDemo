package com.vincent.demo.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.vincent.demo.view.AppUserView;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(length = 20,nullable = false, unique = true) //l'email en bdd est obligatoire et unique
    @NotBlank//vérifie que la valeur n'est ni null ni vide ("")
    @Length(min = 3, max = 20)
    @JsonView(AppUserView.class)
    protected String name;

}
