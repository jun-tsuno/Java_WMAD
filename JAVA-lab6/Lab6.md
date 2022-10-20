# Lab 6: Finding Max in an Array

Define a Generic Class type method called `array_max` that will generalize the method such that it finds maximum value for both `int` and `double` type array input values.

Your generic class type array_max method code should find the maximum element in an array using generics.

- Method will take the array and array size as parameters.

#### Expected input

```bash
//Input 1
//If input is:
int arr_i[] = {2,8,20,3,4};
int arr_i_size = arr_i_size.size();

//Input 2
//If input is 
double arr_d[] = {2.7,3.8,5.5,6.7,9.7}
int arr__d_size = arr_d.size();
//Expected output 1
20
//Expected output 2
9.7
```

#### Sample code with none generic

```bash
class FindMax {
    public static Integer array_max(Integer data[], int n) {
        //body of code
        return 0;
    }

    public static Double array_max(Double data[], int n) {
        //body of code
        return 0.0;
    }
}
```