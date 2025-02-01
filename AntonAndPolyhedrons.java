import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        int count = 0;

        while (t-- > 0) {
            String poly = sc.nextLine();

            switch(poly) {
                case "Tetrahedron": count+=4;
                    break;
                case "Cube": count+=6;
                    break;
                case "Octahedron": count+=8;
                    break;  
                case "Dodecahedron": count+=12;
                    break;
                case "Icosahedron": count += 20;
                    break;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
