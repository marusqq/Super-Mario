package game;

public class  Entity {
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
	
	public final void setSpeed(int s) {
		this.speed = s;
	}
	
	
	public final void setName (String s) {
		this.name = s;
	}
	
	public final void setFriendly (boolean f) {
		this.friendly = f;
	}
	
	
}
