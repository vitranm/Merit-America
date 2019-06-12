//return the sum of 1 to N.  For example Sum1toN(3) would return the sum of 1+2+3 which is 6.
function sumTo(n) {
    var sum = 0;
    for (var i = 1;i <= n; i++){
      sum += i;
    }
    return sum;
  }
  
  sumTo(3);


//sum1toN(255) returns the sum of all numbers from 1 to 255
function Sum1toN(n){
    var sum = 0;
    for(var i=1; i<256;i++){
        sum = sum + i;
    }
    return sum;
}
Sum1toN();

//return the sum of the first number in the array and the last number in the array

var Barr = [9,78,2,69,7,21,4,16]

function sumFirstLast(arr){
    var sum=0
    for(var i=0; i<arr.length; i++){

    }
   return (arr[0]) + (arr[arr.length - 1]);
}

sumFirstLast(Barr)

//returns the largest number in the array.  For example, returnLargest([1,3,10]) should return 10.  returnLargest([-2,-5,-10]) should return -2.

var Carr = [9,72,14,2]

function returnLargest(arr){
    var largest = arr[0];
    for( var i=1; i<arr.length; i++){
        if (largest< arr[i]){
            largest = arr[i];
        }
    }
    return largest
}
returnLargest(Carr);

    

describe("Sum1toN", function() { 
    it("should return 3 when we pass 2 as an argument", function() { 
        expect(Sum1toN(2)).toEqual(3); 
    }); 
    it("should return 6 when we pass 3 as an argument", function() { 
        expect(Sum1toN(3)).toEqual(6); 
    }); 
    it("should return 10 when we pass 4 as an argument", function() { 
        expect(Sum1toN(4)).toEqual(10); 
    }); 
});
    
describe("sumFirstLast", function() { 
    it("should return 3 when we pass [1,2] as an argument", function() { 
        expect(sumFirstLast([1,2])).toEqual(3); 
    }); 
    it("should return 10 when we pass [2,3,8] as an argument", function() { 
        expect(sumFirstLast([2,3,8])).toEqual(10); 
    }); 
    it("should return -10 when we pass [-6,23,3,-4] as an argument", function() { 
        expect(sumFirstLast([-6,23,3,-4])).toEqual(-10); 
    }); 
});
