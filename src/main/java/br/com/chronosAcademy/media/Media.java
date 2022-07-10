package br.com.chronosAcademy.media;

public class Media {

    private double numero;
    public String calculaMedia(double valor1, double valor2){
        double media = (valor1 + valor2) / 2;
        if( media < 5){
            return "Reprovado";
        }
        return "Aprovado";
    }
}
