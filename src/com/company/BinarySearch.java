package com.company;

public class BinarySearch {

    //Binary search example with recursion

    int binarySearchAlgorithm(int searchArray[], int l, int r, int searchVal){

        if(r >= l){
            System.out.println("l: " + l + ", r: " + r);
            int mid = l + (r - l) / 2;
            System.out.println("mid: " + mid);

            if(searchArray[mid] == searchVal){
                return mid;
            }

            //If true, then the value would be in the left of the array
            if(searchArray[mid] > searchVal){
                return binarySearchAlgorithm(searchArray, l, mid -1, searchVal);
            }
            else{
                //Else, it will be in the right array
                return binarySearchAlgorithm(searchArray, mid + 1, r, searchVal);
            }
        }

        return -1;


    }

    public static void main(String[] args) {

        BinarySearch searchObj = new BinarySearch();

        int array[] = {3, 5, 7, 9, 11, 14, 20, 30};
        int n = array.length;
        int x = 11;


        int result = searchObj.binarySearchAlgorithm(array, 0,n-1, x);
        if(result == -1){
            System.out.println("Element does not exist");
        }
        else{
            System.out.println("Element found at index " + result);
        }

    }
}
