public class Main {
    public static void main(String[] args) {

        // task1

        int[] superMassive = new int[]{1,2,3};
        double[] doubleMassive = new double[]{1.57, 7.654, 9.986};
        boolean[] toBeOrNotToBe = {false,true,true};

        // task2

        for (int a=0; a<3; a++) {
            if (a == superMassive.length - 1 ){
                System.out.println(superMassive[a]);}
            else
            {System.out.print(superMassive[a] + ", ");}
        }
        for (int a=0; a<3; a++) {
            if (a == doubleMassive.length - 1) {
                System.out.println(doubleMassive[a]);
            } else {
                System.out.print(doubleMassive[a] + ", ");
            }
        }
        for (int a=0; a<3; a++) {
            if (a == toBeOrNotToBe.length - 1) {
                System.out.println(toBeOrNotToBe[a]);
            } else {
                System.out.print(toBeOrNotToBe[a] + ", ");
            }
        }
        //task3
        for (int a = superMassive.length-1; a >= 0; a = a-1) {
            if (a == 0){
                System.out.println(superMassive[a]);}
            else
            {System.out.print(superMassive[a] + ", ");}}

        for (int a = doubleMassive.length-1; a >= 0; a = a-1){
            if (a==0){
                System.out.println(doubleMassive[a]);}
            else {
                System.out.print(doubleMassive[a] + ", ");
            }}

        for (int a = toBeOrNotToBe.length -1; a >= 0; a--){
            if (a==0){
                System.out.println(toBeOrNotToBe[a]);}
            else {
                System.out.print(toBeOrNotToBe[a] + ", ");}
        }

        //task4
        //int[] superMassive = new int[]{1,2,3};
        for(int a = 0; a < superMassive.length; a++){
            if (superMassive[a]%2 != 0){
                superMassive[a] = superMassive[a] + 1;
                System.out.print(superMassive[a]);}
            else {
                System.out.print(", " + superMassive[a] + ", ");
            }
        }

    }
}