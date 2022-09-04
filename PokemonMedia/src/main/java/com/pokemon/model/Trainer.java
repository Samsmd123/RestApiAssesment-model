package com.pokemon.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Trainer {
 private String trainerName;
 @Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "trainer_gen")
	@SequenceGenerator(name="trainer_gen",sequenceName = "trainer_sequence",initialValue = 100,allocationSize = 10)
 private int trainerId;
 private String specialistCategory;
 
 @JsonIgnore
	@OneToOne(mappedBy="trainer")
	Club club;
 
 @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "trainer_id")
 private Set<Pokemon> pokemons;
 
 
 
}
