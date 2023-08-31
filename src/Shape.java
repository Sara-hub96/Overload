public class Shape {

   private String shapeName;
   private int numberOfEdges;

   public Shape(){
       this.shapeName = "Undefined Shape";
       System.out.println(String.format("L'oggetto %s è stato creato", shapeName));
   }

   public Shape(double radius){
       this.shapeName = "Circle";
       System.out.println(String.format("L'oggetto %s ha un raggio di misura %.1f", shapeName, radius));
   }

   public Shape(int edges, double edgeLength){
       this.shapeName = "Square";
       this.numberOfEdges = edges;
       System.out.println(String.format("L'oggetto %s ha %d lati di misura %.1f", shapeName, numberOfEdges, edgeLength));
   }

   public Shape(int edges, double e1, double e2){
       this.numberOfEdges = 4;
       this.shapeName = "Rectangle";
       System.out.println(String.format("L'oggetto %s ha %d lati, larghezza: %.1f, altezza: %.1f", shapeName, numberOfEdges, e1, e2));
   }

   public Shape(int edges, double e1, double e2, double e3){
       this.numberOfEdges = 3;
       this.shapeName = "Triangle";
       System.out.println(String.format("L'oggetto %s ha %d lati, misure: %.1f - %.1f - %.1f", shapeName, numberOfEdges, e1, e2, e3));
   }

   public String getShapeDetails(){
       return String.format("Nome: %s, lati: %d", shapeName, numberOfEdges);
   }
}
