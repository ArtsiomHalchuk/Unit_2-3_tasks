package by.epam.hometask;

public class T38c {

	public static void main(String[] args) {
		double x = 0;
        double y = -2;
        double temp=Math.sqrt(x*x+y*y);
        boolean B;
        if(x>=0&&y>=0&&temp<=4) {
        	B=true;
        }else {
        	if(x>=0&&y<=0&&temp<=5){
        	B=true;	
        	  }else {
        B=false;
        	}
        }
        
        System.out.println("ТОчка с координатами ("+x+","+y+") принадлежит фигуре:   "+B);
        }
	}
