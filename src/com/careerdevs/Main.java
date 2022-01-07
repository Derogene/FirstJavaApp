package com.careerdevs;

public class Main {

    public static void main(String[] args) {

        //Alg 1
        System.out.println(getFirstValue(new int[]{1, 2, 3, 4}));

        // Alg 2
        System.out.println(addition(3));

//        //Alg 3
//        System.out.println(search(int arr[]{-1}));
//
//        //Alg 4
//        System.out.println(convert(4));
//
//        //Alg 5
//        System.out.println(giveMeSomething(a: "something"));
//        //Alg 7
//        System.out.println(countWords);
//
    }

    //Alg 1
    public static int getFirstValue(int[] arr) {
        return arr[0];
    }

    //Alg 2
    public static int addition(int num) {
        return num + 1;
    }
}
//    //Alg 3
//    public static int search(int arr[], int item) {
//        int index = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == item) {
//                index = i;
//                i += arr.length + 1;
//            }
//        }
//        return index;
//    }
//
//}
//
//    //Alg 4
//    public static int convert(int minutes) {
//        return minutes * 60;
//   }
//
//    //Alg 5
// 	public static String giveMeSomething(String a){
//      String str1 = "Hello";
//      String str2 = "Space World";
//
//      System.out.println(str1.concat(str2) );
//      System.out.println("hello".concat(str2) );
//        System.out.println(String.join( " ", "something" , a));
//        System.out.printf("something %s%n", a);
//      return "something " + a;
//    }
//
//}
//
//        //ALg 6
//        public static boolean reverse(boolean b) {
//            // input true then output false
//            // input false then output true
//
//            //option 1 - if else
//            if(b == true)   {
//                return false;
//        } else {
//                return true;
//        }
//
//            if (b) {
//                return false
//        }
//            return true;
//
//
//            //option 2 - not operator
//            retrun !b;
//
//            //option 3 - ternary
//            return b ? false : true
//
//        }
//          //Alg 7
//      public static int countWords(String s) {
//		String[] arrOfStr = s.split(" ");
//		return s.split(" ").length;
//	}
//
//      // Alg 8
//  public static boolean existsHigher(int[] arr, int n) {
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] >= n) {
//				return true;
//			}
//		}
//			return false;
//	}
//}
//