import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


    public class Set02 {

        public static void main (String [] args) throws IOException{
            String fortunes = "";
            Scanner fortuneScanner= new Scanner(new File("/home/michaelveli/IdeaProjects/Homework3/Set02/src/fortunes.txt")).useDelimiter("%");
            List<String> fortuneList = new ArrayList<String>();
            int count = 0;
            while (fortuneScanner.hasNext()) {
                fortunes = fortuneScanner.next();
                fortuneList.add(fortunes);
                count++;
            }
            fortuneScanner.close();
          //  System.out.println("There are " + (count - 1) +" fortunes.");
            int max = count;
            int min = 1;

            Random rand = new Random();


            Scanner in = new Scanner(System.in);
            System.out.print("Choose your fortune number (0 for random) : ");
            int fortuneNumber = in.nextInt();
            if (fortuneNumber == 0){
                fortuneNumber = rand.nextInt(max - min) + 1 ;
            }
            System.out.print("Debug Y/N ?: ");
           String debug = in.next();
            if (debug.equals("Y") || debug.equals("y")){
                System.out.println("_ _ _ _ _");
                System.out.println("There are " + (count - 1) +" fortunes.");
                System.out.println("This is fortune # " + fortuneNumber);


            }

            cowSay(fortuneList.get(fortuneNumber-1));

        }




        public static void readFile(){
            try {

                File fortune = new File("/home/michaelveli/IdeaProjects/Homework3/Set02/src/fortunes.txt");
                Scanner fortuneScanner = new Scanner(fortune);
                // fortuneScanner.useDelimiter("%");

                List<String> lines = new ArrayList<String>();
                while (fortuneScanner.hasNextLine()) {
                    lines.add(fortuneScanner.nextLine());
                    System.out.println(lines);


                }



            }

            catch (FileNotFoundException e) {
                System.out.println("File not found!");
                e.printStackTrace();

            }


        }

        public static void cowSay(String message){
            System.out.println ("-----");
            System.out.println (message);
            System.out.println ("------");
            System.out.println  ("\\   ^__^");
            System.out.println (" \\  (oo)\\_________");
            System.out.println     ("    (__)\\         )\\ /\\");
            System.out.println     ("        ||------||");
            System.out.println     ("        ||      ||");

        }


    } //class end



/*Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String message = in.nextLine();
        in.close();

        System.out.println ("-----");
        System.out.println (message);
        System.out.println ("------");
        System.out.println  ("\\   ^__^");
        System.out.println (" \\  (oo)\\________");
        System.out.println     ("    (__)\\         )\\ /\\");
        System.out.println     ("        ||------w|");
        System.out.println     ("        ||      ||");


 String strArray[] = str.split(" ");


        //print elements of String array
        for(int i=0; i < strArray.length; i++){
            System.out.println(strArray[i]);
        }

        String str = "Java String to String Array Example";




try {

            File fortune = new File("/home/michaelveli/IdeaProjects/Homework3/Set02/src/fortunes.txt");
            Scanner fortuneScanner = new Scanner(fortune);
            fortuneScanner.useDelimiter("%");


            int lineNumber = 1;
            while(fortuneScanner.hasNextLine()){
                String line = fortuneScanner.next();
                System.out.println(line);
                lineNumber++;
            }




 */





