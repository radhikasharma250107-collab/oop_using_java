class Shape {

    void area(int side) {
        System.out.println("Square Area = " + (side * side));
    }

    void area(int l, int b) {
        System.out.println("Rectangle Area = " + (l * b));
    }

    public static void main(String[] args) {

        Shape s = new Shape();
        s.area(4);       
        s.area(5, 6);    

        Shape c = new Circle();  
        c.area(3);        
    }
}

class Circle extends Shape {

    void area(int side) {
        System.out.println("Circle Area = " + (3.14 * side * side));
    }
}
