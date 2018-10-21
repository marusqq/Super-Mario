package game;

public class Entity {
	public int x, y, dirx, diry;
	public int gravity, speed;
	Entity entity;
	
	
	public Entity () {
		x = 0;
		y = 0;	
		diry = 1145;
		gravity = 800;
		speed = 1;
	}
	
	public void setSpeed(int s) {
		this.speed = s;
	}
}
