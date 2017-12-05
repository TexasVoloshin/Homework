package figury;

public class Kolo extends Figura {
	private double r;
	
	public Kolo(Punkt p, double nr) {
		super(p);
		r = nr;
	}
	
	public double pole() {
		return Math.PI * r * r;
	}

	public void powieksz(double ile) {
		r *= ile;
	}
	
	public String toString() {
		return "Kolo(" + r + ")" + super.toString();
	}
}
