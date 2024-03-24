package task.methods;

import java.util.Arrays;

public class Methods {


    public static void main(String[] args) {
        // Пример вызова метода
        String string = getString("HELLO");
        // Ожидаемый результат hello System.out.println(string);
        // Вызовы ваших методов

    }

    // Метод принимающий строку и преобразующий ее в нижний регистр
    public static String getString(String example) {
        return example.toLowerCase();
    }

// Реализуйте функциональность согласно описанию`

// TODO: Создайте метод который вернет сумму двух чисел

    //int sum (int a, int b )
   // {
     //   int c = a + b ;
       // return c;
    //}


// TODO: Создайте метод который вернет сумму двух переданных строк
   //
   // String sum(String a, String b){

  //      String c = a + b ;
    //    return c

   // }

// TODO: создайте метод который примет строку внутри которой передается число , а также принимает число . Метод должен суммировать числа
//  обернуть их в строку и вернуть результат строкой

//        public static String sum (String b , int a1) {
//        int a = 3;
//
//        String text = "4";
//
//        int b1 = Integer.parseInt(text);
//        int sum = (a + b1);
//
//        return Integer.toString(sum);

    // }

// TODO: Создайте метод который принимает строку , число . Внутри строки передается число . Проверить , что если число внутри строки больше чем
//  число которое передается как int , то пусть метод вернет false , а если меньше , то true
//public static boolean sum(String b, int a) {
    // Integer int1 = 3;
  //  int a1 = 9;

    //String text = "8";
    //int b1 = Integer.parseInt(text);
    //boolean c1 = b1 > a1 ;
    //return c1;


// TODO: Создайте метод который принимает 2 булевые переменные . Если обе true , верни true , если хоть одна из них true верни true ,
//  если обе false верни false
  //  public  boolean equals (boolean a , boolean b) {
    // boolean a1 = true;
    // boolean b1 = true;

    // boolean c1 = equals(a1==b1);

    // return super.equals(c1);
//}

// TODO: Создайте метод который принимает число и вернет true если оно четное , и false если оно не четное
    //static boolean IR (int a){
    //return (a%2==0);
     //}

   // public static void main(String[] args){
      //  System.out.println(IR(8) );
   // }





// TODO: Создайте метод который проверят числа в массиве , если все они четные верни "Массив четных чисел" , если есть и четные и не
//  четные верни "Массив четных и не четных чисел" и если в массиве только нечетные числа верни "Массив не четных чисел"

  //  public static String iR(int[] array) {

      //  int max = 6;
      //  for (int i : array) {
         //   if (i % 2 == 0){
            //    max++;
           // }


        //}

       // return String.valueOf((max));

    //}


//}



// TODO: Создайте метод который принимает массив чисел и возвращает новый массив чисел . Внутри метода пройдитесь по элементам
//  массива который подается в аргументы  и сложите все элементы в новый массив и верните его


// TODO: Создайте метод который принимает массив чисел и возвращает число . Внутри метода пройдитесь по элементам массива который подается в
//  аргументы сложите все числа который переданы в массиве и верните сумму всех чисел
    //public static String iR(int[] array){

    //int [] a = new int[4];
    //int sum  = 0;
    //a[0]=2;
    //a[1]=2;
    //a[2]=2;
    //a[3]=2;
    //for (int i = 0; i < a.length; i++) {
      //  sum += a[i];
    //}

    //return Arrays.toString(a);


// TODO: Создайте методы в которые можно будет передавать свой возраст , а возвращаться сколько полных месяцев в этом возрасте ,
//  тоесть если человек прожил 10 лет , это 120 месяцевтак же сделайте перевод возраста в минуты и метод который расчетает возраст в часах
  //  public static int iR(int a){

    //int age = 25;
    //int  months = 12;

    //return (age * months );



  //  public static int iR(int a){

    //    int age = 25;
      //  int minutesPerYear  = 525600 ;

      //  return (age * minutesPerYear );


   // public static int iR(int a){

       // int age = 25;
      //  int hoursPerYear  = 8760 ;

      //  return (age * hoursPerYear );









// TODO: Создайте метод которому передаю имена , а он проверяет одинаковые ли они , причем не зависимо от регистра


// TODO: Создайте метод которому можно передать массив элементов , а он вернет последний элемент


// TODO: Создайте метод счетчик букв А . Подается строка и метод посчитает сколько букв А в строке


// TODO: Создайте метод кошелек , у него есть началная сумма и можно вычитать пока деньги не кончатся или сумма не будет слишком велика
}