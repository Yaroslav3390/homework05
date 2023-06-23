public class Figure {
    double height;
    double width;
    double length;

    public Figure() {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Figure(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double figureVolume(double height, double length, double width) {
        double result = this.height * this.length * this.width;
        return result;
    }

    public void figureSurfaceArea () {
        System.out.println(2 * (this.length * this.width) + (this.length * this.height));


    }
}

