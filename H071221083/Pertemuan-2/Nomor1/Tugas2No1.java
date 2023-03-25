public class Tugas2No1 {
    public static void main(String[] args) {
        GenshinChar xiao = new GenshinChar("Xiao", "Anemo", "PoleArm", "Liyue", 59, 5);
        xiao.Character();
        xiao.levelUp();
        System.out.println("===========================");
        GenshinChar bennett = new GenshinChar("Bennett", "Pyro", "Sword", "Mondstadt", 38, 4);
        bennett.Character();
        bennett.levelUp();
    }
}
 