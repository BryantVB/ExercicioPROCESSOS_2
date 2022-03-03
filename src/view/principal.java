package view;
import javax.swing.JOptionPane;

import controller.killcontroller;;

public class principal {
    public static void main(String[] args) {
        killcontroller killer = new killcontroller();
        killer.listaProcessos();
        String option = JOptionPane.showInputDialog(null, "Digite o nome ou PID do processo a ser finalizado:");
        if (option != null) {
            try {
                int pid = Integer.parseInt(option);
                System.out.println("Finalizando processo por PID.");
                killer.mataPid(pid);
            }catch(NumberFormatException e) {
                System.out.println("Finalizando processo por nome.");
                killer.mataNome(option);
            }
        }
        System.out.println("Finalizando.");
    }
}
