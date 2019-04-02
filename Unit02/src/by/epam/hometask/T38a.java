package by.epam.hometask;

public class T38a {

	public static void main(String[] args) {
		double x=2;
		double y=2;
		boolean b;
		if(y<=(4-x)&&y>=0&&x<=4&&x>0) {
			b=true;
		}else {
			if(y<=(x+4)&&y>=0&&x<=0&&x>=-4) {
				b=true;
			}else {
				b=false;
			}
		}
		System.out.println("ТОчка с координатами ("+x+","+y+") принадлежит треугольнику:   "+b);

	}

}


//y=4-x