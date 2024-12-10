package com.example;
 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira algo para registar:");
        String userInput = scanner.nextLine();

        logger.error("Input recebido: " + userInput);

        System.out.println("Mensagem recebida.");
        scanner.close();
    }
}