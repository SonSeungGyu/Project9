package abstractex.quiz;

import java.util.ArrayList;

public class Quiz5 {
	public static void main(String[] args) {
	
		ArrayList<Animal> list = new ArrayList<Animal>();
		
		list.add(new Human());
		list.add(new Tiger());
		
		for (int i = 0; i < list.size(); i++) {
			Animal ani = list.get(i);
			ani.sleep();
			ani.move();
			
			if(ani instanceof Human) {
				Human hu = (Human)ani;
				hu.readBook();
			}else if(ani instanceof Tiger) {
				Tiger ti = (Tiger)ani;
				ti.hunting();
			}
		}
	}
}


