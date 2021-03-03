package Tema1;

public class Operaciones {
	private float to=0;
	private String to1;
	
	
	public Operaciones(float x,String op) {
		if(op.equals("sum")) {
			to=x+4;
			to1="+4";
		}
		else if(op.equals("res")){
			to=x-4;
			to1="-4";
		}
		else if(op.equals("mul")){
			to=x*4;
			to1="*4";
		}
		else if(op.equals("div")){
			to=x/4;
			to1="/4";
		}	
	}

	public float getto() {
		return to;
	}
	public void setto(float to) {
		this.to=to;
	}
	public String getto1() {
		return to1;
	}
	public void setto1(String to1) {
		this.to1=to1;
	}
	
}
