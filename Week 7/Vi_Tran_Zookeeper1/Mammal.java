package com.part1.zookeeper;

public class Mammal {
	Integer energyLevel = 100;
	
	public Integer displayEnergy() {
		System.out.println("Energy level: " + energyLevel);
		return energyLevel;
	}

}
