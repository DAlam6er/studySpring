package ru.specialist.house;

import java.util.Map;

public class House
{
	private Window window;
	//private Collection<Door> doors;
	//private List<Door> doors;
	//private Door[] doors;
	private Map<String,Door> doors;
	private Material wall; 
	private int height; // высота в этажах

	public House() {}

	public House(Window window)
	{
		System.out.println("House created.");
		this.window = window;
	}
	
	public void view() // открыть окно
	{
		window.open();
	}
	
	public void buildWall()
	{
		for (int i = 1; i <= getHeight(); i++) {
			System.out.printf("Этаж %d. ", i);
			wall.cover();
		}
	}
	
	public void installDoors()
	{
		//for(Door door : doors)
		//	door.install();
		for(Map.Entry<String, Door> e : doors.entrySet()) {
			System.out.printf("Ключ %s. ", e.getKey());
			e.getValue().install();
		}
	}

	public Material getWall()
	{
		return wall;
	}

	public void setWall(Material wall)
	{
		this.wall = wall;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	public Window getWindow()
	{
		return window;
	}

	public void setWindow(Window window)
	{
		this.window = window;
	}

	public Map<String,Door> getDoors()
	{
		return doors;
	}

	public void setDoors(Map<String,Door> doors)
	{
		this.doors = doors;
	}

	/*public Collection<Door> getDoors() {
		return doors;
	}

	public void setDoors(Collection<Door> doors) {
		this.doors = doors;
	}*/
}
