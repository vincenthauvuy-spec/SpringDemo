package com.vincent.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Aknowledge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Id
    protected Integer skillId;

    @ManyToOne
    @MapsId ("userId")
    @JoinColumn (name = "user_id" )
    protected AppUser user;

    @ManyToOne
    @MapsId ("skillId")
    @JoinColumn (name = "skill_id" )
    protected Skill skill;

    protected int level;
}
