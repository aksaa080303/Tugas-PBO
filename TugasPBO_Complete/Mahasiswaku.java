public class Mahasiswaku {
    public static void main(String[] args) {
        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();
        m.setNim("1102020");
        m.setNama("Ferdi");
        m.setClass(21);

        System.out.println(m.getNim());
        System.out.println(m.getNama());
        System.out.println(m.getClassInfo());
    }
}