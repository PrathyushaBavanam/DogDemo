package com.prathyusha.DogDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope (value = "singleton") /*Create object only once if you want to create multiple objects use "prototype"*/
public class Dog {

	private int id;
	private String name;
	private String breed;
	
	@Autowired
	private Trainer trainer;
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	public Dog() {
		id = 99;
		name= "Not yet decided";
		breed = "Hybrid";
		System.out.println("Object Created");
				
	}
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
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", breed=" + breed + "]" +"\n" + trainer.toString() ;
	}
	
	
}
