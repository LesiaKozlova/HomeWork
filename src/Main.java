public class Main {
    public static void main(String[] args) {
        // Раздел 2, задание 1). Начало
        int first;
        int second;
        int third;
        first = 5;
        second = first*5;
        third = second-first;
        String result = "first, second, third";
        System.out.println(result);
        System.out.println(first+second);
        System.out.println(third%first);  // Раздел 2, задание 1). Конец
        // Раздел 2, задание 2). Начало
        String string1 = "Казнить";
        String string2 = "нельзя";
        String string3 = "помиловать";
        String string4 = ",";
        String string5 = ".";
        System.out.println(string1+string4+" "+string2+" "+string3+string5);
        System.out.println(string1+" "+string2+string4+" "+string3+string5);  // Раздел 2, задание 2). Конец
        // Раздел 2, задание 3). Начало
        String frase = "Anyone who has never made"+"\n"+" a mistake has never tried"+"\n"+"  anything new."+"\n"+"   Albert Einstein.";
        System.out.println(frase);  // Раздел 2, задание 3). Конец
        // Раздел 2, задание 4). Начало
        int number;
        int two = 2;
        number=0;
        boolean chet= number%two==0;
        System.out.println("Число number имеет значение "+number+"." +"\n"
                +"Является ли оно четным?"+"\n"
                +chet);  //Раздел 2, задание 3). Конец
    }
}