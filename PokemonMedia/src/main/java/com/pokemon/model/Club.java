package com.pokemon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Club {
	private String clubName;
	 @Id
		@GeneratedValue(strategy = GenerationType.AUTO,generator = "club_gen")
		@SequenceGenerator(name="club_gen",sequenceName = "club_sequence",initialValue = 100,allocationSize = 10)
	private int clubBadge;
	private String location;
	 @OneToOne
	@JoinColumn(name= "club_badge")// to give a different column name
	private Trainer trainer;

}
