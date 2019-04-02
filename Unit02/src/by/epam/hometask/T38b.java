package by.epam.hometask;

public class T38b {

	public static void main(String[] args) {
        double x = 0;
        double y = 8;
        boolean B;
        	if (x>=-2&&x<=2&&y>=0&&y<=4) {
        		B=true;
        	}else if(x>=-4&&x<=4&&y<=0&&y>=3){
        		B=true;
        	}
        	else{
        		B=false;
        		}
        	System.out.println("ТОчка с координатами ("+x+","+y+") принадлежит фигуре:   "+B);
	}

}
