public class Principal {
    public static void main(String[] args) {
        Empresa empresa = Empresa.getInstance();

        Projeto projeto1 = new Projeto(
                "Construção de Condomínio",
                "Projeto de construção de um condomínio residencial",
                5000000.00,
                "01/01/2024",
                "31/12/2024"
        );

        Projeto projeto2 = new Projeto(
                "Reforma de Shopping",
                "Projeto de reforma de um shopping center",
                2000000.00,
                "01/02/2024",
                "30/09/2024"
        );

        System.out.println(empresa.getInfo());
        System.out.println(projeto1.getInfo());
        System.out.println(projeto2.getInfo());
    }
}