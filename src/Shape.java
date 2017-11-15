public abstract class Shape {
    public Shape(String n) { name = n; }
    
    public abstract double getArea( );

    public abstract double getPerimeter( );

    public String getName( ) { return name; }

    public String toString( ) {
        Class c = getClass( );

        String r = name + " is a " + c.getName( )
            + " with an area of " + getArea( );

        return r;
    }

    private String name;

    static double sumOfAreas(Shape shapes[ ]) {
        double area = 0.0;

        for (int i = 0; i < shapes.length;
                i = i + 1) {
            Shape s = shapes[i];
            area = area + s.getArea( );
            }

        return area;
        }


    public static void printShapes(String label, Shape shapes[ ]) {
    
        System.out.println(label);
    
        for (int i = 0; i < shapes.length; i = i + 1) {
            System.out.println("\t" + shapes[i]);
            }
        }
    
    public static Shape biggestArea(Shape shapes[ ]) {
    
        if (shapes.length == 0)
            return null;
    
        Shape it = shapes[0];
    
        for (int i = 1; i < shapes.length; i = i + 1) {
            if (shapes[i].getArea( ) > it.getArea( ))
                it = shapes[i];
            }
    
        return it;
        }
    
    public static void main(String args[ ]) {
        Rectangle r1 = new Rectangle(1.0, 1.0, "r1");
        Rectangle r2 = new Rectangle(2.0, 3.0, "r2");
        Rectangle r3 = new Rectangle(2.0, 4.0, "r3");

        Circle    c1 = new Circle(1.0, "c1");
        Circle    c2 = new Circle(2.0, "c2");

        Shape shapes[ ] = {r1, c1, r2, c2, r3};

        Shape.printShapes("\nThe shapes:", shapes);

        System.out.println("\nSum of the areas: "
            + Shape.sumOfAreas(shapes));

        System.out.println("\nThe biggest Shape " +
           "is:\n\t" + Shape.biggestArea(shapes));
        }
    }

class Rectangle extends Shape {
    public Rectangle(double w, double h, String name) {
        super(name);
        width = w;
        height = h;
    }

    public double getArea( ) {
        return width * height;
        }

    public double getPerimeter( ) {
        return 2.0 * width + 2.0 * height;
        }

    private double width, height;
    }

class Circle extends Shape {
    public Circle(double r, String n) {
        super(n);
        radius = r;
        }

    public double getArea( ) {
        return Math.PI * radius * radius;
        }

    public double getPerimeter( ) {
        return Math.PI * radius * 2.0;
        }

    private double radius;
    }
