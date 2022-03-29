package Week4.Day16_FileIO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileInputStreamRunner {

    public static void main(String[] args) throws Exception {
        String inPath = "C:\\Users\\PC-2G4\\IdeaProjects\\Training\\src\\Week4\\Day16_FileIO\\files\\input.txt";
        String outPath = "C:\\Users\\PC-2G4\\IdeaProjects\\Training\\src\\Week4\\Day16_FileIO\\files\\output.txt";
        int a;

//        //Slower Way
//        FileInputStream inputStream = new FileInputStream(inPath);
//        FileOutputStream outputStream = new FileOutputStream(outPath);
//        while((a=inputStream.read()) != -1){
//            outputStream.write(a);
//        }

//        //Faster Way
//        FileReader fr = new FileReader(inPath);
//        FileWriter fw = new FileWriter(outPath);
//        while ((a = fr.read()) != -1){
//            fw.write(a);
//        }
//        fw.flush();     //fill up remaining spaces until it is  full such that it "sends" to output.txt

//        //Read String
//        String strPath = "C:\\Users\\PC-2G4\\IdeaProjects\\Training\\src\\Week4\\Day16_FileIO\\files\\str_input.txt";
//        FileReader fr = new FileReader(strPath);
//        BufferedReader br = new BufferedReader(fr);
//        FileWriter fw = new FileWriter(outPath);
//        BufferedWriter bw = new BufferedWriter(fw);
//
//        String b;
//
//        while ((b = br.readLine()) != null){
//            bw.write(b + "\n");
//        }
//        bw.flush();

        File file = new File("src/Week4/Day16_FileIO/files/str_input.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
