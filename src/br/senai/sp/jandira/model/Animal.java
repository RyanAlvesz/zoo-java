package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.*;

public class Animal {

    Scanner scanner = new Scanner(System.in);

    String nome, dieta, especie, sexo;

    int idade, habitat;

    double peso;

    private LocalDateTime date;

    List <Animal> listaAnimais = new ArrayList<>();

    public void cadastrarAnimal(){

        System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
        System.out.println("         Cadastrar Animal");
        System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
        System.out.print("Informe o nome do animal: ");
        this.nome = scanner.nextLine();
        System.out.print("Informe o sexo do animal: ");
        this.sexo = scanner.nextLine();
        System.out.print("Informe a dieta do animal: ");
        this.dieta = scanner.nextLine();
        System.out.print("Informe a idade do animal: ");
        this.idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Informe o peso do animal: ");
        this.peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
        System.out.println("");

        this.setDate(LocalDateTime.now());
        System.out.println(getDate());

    }

    public void adicionarAnimal(Animal animal){
        listaAnimais.add(animal);
    }

    public boolean verificaListaAnimais(){
        if (listaAnimais.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }

//    public boolean verificaSaude(){
//
//        for (Animal animal: listaAnimais) {
//
//            LocalDateTime time = LocalDateTime.of(2023, 10, 11, 16, 25);
//
//            LocalDate teste = LocalDate.now();
//
//            Period periodo = Period.between(teste, teste);
//
//            if () {
//
//
//
//            }
//
//        }
//
//    }

    public void exibirAnimais(){

        if(!listaAnimais.isEmpty()){
            for (Animal animal: listaAnimais) {
                System.out.println("");

                System.out.println("Nome do animal: " + animal.nome);
                System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
                System.out.println("Sexo do animal: " + animal.sexo);
                System.out.println("Idade do animal: " + animal.idade);
                System.out.println("Espécie do animal: " + animal.especie);
                System.out.println("Peso do animal: " + animal.peso);
                System.out.println("Dieta do animal: " + animal.dieta);

                System.out.println("");
            }
        }else{
            System.out.println("");
            System.out.println("ERRO: Você não cadastrou nenhum animal ainda");
            System.out.println("");
        }

    }

    public void exibirMamiferos(){

        for (Animal animal: listaAnimais) {

            if (animal.habitat == 1){

                System.out.println("");

                System.out.println("Nome do animal: " + animal.nome);
                System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
                System.out.println("Sexo do animal: " + animal.sexo);
                System.out.println("Idade do animal: " + animal.idade);
                System.out.println("Espécie do animal: " + animal.especie);
                System.out.println("Peso do animal: " + animal.peso);
                System.out.println("Dieta do animal: " + animal.dieta);

                System.out.println("");

            }

        }

    }

    public void exibirAves(){

        for (Animal animal: listaAnimais) {

            if (animal.habitat == 2){

                System.out.println("");

                System.out.println("Nome do animal: " + animal.nome);
                System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
                System.out.println("Sexo do animal: " + animal.sexo);
                System.out.println("Idade do animal: " + animal.idade);
                System.out.println("Espécie do animal: " + animal.especie);
                System.out.println("Peso do animal: " + animal.peso);
                System.out.println("Dieta do animal: " + animal.dieta);

                System.out.println("");

            }

        }

    }

    public void exibirRepteis(){

        for (Animal animal: listaAnimais) {

            if (animal.habitat == 3){

                System.out.println("");

                System.out.println("Nome do animal: " + animal.nome);
                System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
                System.out.println("Sexo do animal: " + animal.sexo);
                System.out.println("Idade do animal: " + animal.idade);
                System.out.println("Espécie do animal: " + animal.especie);
                System.out.println("Peso do animal: " + animal.peso);
                System.out.println("Dieta do animal: " + animal.dieta);

                System.out.println("");

            }

        }

    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
