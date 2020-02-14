import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


    public class Set02 {

        public static void main (String [] args) throws IOException {
            String fortunes = "";
            Scanner fortuneScanner = new Scanner(new File("/home/michaelveli/IdeaProjects/Homework3/Set02/src/fortunes.txt")).useDelimiter("%");
            List<String> fortuneList = new ArrayList<String>();
            int count = 0;
            while (fortuneScanner.hasNext()) {
                fortunes = fortuneScanner.next();
                fortuneList.add(fortunes);
                count++;
            }

            fortuneScanner.close();
            int max = count;
            int min = 1;

            Random rand = new Random();

            int fortuneNumber = rand.nextInt(max - min)+1;

            if (args.length > 0) {
            try {
                fortuneNumber = Integer.parseInt(args[0]); //gets fortune number from args
            } catch (Exception e) {
            }
                try {
                    fortuneNumber = Integer.parseInt(args[1]); //gets fortune number from args
                } catch (Exception e) {
                }


                if (args[0].contains("debug")) {
                    System.out.println("_ _ _ _ _");
                    System.out.println("There are " + (count) + " fortunes.");
                    System.out.println("This is fortune # " + fortuneNumber);

                }

                else if (args[1].contains("debug")) {
                    System.out.println("_ _ _ _ _");
                    System.out.println("There are " + (count) + " fortunes.");
                    System.out.println("This is fortune # " + fortuneNumber);
                }


        }
            else {
                  fortuneNumber = rand.nextInt(max - min)+1;
            }

                cowSay(fortuneList.get(fortuneNumber - 1));
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






