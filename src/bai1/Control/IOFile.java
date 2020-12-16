package bai1.Control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author BlackCrystal
 */
import java.io.*;
import java.util.*;

public class IOFile {

    File file;

    public IOFile(File f) {
        file = f;
    }

    public void writeToFile(String s1, String s2, String s3, String s4) {
        try ( FileWriter fw = new FileWriter(file, true)) {
            fw.write(s1 + '\n');
            fw.write(s2 + '\n');
            fw.write(s3 + '\n');
            fw.write(s4 + '\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String[]> readFromFile() {
        ArrayList<String[]> tmp = new ArrayList<>();
        try ( Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                String[] s = new String[4];
                s[0] = sc.nextLine();
                s[1] = sc.nextLine();
                s[2] = sc.nextLine();
                s[3] = sc.nextLine();
                tmp.add(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tmp;
    }

    public int getMa() {
        int ma = 0;
        try ( Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                ma = Integer.parseInt(sc.nextLine());
                sc.nextLine();
                sc.nextLine();
                sc.nextLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ma;
    }
}
