import java.util.*;
//import java.util.Scanner;               //Import this utility to get user inputs
//import javax.swing.JOptionPane;         //Import this for GUI
//import java.util.Random;                //Import for randon values(Not acually random though)
//import java.util.ArrayList;             //Import for ArrayList

public class Main {

    public static void main(String[] args){

        String nl = System.lineSeparator();     //New line separator
        System.out.print(nl);
        
        //Displaying
        /*System.out.println("I love Nico Robin.");
        System.out.println("I love her!\n");

        //variables
        int r=7;
        float x=1.57f;
        double y=1.34;
        boolean t=true;
        char sign = 'R';
        String name="Robin";

        System.out.println("She is number "+r);
        System.out.println("Float = "+x);
        System.out.println("Double = "+y);
        System.out.println("Boolean"+t);
        System.out.println(sign);
        System.out.println(name+"\n");

        //Swapping
        String h1="hell";
        String h2="heaven";
        String temp=null;

        temp=h1;
        h1=h2;
        h2=temp;

        System.out.println("H1: "+h1);
        System.out.println("H2: "+h2+"\n");*/

        //Getting inputs(Scanner)
        Scanner input = new Scanner(System.in);    //Creating new input

        /*System.out.print("What is the name of your 'Love'? ");
        String hername = input.nextLine();

        System.out.print("\nHer age? ");
        int herage = input.nextInt();
        input.nextLine();   //Clear the currunt Scanner

        System.out.print("\nFavorite color? ");
        String color = input.nextLine();

        System.out.println("\nHer name is "+hername+".");
        System.out.println("Her age is "+herage+" years old.");
        System.out.println("Her favorite color is "+color+".");*/

        //Expressions
        /*int number=0;
        int r=0;

        System.out.print("Enter a number: ");
        number=input.nextInt();

        int disnumber=number++;
        r=number%2;

        System.out.println("After adding 1 to number "+number+" is "+disnumber);
        System.out.println("Remainder after dividing by 2 is "+r);*/

        //GUI
        /*String myName=JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null,"Hi "+myName);

        int myAge=Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        JOptionPane.showMessageDialog(null,"You are "+myAge+" years old");

        double myHeight=Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
        JOptionPane.showMessageDialog(null,"You are "+myHeight+"cm tall");*/

        //Math
        /*System.out.print("Enter first number: ");
        double n1=input.nextDouble();

        System.out.print("Enter second number: ");
        double n2=input.nextDouble();

        System.out.println("\nHighest value of "+n1+" and "+n2+" is "+Math.max(n1, n2));
        System.out.println("\nLowest value of "+n1+" and "+n2+" is "+Math.min(n1, n2)+"\n");*/

        //Random values
        /*Random random = new Random();

        int x= random.nextInt(6)+1;

        System.out.println("Your random dice number is "+x);*/

        //if
        /*int x= random.nextInt(6)+1;
        boolean y=random.nextBoolean();

        System.out.println("Your random dice number is "+x);
        if(y==true && x==6){
            JOptionPane.showMessageDialog(null,"You won 10/10");
            //System.out.println("You won 10/10");
        }
        else if(y==true || x==6){
            JOptionPane.showMessageDialog(null,"You won 5/10");
            //System.out.println("You won 5/10");
        }
        else{
            JOptionPane.showMessageDialog(null,"You lost");
            //System.out.println("You lost");
        }*/

        //switch case
        /*char type;
        double n1=0;
        double n2=0;

        System.out.println("\t\tAddition = +");
        System.out.println("\t\tSubstraction = -");
        System.out.println("\t\tMultiplication = *");
        System.out.println("\t\tDivision = /\n");

        System.out.print("Enter calculation type: ");
        type = input.next().charAt(0);
        
        System.out.print("\nEnter first number: ");
        n1 = input.nextDouble();
        System.out.print("\nEnter second number: ");
        n2 = input.nextDouble();

        switch (type) {
            case '+':
                System.out.println(nl+n1+"+"+n2+"="+(n1+n2)+nl);
                break;
        
            case '-':
                System.out.println(nl+n1+"-"+n2+"="+(n1-n2)+nl);
                break;

            case '*':
                System.out.println(nl+n1+"*"+n2+"="+(n1*n2)+nl);
                break;

            case '/':
                System.out.println(nl+n1+"/"+n2+"="+(n1/n2)+nl);
                break;

            default:
                System.out.println("\nInvalid type!"+nl);
                break;
        }*/

        //String comparison
        /*System.out.print("What's her name? ");
        String passName = input.nextLine();

        if(passName.equalsIgnoreCase("Nico Robin")) {
            System.out.println("\n\t\tYou are correct! :D\n");
        }
        else {
            System.out.println("\n\t\tYou are wrong! :|\n");
        }*/

        //while loop
        /*System.out.print("Enter a Number: ");
        int x = input.nextInt();
        while(x>0) {
            System.out.println("Love you!");
            x--;
        }*/

        //for loop  (Above program using for)
        /*System.out.print("Enter a Number: ");
        int x = input.nextInt();
        for(int i=0;i<x;i++) {
            System.out.println("Love you!");
        }*/

        //Nested loop
        /*int rows=0;
        int columns=0;
        char symbol;

        System.out.println("\t\t\tSQUARE CREATION"+nl);
        System.out.print("Enter number of rows: ");
        rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        columns = input.nextInt();
        System.out.print("Enter the symbol you want: ");
        symbol = input.next().charAt(0);

        for(int i=1;i<=rows;i++) {
            System.out.println();
            for(int j=1;j<=columns;j++) {
                if(i==1 || i==rows) {
                    System.out.print(symbol);
                }
                else {
                    if(j==1 || j==columns) {
                        System.out.print(symbol);
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
        }*/

        //Arrays
        /*String[] animes=new String[3];

        System.out.println("Enter top three animes. (Press 'Enter' after each.)");
        
        for(int i=0;i<animes.length;i++) {
            
            System.out.print("#"+(i+1)+" ");
            animes[i]=input.nextLine();
        }

        System.out.println("\nYour top 3 animes are,\n");
        for(int i=0;i<animes.length;i++) {
            System.out.println("#"+(i+1)+"\t"+animes[i]);
        }*/

        //2D arrays
        /*String[][] animes = new String[2][3];

        for(int i=0;i<animes.length;i++){
            if(i==0){
                System.out.println("Enter your top three anime serieses. (Press 'Enter' after each.)");
            }
            else{
                System.out.println("\nEnter your top three anime movies. (Press 'Enter' after each.)");
            }

            for(int j=0;j<animes[i].length;j++){
                System.out.print("#"+(j+1)+" ");
                animes[i][j]=input.nextLine();
            }   
        }

        for(int i=0;i<animes.length;i++){
            if(i==0){
                System.out.println("\nYour top 3 anime serieses are,\n");
            }
            else{
                System.out.println("\n\nYour top 3 anime movies are,\n");
            }
            for(int j=0;j<animes[i].length;j++){
                System.out.print("#"+(j+1)+" "+animes[i][j]+"\t");
            }   
        }*/

        //String methods
        /*System.out.print("Enter the valid name: ");
        String name = input.nextLine();

        while(name.isEmpty()){                                          //Check if the String is empty
            System.out.print("Name can't be empty. Please enter the valid name: ");
            name = input.nextLine();
        }
        
        name = name.trim();                                             //Remove spaces

        name = name.toUpperCase();                                      //Change String input to uppercass

        //if(name.equals("Thushan")){                                   //Case sensitive String comparison
        if(name.equalsIgnoreCase("Thushan")){                         //Noncase sensitive String comparison
            System.out.println("\n\t\tCorrect!");
        }
        else{
            System.out.println("\n\t\tWrong!");
        }

        int nameLength = name.length();                                 //Check the charactor length
        System.out.println("\nNumber of letters in the name = "+nameLength);

        char firstLetter = name.charAt(0);                        //Select any charactor of a String
        System.out.println("\nFirst letter of the name: "+firstLetter);

        int index = name.indexOf("T");                              //Checking the index of a charactor

        if(index<name.length() && index>=0){
            System.out.print("\nIndex of letter 'T': "+index);
        }
        else{
            System.out.print("\nLetter not found!");
        }*/

        //Wrapper classes
        //autoboxing
        /*Boolean b=true;
        Character c='R';
        Double d=26.62;
        Integer i=7;
        String s="Robin";       //Already a reference data type
        String number="1";*/

        //ArrayList
        // ArrayList<String> animes = new ArrayList<String>();

        // System.out.println("Enter list of animes. (Press 'Enter' after each and enter 0 at the end of your list.)");
        
        // int n=1;
        // System.out.print("#"+n+" ");
        // String anime = (input.nextLine());
        // while(!anime.equals("0")){
        //     if(!anime.trim().isEmpty()){
        //         animes.add(anime);
        //         n++;
        //     }
        //     else{
        //         System.out.println("\nPlease enter only valid data.");
        //     }
        //     System.out.print("#"+n+" ");
        //     anime = input.nextLine();
        // }

        // char k='Y';

        // do{
        //     System.out.println("\nEnter 1 to View the List");
        //     System.out.println("Enter 2 to Edit the List");
        //     int o = input.nextInt();
        //     while(o!=1 && o!=2){
        //         System.out.println("\nInvalid Input!");
        //         input.nextLine();
        //         System.out.println("\nEnter 1 to View the List");
        //         System.out.println("Enter 2 to Edit the List");
        //         o = input.nextInt();
        //     }

        //     if(o==1){
        //         System.out.println("\n\t\tYour anime list\n");
        //         for(int i=0;i<animes.size();i++) {
        //             System.out.println("#"+(i+1)+"\t"+animes.get(i));
        //         }
        //         System.out.print("\nDo you want to go back to the menu?Y/N ");
        //         k = Character.toUpperCase(input.next().charAt(0));
        //         while(k!='Y' && k!='N'){
        //             System.out.println("\nInvalid Input!");
        //             System.out.print("\nDo you want to go back to the menu?Y/N ");
        //             k = Character.toUpperCase(input.next().charAt(0));
        //         }
        //     }
        //     else{
        //         System.out.println();
        //         for(int i=0;i<animes.size();i++) {
        //             System.out.println("#"+(i+1)+"\t"+animes.get(i));
        //         }
        //         System.out.print("\nChoose the anime number that you want to edit: ");
        //         int j = input.nextInt();
        //         input.nextLine();
        //         System.out.print("\nEnter the new name: ");
        //         String editedAnime = (input.nextLine());
        //         editedAnime.trim();
        //         if(!editedAnime.isEmpty()){
        //             animes.set(j-1, editedAnime);
        //         }
        //         else{
        //             System.out.println("\nInvalid Input!");
        //         }
        //         System.out.print("\nDo you want to go back to the menu?Y/N ");
        //         k = Character.toUpperCase(input.next().charAt(0));
        //         while(k!='Y' && k!='N'){
        //             System.out.println("\nInvalid Input!");
        //             System.out.print("\nDo you want to go back to the menu?Y/N ");
        //             k = Character.toUpperCase(input.next().charAt(0));
        //         }
        //     }
        // }while(k=='Y');

        //animes.remove(1);
        //animes.clear();

        //2D ArrayList
        /*ArrayList<ArrayList<String>> animeList = new ArrayList<>();       //2D ArrayList

        ArrayList<String> animeSerieses = new ArrayList<>();
        ArrayList<String> animeMovies = new ArrayList<>();

        System.out.println("Enter list of animes serieses. (Press 'Enter' after each and enter 0 at the end of your list.)");
        
        int n=1;
        System.out.print("#"+n+" ");
        String animeSeries = (input.nextLine());
        while(!animeSeries.equals("0")){
            if(!animeSeries.trim().isEmpty()){
                animeSerieses.add(animeSeries);
                n++;
            }
            else{
                System.out.println("\nPlease enter only valid data.");
            }
            System.out.print("#"+n+" ");
            animeSeries = input.nextLine();
        }

        animeList.add(animeSerieses);       //Adding ArrayList to the 2D ArrayList

        System.out.println("\nEnter list of animes movies. (Press 'Enter' after each and enter 0 at the end of your list.)");
        
        n=1;
        System.out.print("#"+n+" ");
        String animeMovie = (input.nextLine());
        while(!animeMovie.equals("0")){
            if(!animeMovie.trim().isEmpty()){
                animeMovies.add(animeMovie);
                n++;
            }
            else{
                System.out.println("\nPlease enter only valid data.");
            }
            System.out.print("#"+n+" ");
            animeMovie = input.nextLine();
        }

        animeList.add(animeMovies);       //Adding ArrayList to the 2D ArrayList

        System.out.println("\n\t\tYour #1 Anime Series is "+(animeList.get(0).get(0)));
        System.out.println("\n\t\tYour #1 Anime Movie is "+(animeList.get(1).get(0)));*/

        //for-each loop
        /*ArrayList<String> animes = new ArrayList<String>();

        System.out.println("Enter list of animes. (Press 'Enter' after each and enter 0 at the end of your list.)");
        
        int n=1;
        System.out.print("#"+n+" ");
        String anime = (input.nextLine());
        while(!anime.equals("0")){
            if(!anime.trim().isEmpty()){
                animes.add(anime);
                n++;
            }
            else{
                System.out.println("\nPlease enter only valid data.");
            }
            System.out.print("#"+n+" ");
            anime = input.nextLine();
        }

        System.out.println("\n\t\tYour top anime list\n");
        int i=0;
        for (String disAnime : animes) {
            System.out.println("#"+(i+1)+"\t"+disAnime);
            i++;
        }*/

        //Methods
        /*String name = getInput();
        int age = 20;

        displayInput(name);
        displayInput(name,age);     //Overloaded method calling*/

        //prinf
        /*boolean myBoolean=true;
        char myChar='#';
        int myInt=2662;
        double myDouble=2.6;
        String myString="Robin";

        //Conversion characters
        System.out.println("Conversion characters\n");
        System.out.printf("%b"+nl, myBoolean);             
        System.out.printf("%c"+nl, myChar);
        System.out.printf("%d"+nl, myInt);
        System.out.printf("%f"+nl, myDouble);
        System.out.printf("%s"+nl, myString);

        //width
        System.out.println("\n\nWidth\n");
        System.out.printf("%10b"+nl, myBoolean);             
        System.out.printf("%10c"+nl, myChar);
        System.out.printf("%10d"+nl, myInt);
        System.out.printf("%10f"+nl, myDouble);
        System.out.printf("%10s"+nl, myString);

        //precision
        System.out.println("\n\nPrecision\n");
        System.out.printf("%.2f"+nl, myDouble);

        //flags
        System.out.println("\n\nFlags\n");
        System.err.printf("%,d"+nl, myInt);
        System.err.printf("%010d"+nl, myInt);
        System.err.printf("%+d"+nl, myInt);*/

        //final
        // final String MINE="Nico Robin";         //Cannot be updated         //Best practice:UPPERCASE Variable if it a final

        // System.out.println(MINE);

        // //MINE="";                              //Can't update





        // System.out.println(nl);
        input.close();
    }

    //Methods
    /*static String getInput() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = input.nextLine();

        input.close();

        return name;
    }

    //Overloaded method
    static void displayInput(String name){
        System.out.println("Hi "+name+"!");
    }

    static void displayInput(String name, int age){
        System.out.println("\nThis is an overloaded method.\n");
        System.out.println("Hi "+name+"!");
        System.out.println("Your age is "+age+" years old.");
    }*/

}
