package collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateVolume() {
        return length * width * height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Box other = (Box) obj;
        return Double.compare(calculateVolume(), other.calculateVolume()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(calculateVolume());
    }

    @Override
    public String toString() {
        return "Length =" + length + " Width =" + width + " Height =" + height + " Volume =" + String.format("%.2f", calculateVolume());
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Box");
        int numberOfBoxes = scanner.nextInt();
        scanner.nextLine(); 

        Set<Box> uniqueBoxes = new HashSet<>();

        for (int i = 1; i <= numberOfBoxes; i++) {
            System.out.println("Enter the Box " + i + " details");
            System.out.print("Enter Length");
            double length = scanner.nextDouble();
            System.out.print("Enter Width");
            double width = scanner.nextDouble();
            System.out.print("Enter Height");
            double height = scanner.nextDouble();
            scanner.nextLine(); 

            Box box = new Box(length, width, height);
            
            if (uniqueBoxes.add(box)) {
            }
        }

        System.out.println("Unique Boxes in the Set are");
        for (Box box : uniqueBoxes) {
            System.out.println(box);
        }

        scanner.close();
    }
}
