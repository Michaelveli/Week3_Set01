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



            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Choose your fortune number (0 for random) : ");
                int fortuneNumber = in.nextInt();
                if (fortuneNumber == 0) {
                    fortuneNumber = rand.nextInt(max - min) + 1;
                }


                System.out.print("Debug Y/N ?: ");
                String debug = in.next();
                if (debug.equals("Y") || debug.equals("y")) {
                    System.out.println("_ _ _ _ _");
                    System.out.println("There are " + (count - 1) + " fortunes.");
                    System.out.println("This is fortune # " + fortuneNumber);

                }

                cowSay(fortuneList.get(fortuneNumber - 1));
            }

            catch (Exception e) {
                System.out.println("That fortune does not exist");
                e.printStackTrace();
            }
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


    }






