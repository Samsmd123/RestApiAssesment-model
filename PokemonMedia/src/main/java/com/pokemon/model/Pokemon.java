package com.pokemon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Pokemon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "pokemon_gen")
	@SequenceGenerator(name="pokemon_gen",sequenceName = "pokemon_sequence",initialValue = 100)
private int pokemonId;
private String name;
private String type;
@ManyToOne
@JoinColumn(name= "team_id") 
Trainer trainer;

}
