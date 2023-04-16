    class Cuboid {
        double height;
        double width;
        double length;

        double getVolume() {
            System.out.println();
            return this.height * this.width * this.length;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Cuboid cuboid = new Cuboid();
            cuboid.height = 4500;
            cuboid.width = 1;
            cuboid.length = 1;

            System.out.printf("Volume = %.2f", cuboid.getVolume());
        }
    }

