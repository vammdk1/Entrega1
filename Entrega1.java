package Tema1;

public class Entrega1 {
	public static void main (String[] prin) {
		String [] op = {"sum","res","mul","div"};
		float x=4;
		
		for(int i=0;i<4;i++){
			Operaciones res= new Operaciones(x,op[i]);	
			for(int h=0;h<4;h++) {
				x=res.getto();
				Operaciones res2= new Operaciones(x,op[h]);
				for(int j=0;j<4;j++) {
					x=res2.getto();
					Operaciones res3= new Operaciones(x,op[j]);
					System.out.println(res3.getto()+"=4"+res.getto1()+""+res2.getto1()+""+res3.getto1());
				}
			}
		}
	}
}
