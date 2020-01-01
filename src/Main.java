import java.io.*;
import java.util.Scanner;
interface  A{String getS();}
public class Main {

    public static void main(String[] args) {
        System.out.println(new A(){ public String getS(){ return "抽象？匿名？";}}.getS());

    }
}