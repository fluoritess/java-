package Ball;

import java.awt.Color;

import java.awt.Graphics;
import java.util.ArrayList;

public class Ball {
	private int diameter;
	private int x;
	private int y;
	private Color color;

	private int direction=(int) (Math.random()*8+1);
	
	public Ball(int diameter, int x, int y, Color color) {
		super();
		this.diameter = diameter;
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(color);
		g.fillOval(x, y, diameter, diameter);  	
	}
	
	public void move(int m)
	{
		switch (direction) {
		case 1:x-=m;break;//��
		case 2:x+=m;break;//��
		case 3:y-=m;break;//��
		case 4:y+=m;break;//��
		case 5:x-=m;y-=m;break;//����
		case 6:x-=m;y+=m;break;//����
		case 7:x+=m;y-=m;break;//����
		case 8:x+=m;y-=m;break;//����
			

		default:
			break;
		}	
		
	}
}
