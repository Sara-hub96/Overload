//Inheritance - Overload

public class Main {
    public static void main(String[] args) {

        Shape shape1 = new Shape();
        Shape shape2 = new Shape(10.5);
        Shape shape3 = new Shape(4, 10.2);
        Shape shape4 = new Shape(4,5.2,2.5);
        Shape shape5 = new Shape(3,2.2,3.5,3.5);

        String detailsShape1 = shape1.getShapeDetails();
        String detailsShape2 = shape2.getShapeDetails();
        String detailsShape3 = shape3.getShapeDetails();
        String detailsShape4 = shape4.getShapeDetails();
        String detailsShape5 = shape5.getShapeDetails();

        System.out.println(detailsShape1);
        System.out.println(detailsShape2);
        System.out.println(detailsShape3);
        System.out.println(detailsShape4);
        System.out.println(detailsShape5);
    }
}