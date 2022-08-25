//filename: Main.java
public class Main {
    int modelYear;
    String modelMake;
    String modelName;
  
    public Main(int year, String make, String name) {
      modelYear = year;
      modelMake = make;
      modelName = name;
    }
  
    public static void main(String[] args) {
      Main myCar = new Main(1969, "Ford", "Mustang");
      System.out.println(myCar.modelYear + " " + myCar.modelMake + " " + myCar.modelName);
    }
  }
  