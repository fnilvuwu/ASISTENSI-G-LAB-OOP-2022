public class Cuboid {

    double height;
    double width;
    double length;

    double getVolume() {
        return height * width * length;
    }

    
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 10;
        cuboid.width = 15;
        cuboid.length = 30;

        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
// Program tersebut merupakan sebuah class Java yang disebut "Cuboid" (kubus
// persegi panjang), yang berisi tiga variabel bertipe data double yaitu
// "height" (tinggi), "width" (lebar), dan "length" (panjang) yang
// merepresentasikan dimensi dari kubus persegi panjang.

// Class tersebut juga memiliki sebuah method yaitu "getVolume()" yang
// mengembalikan nilai volume kubus persegi panjang yang dihitung dengan rumus:
// volume = panjang x lebar x tinggi.

// Pada method "main", sebuah objek "cuboid" dari class "Cuboid" dibuat dan
// nilai-nilai dari variabel "height", "width", dan "length" diatur secara
// eksplisit dengan nilai 10, 15, dan 30. Kemudian, method "getVolume()"
// dipanggil dan nilai yang dikembalikan dari method tersebut di-print dengan
// menggunakan System.out.printf dengan format "Volume = %.2f", di mana "%.2f"
// menandakan bahwa nilai yang di-print harus di-format dengan dua angka di
// belakang koma.

// Dengan menjalankan program ini, output yang dihasilkan akan menampilkan nilai
// volume dari kubus persegi panjang yang dihitung dari nilai-nilai yang telah
// ditentukan sebelumnya yaitu 4500.00.
