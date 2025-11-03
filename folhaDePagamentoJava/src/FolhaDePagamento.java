public class FolhaDePagamento {
    public static void main(String[] args) throws Exception { 
        // OBJETOS 
        Remuneracao funcionarioUm = new Gerente ("PEDRO HENRIQUE ANTUNES DEBIA","020125018", 4500 , 480, 1500);

        Remuneracao funcionarioDois = new Supervisor("LEANDRO ZANGRANDE FERNANDES", "020125060", 3500, 600, 1000);

        Remuneracao funcionarioTres = new Operario("ERICK DAKE", "020125004", 1900, 650, 800);

        // IMPRIME OS RELATÓRIOS. 
        System.out.println(funcionarioUm.toString());
        System.out.println("\n--------------\n");
        System.out.println(funcionarioDois.toString());
        System.out.println("\n--------------\n");
        System.out.println(funcionarioTres.toString());
        
        
    }
}
