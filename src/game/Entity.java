package game;

public class Entity {
	public int x, y, dirx, diry;
	public int gravity, speed;
	boolean friendly;
	String name;
	Entity entity;
	
	
	public Entity () {
		x = 0;
		y = 0;	
		diry = 1145;
		gravity = 800;
		speed = 1;
		friendly = true;
		name = "";
		
	}
	
	public void setSpeed(int s) {
		this.speed = s;
	}
	
	/*public boolean equals(Entity entity) {
		if(entity.name == entity1.name && entity.speed == entity1.speed 
				&& entity.gravity == entity1.gravity && entity.friendly == entity1.friendly)
			return true;
		else
			return false;
	}*/
	
	public void changeName (String s) {
		this.name = s;
	}
}
