package candidatura;

import java.util.Scanner;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Processo Seletivo!");
        analisarCandidato(2200);
        analisarCandidato(2190.05);
        analisarCandidato(2000);
        analisarCandidato(1700);


    }
    
    static void analisarCandidato(double lance){
        double salarioBase = 2000.00;

        if (salarioBase > lance) {
            System.out.println("ligar para o candidato!");
            
        }else if(salarioBase == lance){
            System.out.println("Ligar para o candidato com contra proposta!");

        }else{
            System.out.println("Aguardar demais candidatos!");
        }

    }
}
