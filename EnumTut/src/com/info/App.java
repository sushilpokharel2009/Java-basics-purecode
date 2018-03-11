package com.info;

public class App {

	public String NAME = "Ram" ;
	
	public void abc(){
		NAME = "Hari";
	}
	
	
	public static void main(String[] args) {
		
		Direction dir = Direction.NORTH;

		System.out.println(dir);
		
		
		if(dir == Direction.EAST){
			System.out.println("E");
		}else if(dir==Direction.NORTH){
			System.out.println("N");
		}
		
		
		switch(dir){
		
		case EAST:
			System.out.println("S E");
			break;
		case WEST:
			System.out.println("S W");
			break;
		case NORTH:
			System.out.println("S N");
			break;
		case SOUTH:
			System.out.println("S S");
		}
		
	}

}
