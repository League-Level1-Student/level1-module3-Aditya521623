package _06_gridworld;

import java.awt.Color;

import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {

	public static void main(String[] args) {
		
		int random = new Random().nextInt(10) + 1;
		
		
		int random2= new Random().nextInt(10)+1;
		
	

World world1= new World();

world1.show();

Bug bug1=new Bug(Color.green);

Bug bug2=new Bug();

Flower frawar = new Flower();

Flower frawar2= new Flower();

Location loc1=new Location(3,3);

Location loc2=new Location(random,random2);

Location flowerLoc=new Location(random,random2-1);

Location flowerLoc2=new Location(random,random2+1); 




world1.add(loc1, bug1);



world1.add(loc2, bug2);

bug2.setColor(Color.blue);

bug2.turn();

world1.add(flowerLoc, frawar);

world1.add(flowerLoc2, frawar2);

for(int i = 0; i<10; i++) {
	
for(int j =0; j<10;j++ ) {
	
Location allFlowerLoc=new Location(i,j);
	
world1.add(allFlowerLoc, frawar);
	
}
	
}


	}

	}

	



