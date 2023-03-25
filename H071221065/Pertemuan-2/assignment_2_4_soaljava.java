class assignment_2_4_soaljava {
    double height;
    double width;
    double length;

    double getVolume() {
        return height * width * length;
    }

    public static void main(String[] args) {
        assignment_2_4_soaljava cuboid = new assignment_2_4_soaljava();
        cuboid.height = 15.0; //or 5.0, 10.0
        cuboid.width = 20.0; //or 25.0, 15.0
        cuboid.length = 15.0; //or 36.0, 30.0
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }  
}
