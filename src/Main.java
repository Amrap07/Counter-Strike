public class Main {
    public static void main(String[] args) {

        System.out.println("FURIA");
        int Pasha = 74;
        int Sasha = 65;
        int Kolya = 34;
        int Petia = 37;
        int Katia = 73;
        double res =  (double)(Pasha+Sasha+Kolya+Petia+Katia)/5;
        System.out.println("Результат команди FURIA = "  + res);
        System.out.println("ANACONDA");
        int John = 56;
        int Sam = 15;
        int Michelle = 136;
        int Aleks = 23;
        int Rose = 77;
        double res1 =  (double)(John+Sam+Michelle+Aleks+Rose)/5;
        System.out.println("Результат команди ANACONDA = " + res1);

        if (res > res1) {
            System.out.println("Перемогла команда "  +  "FURIA " + "набрала " + res + " oчків");
        }
        else if (res1 > res) {
            System.out.println("Перемогла команда "  +   "ANACONDA "  +  "набрала "  + res1 + " oчків");
        }

    }



}

