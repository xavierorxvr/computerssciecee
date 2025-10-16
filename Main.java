import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("names.txt");
        FileReader fr = new FileReader("names.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("What name do you want to add to your list?");
            String newName = input.nextLine();
            bw.newLine();
            bw.write(newName);
            
            System.out.println("Do you want to keep going? (Yes / No)");
            String loop = input.nextLine();
            if (loop.equalsIgnoreCase("No")) {
                break;
            };
        };

        br.close();
        bw.close();

        fw.close();
        fr.close();
        
        input.close();      
    };
};