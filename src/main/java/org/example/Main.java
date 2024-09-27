package org.example; xc

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        System.out.println("This is my program");

        int a = 10;
        int b = 2;
        float c = 3;
        String nama = "Ani";
        char g = 'Y';
        boolean flag = false; //true

        //Arithmathic Operation
        int result = a / b;
        int result2 = (int) (a + c);
        //  float result3 = a+c;
        System.out.println(result);
        System.out.println(result2);
        // System.out.print(result3);

        int timeStart = 9;
        int timeFinish = 10;
        int waktumasuk = 10;
        int waktupulang = 12;

        if (waktumasuk <= timeStart && waktupulang >= timeFinish) {
            System.out.println("Selamat anda karyawan teladan");
            System.out.println("Anda sampai" + (timeStart - waktumasuk) + "jam lebih cepat");
        } else if (waktumasuk <= timeStart && waktupulang < timeFinish) {
            System.out.println("Pulang duluan");
            System.out.println("Anda sampai" + (timeStart - waktumasuk) + "Jam lebih cepat");
            System.out.println("Anda pulang" + (timeFinish - waktupulang) + "Jam lebih cepat");
        } else {
            System.out.println("Udah telat, pulang duluam");
        }

        //Swith case
        int day = 3;
        switch(day){
            case 1:
                System.out.println("Saya WFH");
                break;
            case 2:
                System.out.println("saya WFH lagi");
                break;
            case 3:
                System.out.println("Saya WFO");
                break;
            case 4:
                System.out.println("kerja");
                break;
            case 5:
                System.out.println("saya libur");
                break;
        }

        // loop
        for(int i=1;i < 10; i = 1+2){
            if(i == 6) {
                break;
            }
            System.out.println("outer loop" +1);

            for(int j=0; j<=5; j++){
                System.out.println(j+i);
           }
       }
     }
}
