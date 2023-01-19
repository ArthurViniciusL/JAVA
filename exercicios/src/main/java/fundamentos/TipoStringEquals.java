package fundamentos;

public class  TipoStringEquals {
    public static void main(String[] args) {

        String valor = new String("2");

        System.out.println("2" == "2"); // >>> true
        System.out.println("2" == valor); // >>> false
        System.out.println("2".equals(valor));// >>> true
    }
}
