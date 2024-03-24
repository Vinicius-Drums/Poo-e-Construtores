// Definição da classe Funcionario
public class Funcionario {
    // Atributos
    private String nome; // Atributo para armazenar o nome do funcionário
    private float salario; // Atributo para armazenar o salário do funcionário
    
    // Construtor que recebe apenas o nome do funcionário
    public Funcionario(String nome) {
        this.nome = nome; // Inicializa o atributo nome com o valor passado como argumento
    }
    
    // Construtor que recebe nome e salário do funcionário
    public Funcionario(String nome, float salario) {
        this.nome = nome; // Inicializa o atributo nome com o valor passado como argumento
        this.salario = salario; // Inicializa o atributo salario com o valor passado como argumento
    }
    
    // Método para aumentar o salário do funcionário
    public void aumentar(float aumento) {
        salario += aumento; // Incrementa o salário do funcionário pelo valor passado como parâmetro
    }
    
    // Getters e setters para nome e salário (opcional)
    public String getNome() {
        return nome; // Retorna o nome do funcionário
    }

    public void setNome(String nome) {
        this.nome = nome; // Define um novo nome para o funcionário
    }

    public float getSalario() {
        return salario; // Retorna o salário do funcionário
    }

    public void setSalario(float salario) {
        this.salario = salario; // Define um novo salário para o funcionário
    }
}
