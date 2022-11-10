public class Miniräknare{
    public static void main(String[] args){
        int summa = 0;
        int val = Kbd.readInt("\nVälj räkneoperation\n 1. Addition\n 2. Subraktion\n 3. Multiplikation\n 4. Division\n 5. Modulo");
        int tal1 = Kbd.readInt("\nMata in Tal 1");
        int tal2 = Kbd.readInt("\nMata in Tal 2");

        if(val == 1){
            addition(val,tal1,tal2,summa);
        }
        else if(val == 2){
            subtraktion(val,tal1,tal2,summa);
        }
        else if(val == 3){
            multiplikation(val,tal1,tal2,summa);
        }
        else if(val == 4){
            division(val,tal1,tal2,summa);
        }
        else if(val == 5){
            modulo(val,tal1,tal2,summa);
        }

        /*switch (val){
        case 1:
        addition(val,tal1,tal2,summa);

        case 2:
        subtraktion(val,tal1,tal2,summa);

        case 3:
        multiplikation(val,tal1,tal2,summa);

        case 4:
        division(val,tal1,tal2,summa);

        case 5:
        modulo(val,tal1,tal2,summa);

        break;
        }*/
    }

    static void addition(int val,int tal1,int tal2,int summa){
        summa = tal1+tal2;
        System.out.print(summa);
    }

    static void subtraktion(int val,int tal1,int tal2,int summa){
        summa = tal1-tal2;
        System.out.print(summa);
    }

    static void multiplikation(int val,int tal1,int tal2,int summa){
        summa = tal1*tal2;
        System.out.print(summa);
    }

    static void division(int val,int tal1,int tal2,int summa){
        summa = tal1/tal2;
        System.out.print(summa);
    }

    static void modulo(int val,int tal1,int tal2,int summa){
        summa = tal1%tal2;
        System.out.print(summa);
    }
}