package semana07;

public class UsaAnimal {

    public static void main(String[] args) {
        
        // System.out.println("===== Animal =====");
        // Animal animal = new Animal();

        // animal.setId(1);
        // animal.setNome("Chiquinho");
        // animal.setIdade(100);

        // System.out.println(animal.getId());
        // System.out.println(animal.getNome());
        // System.out.println(animal.getIdade());

        // System.out.println("\n===== Animal com Construtor =====");
        // Animal animal2 = new Animal(2, 20, "Jeca");
        // // O construtor pode representar uma falha de segurança 
        // // relacionada ao encapsulamento (a idade por exemplo não é validada)

        // System.out.println(animal2.getId());
        // System.out.println(animal2.getNome());
        // System.out.println(animal2.getIdade());

        System.out.println("===== Gato =====");
        Gato gato = new Gato();

        // gato.setId(3);
        gato.id = 3;
        gato.setNome("Zeca");
        gato.setIdade(15);
        gato.setRaca("Angorá");

        // System.out.println(gato.getId());
        System.out.println(gato.id);
        System.out.println(gato.getNome());
        System.out.println(gato.getIdade());
        System.out.println(gato.getRaca());

    }

}
