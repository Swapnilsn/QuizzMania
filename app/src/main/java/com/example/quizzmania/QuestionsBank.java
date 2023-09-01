package com.example.quizzmania;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private  static List<QuestionsList> javaQuestions(){

        final List<QuestionsList> questionsLists=new ArrayList<>();

        final QuestionsList questions1=new QuestionsList("What is size of integer in Java","4","2","8","16","4","");
        final QuestionsList questions2=new QuestionsList(" What does the flush() method of a stream do?"," It erases all the data in the file.","It initializes the output methods."," It summons the garbage collector.","It ensures that all pending output operations are completed.","It ensures that all pending output operations are completed.","");
        final QuestionsList questions3=new QuestionsList(" Multiline comment is created using ___","//","/* */","<!--  -- >","All of these","/* */","");
        final QuestionsList questions4=new QuestionsList(" What is the entry point of a program in Java?","The main() method","First line of code","last line of code","main class","The main() method","");
        final QuestionsList questions5=new QuestionsList(" Which keyword in java is used for exception handling?","exep","throw","swap","null","throw","");

        final QuestionsList questions6=new QuestionsList("Number of primitive data types in Java are?","6","7","8","9","8","");
        final QuestionsList questions7=new QuestionsList("Find the output of the following program.\n" +
                "\n" +
                "public class Solution{\n" +
                "       public static void main(String[] args){\n" +
                "                     short x = 10;\n" +
                "                     x =  x * 5;\n" +
                "                     System.out.print(x);\n" +
                "       }\n" ,"50","11","Compiler Error","Exception","Compiler Error","");
        final QuestionsList questions8=new QuestionsList("Truncation in Java is?","Integer Value assigned to Floating type","Floating point value assigned to an integer type","Floating point value assigned to a Floating type","None OF These","Floating point value assigned to a Floating type","");
        final QuestionsList questions9=new QuestionsList("In java a thread can be created by....","Extending the thread class"," Implementing Runnable interface.","Both of the above","None Of These","Both of the above","");
        final QuestionsList questions10=new QuestionsList("Which of these packages contains the exception Stack Overflow in Java?","java.io","java.system"," java.lang","java.util"," java.lang","");

        questionsLists.add(questions1);
        questionsLists.add(questions2);
        questionsLists.add(questions3);
        questionsLists.add(questions4);
        questionsLists.add(questions5);
        questionsLists.add(questions6);
        questionsLists.add(questions7);
        questionsLists.add(questions8);
        questionsLists.add(questions9);
        questionsLists.add(questions10);

        return questionsLists;
    }


    private  static List<QuestionsList> phpQuestions(){

        final List<QuestionsList> questionsLists=new ArrayList<>();

        final QuestionsList questions1=new QuestionsList("Who is the father of PHP?","Drek Kolkevi","Rasmus Lerdorf","Willam Makepiece","List Barely","Rasmus Lerdorf","");
        final QuestionsList questions2=new QuestionsList("Which is the right way of declaring a variable in PHP?"," $3hello","$_hello"," $this","$5_Hello","$_hello","");
        final QuestionsList questions3=new QuestionsList("What will be the output of the following PHP program?\n" +
                "\n" +
                "<?php\n" +
                "$fruits = array (\"apple\", \"orange\", array (\"pear\", \"mango\"),\"banana\");\n" +
                "echo (count($fruits, 1));\n" +
                "?>","3","5","6","4","6","");
    /*    final QuestionsList questions4=new QuestionsList(" What will be the output of the following PHP program?\n" +
                "\n" +
                "<?php\n" +
                "    function multi($num)\n" +
                "    {\n" +
                "        if ($num == 3)\n" +
                "            echo \"I Wonder\";\n" +
                "        if ($num == 7)\n" +
                "            echo \"Which One\";\n" +
                "        if ($num == 8)\n" +
                "            echo \"Is The\";\n" +
                "        if ($num == 19)\n" +
                "            echo \"Correct Answer\";\n" +
                "    }\n" +
                "    $can = stripos(\"I love php, I love php too!\",\"PHP\");\n" +
                "    multi($can);\n" +
                "?>","Which One","Correct Answer","Is The","I Wonder","Which One","");
       */ final QuestionsList questions5=new QuestionsList("PHP recognizes constructors by the name _________","_construct()","classname()","function _construct()"," function __construct()"," function __construct()","");

        final QuestionsList questions6=new QuestionsList("Which of the following variables does PHP use to authenticate a user?\n" +
                "\n" +
                "i) $_SERVER['PHP_AUTH_USER'].\n" +
                "ii) $_SERVER['PHP_AUTH_USERS'].\n" +
                "iii) $_SERVER['PHP_AUTH_PU'].\n" +
                "iv) $_SERVER['PHP_AUTH_PW'].","ii) and iv)","i) and iv)"," i) and ii)","ii) and iii)","i) and iv)","");
        final QuestionsList questions7=new QuestionsList("Which PHP statement will give output as $x on the screen?","echo “/$x”;","echo “$x;”;","echo “\\$x”;","echo “$$x”;","echo “\\$x”;","");
        final QuestionsList questions8=new QuestionsList(" Which variable is used to collect form data sent with both the GET and POST methods?","$_REQUEST","$BOTH","$REQUEST","$_BOTH","$_REQUEST","");
        final QuestionsList questions9=new QuestionsList("A function in PHP which starts with __ (double underscore) is known as __________","Default Function","User Defined Function","Magic Function","Inbuilt Function","Magic Function","");
        final QuestionsList questions10=new QuestionsList("Which of the following is the correct syntax to write a PHP code?","<?php ?>","< php >","<? ?>"," < ? php ?>","<? ?>","");

        questionsLists.add(questions1);
        questionsLists.add(questions2);
        questionsLists.add(questions3);
       // questionsLists.add(questions4);
        questionsLists.add(questions5);
        questionsLists.add(questions6);
        questionsLists.add(questions7);
        questionsLists.add(questions8);
        questionsLists.add(questions9);
        questionsLists.add(questions10);

        return questionsLists;
    }



    private  static List<QuestionsList> htmlQuestions(){

        final List<QuestionsList> questionsLists=new ArrayList<>();

        final QuestionsList questions1=new QuestionsList("Who is the father of HTML?","Rasmus Lerdorf"," Tim Berners-Lee","Sergey Brin"," Brendan Eich"," Tim Berners-Lee","");
        final QuestionsList questions2=new QuestionsList("Which of the following tag is used for inserting the largest heading in HTML?","<h6>"," head","<h1>","heading","<h1>","");
        final QuestionsList questions3=new QuestionsList(" In which part of the HTML metadata is contained?"," html tag","title tag","body tag","head tag","head tag","");
        final QuestionsList questions4=new QuestionsList("Which element is used to get highlighted text in HTML5?"," <mark>"," <u>","<highlight>","<b>"," <mark>","");
        final QuestionsList questions5=new QuestionsList("How do we write comments in HTML?","<…….!>","</……/>"," <!……>","</…….>"," <!……>","");

        final QuestionsList questions6=new QuestionsList("Which element is used for or styling HTML5 layout?"," JavaScript","jQuery","PHP"," CSS"," CSS","");
        final QuestionsList questions7=new QuestionsList("Which character is used to represent when a tag is closed in HTML?"," \\"," /","#","!"," /","");
        final QuestionsList questions8=new QuestionsList("In HTML, which attribute is used to create a link that opens in a new window tab?","target=”_self”","target=”_blank”","src=”_blank”"," alt=”_blank”","target=”_blank”","");
        final QuestionsList questions9=new QuestionsList("What is the work of <address> element in HTML5?","contains home address","contains IP address","contains url","contains contact details for author","contains contact details for author","");
        final QuestionsList questions10=new QuestionsList(" Which tag is used to create a dropdown in HTML Form?","<select>","<textarea>","<text>","<input>","<select>","");

        questionsLists.add(questions1);
        questionsLists.add(questions2);
        questionsLists.add(questions3);
        questionsLists.add(questions4);
        questionsLists.add(questions5);
        questionsLists.add(questions6);
        questionsLists.add(questions7);
        questionsLists.add(questions8);
        questionsLists.add(questions9);
        questionsLists.add(questions10);
        return questionsLists;
    }


    private  static List<QuestionsList> androidQuestions(){

        final List<QuestionsList> questionsLists=new ArrayList<>();

        final QuestionsList questions1=new QuestionsList("The .apk extension stands for which of these?","Application Program Kit","Android Package"," Application Package","Android Proprietary Kit","Application Program Kit","");
        final QuestionsList questions2=new QuestionsList("Which of these does NOT refer to a state in a service’s lifecycle?","Paused","Destroyed","Running"," Starting","Paused","");
        final QuestionsList questions3=new QuestionsList("Android is shipped with which of these built-in databases?","MYSQL","Oracle","SQlite","Apache","SQlite","");
        final QuestionsList questions4=new QuestionsList("Which of these does NOT refer to a nickname of the Android version?","Muffin","Honeycomb","Gingerbread","Cupcake","Muffin","");
        final QuestionsList questions5=new QuestionsList("What was the first phone released that ran the Android OS?"," HTC Hero","T-Mobile G1","Motorola Droid","Google gPhone","T-Mobile G1","");

        final QuestionsList questions6=new QuestionsList("Which of these are not one of the three main components of the APK?","Webkit","Dalvik Executable","Native Libraries","Resources","Webkit","");
        final QuestionsList questions7=new QuestionsList("What is contained within the manifest xml file?","The source code.","The permissions the app requires","The list of strings used in the app","All other choices","The permissions the app requires","");
        final QuestionsList questions8=new QuestionsList("To create an emulator, you need an AVD. What does it stand for?","Android Virtual Display"," Android Virtual Device","Application Virtual Display","Active Virtual Device"," Android Virtual Device","");
        final QuestionsList questions9=new QuestionsList("The____file specifies the layout of your screen.","R file"," Layout file","Strings XML","Manifest file"," Layout file","");
        final QuestionsList questions10=new QuestionsList("The Emulator is identical to running a real phone EXCEPT when emulating/simulating what?","Sensors","Telephony","Applications","The emulator can emulate/simulate all aspects of a smart phone.","Sensors","");

        questionsLists.add(questions1);
        questionsLists.add(questions2);
        questionsLists.add(questions3);
        questionsLists.add(questions4);
        questionsLists.add(questions5);
        questionsLists.add(questions6);
        questionsLists.add(questions7);
        questionsLists.add(questions8);
        questionsLists.add(questions9);
        questionsLists.add(questions10);
        return questionsLists;
    }

    public static List <QuestionsList> getquestions(String selectedTopicName)
    {
        switch (selectedTopicName)
        {
            case "java":
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "android":
                return androidQuestions();
            default:
                return htmlQuestions();
        }

    }
    }