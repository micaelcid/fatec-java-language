package negocio;

public abstract class Figura implements IFigura {
    double area;

	public void setArea(double area) {
		this.area = area;
	}

	public double getArea() {
		return area;
	}
}
