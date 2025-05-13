


Remove Most Repeated Element from an Array

## Introduction
This Java program finds the most repeated element in an array. The user inputs the size of the array and its elements, and the program determines which element appears most frequently.

## Code Overview
The program follows these steps:
1. Accepts the array size from the user.
2. Accepts array elements from the user.
3. Iterates through the array to determine the most repeated element.
4. Prints the most repeated element.

## Code Explanation

```java
package duplicateElemtOperations;

import java.util.Scanner;

public class Remove_Most_Repeated
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Elements one by one");
        for(int i = 0; i <= arr.length - 1; i++)
        {
            arr[i] = s.nextInt();
        }
        
        int count = 0;
        int maxCount = 0;
        int mostRepeated = arr[0];
        for(int i = 0; i <= arr.length - 1; i++)
        {
            for(int j = 0; j <= arr.length - 1; j++)
            {
                if(arr[j] == arr[i])
                    count++;
            }
            if(count > maxCount)
            {
                maxCount = count;
                mostRepeated = arr[i];
            }
        }
        System.out.println("Most Repeated Value is:-" + mostRepeated);
        s.close();
    }
}
```

## Explanation of Variables
- **size**: Holds the size of the array as entered by the user.
- **arr[]**: Array that stores the user-provided integers.
- **count**: Keeps track of how many times a particular number appears.
- **maxCount**: Stores the highest count encountered so far.
- **mostRepeated**: Stores the most frequently occurring element in the array.

## Explanation of Loops and Conditions
### **First for loop** (Line 11 - Line 15):
- Iterates over the array indices.
- Accepts user input for each index and stores it in the `arr[]` array.

### **Nested for loop** (Line 20 - Line 24):
- The outer loop iterates through each element in `arr[]`.
- The inner loop compares the current element with all other elements in the array.
- If a match is found, `count` is incremented.

### **If condition** (Line 25 - Line 29):
- If `count` exceeds `maxCount`, `maxCount` is updated.
- `mostRepeated` is updated to store the element with the highest frequency.

## Sample Input/Output
### **Example 1**
#### **Input:**
```
Enter the Array Size
5
Enter the Elements one by one
1 2 2 3 1
```
#### **Output:**
```
Most Repeated Value is:-2
```
### **Example 2**
#### **Input:**
```
Enter the Array Size
6
Enter the Elements one by one
4 5 6 5 4 5
```
#### **Output:**
```
Most Repeated Value is:-5
```

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Remove_Most_Repeated.git
```
