// Classe principal do programa
public class App {
    // Método principal
    public static void main(String[] args) {
        // Criando um objeto Funcionario com o nome "Dave Grohl" e salário inicial de 2500.0
        Funcionario daveGrohl = new Funcionario("Dave Grohl", 2500.0f);
        
        // Criando outro objeto Funcionario com o nome "Taylor Hawkins" e salário inicial de 3500.0
        Funcionario taylorHawkins = new Funcionario("Taylor Hawkins", 3500.0f);
        
        // Imprimindo informações do funcionário Dave Grohl
        System.out.println("Nome do funcionário Dave Grohl: " + daveGrohl.getNome());
        System.out.println("Salário do funcionário Dave Grohl: " + daveGrohl.getSalario());
        System.out.println();
        
        // Imprimindo informações do funcionário Taylor Hawkins
        System.out.println("Nome do funcionário Taylor Hawkins: " + taylorHawkins.getNome());
        System.out.println("Salário do funcionário Taylor Hawkins: " + taylorHawkins.getSalario());
        
        // Aumentando o salário do funcionário Taylor Hawkins em 500.0
        taylorHawkins.aumentar(500.0f);
        System.out.println();
        
        // Imprimindo o novo salário do funcionário Taylor Hawkins
        System.out.println("Novo salário do funcionário Taylor Hawkins: " + taylorHawkins.getSalario());
    }
}
