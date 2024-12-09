# Identical Arrays Problem

### Conditions to be identical

Noticed ( to optimize )
- Same number of elements ( array size )

Given
- Presence of element in both
- If count of element is n1 and n2 in arr1 and arr2, then n1 = n2

--- 

### Size Comparison
 ```cpp
 if (arr1.size() != arr2.size()) return false;
 ```
<br>

### Presence of element + Count
I combined both these factors into a common factor: unordered map ( or dictionary | map )
- From first array, increment the count for each element
- From second array, decrement the count for each element
- If count of any element is negative, return `false` (hence breaking loop)
- If the whole loop proceeds without returning false, `return true`

Here's an instance
 
> <br> Table from arr 1 : `{ a, b, b, c, c, c }`
> |element|count|
> |:---:|:---:|
> |a|1|
> |b|2|
> |c|3|

> <br> Table from identical arr 2 : `{ a, b, b, c, c, c }`
> |element| reduced count|
> |:---:|:---:|
> |a|0|
> |b|0|
> |c|0|

 > <br> Table from NON identical arr 3 : `{ a, b, b, c, c, d }`
 > |element| reduced count|
 > |:---:|:---:|
 > |a|0|
 > |b|0|
 > |c|1|
 > |d|<span style="color:#ff8888;">-1<span>| 
 > 
 > since the count went below 0 `return false`

<br>

### Code Implementation of unordered map
```cpp
std::unordered_map<int, int> map;

// creating ref table;
for (auto elem : arr1) { map[elem]++; }

for (auto elem : arr2){
    map[elem]--;
    if (map[elem] < 0) { return false; }
}

// if all tests passed
return true;
```

 ---

[Code File](../cpp/identical_arrays.cpp) <br> 
[Report Bug](mailto:ashwin.aksharma.p@gmail.com) <br>
[Back to home](../README.md)