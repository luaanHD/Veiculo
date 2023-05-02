public class Principal {
    public static void main(String[] args) {
        Bike bike = new Bike("BMX", "Magrela", "Rosa-Choque", 2023);
        Mobilete mobilete = new Mobilete("Caloi", "Mobilete", "Laranja com listras roxas", 1958);
        Patinete patinete = new Patinete("Hot Wheels", "Patinete", "Preto com Amarelo", 1703);

        System.out.println(bike.getMarca());
        System.out.println(bike.getModelo());
        System.out.println(bike.getCor());
        System.out.println(bike.getAno());

        System.out.println(mobilete.getMarca());
        System.out.println(mobilete.getModelo());
        System.out.println(mobilete.getCor());
        System.out.println(mobilete.getAno());

        System.out.println(patinete.getMarca());
        System.out.println(patinete.getModelo());
        System.out.println(patinete.getCor());
        System.out.println(patinete.getAno());
    }
}
