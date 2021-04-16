// consloe.log("hello");

// var roy = 2334;
// console.log(roy);

// var age = prompt("what's my age ???");

// document.getElementById("some text").innerHTML = age;

// var num = 1;
// while(num < 100){
//   num *= 2;
//   console.log(num);
// } 

// for(let i=0; i * i<=100; i++){
//   if(i % 2 == 0){
//     console.log(i);
//   }
// }

// function hii(name){
//   return "hello" + " " +name;
// }

// console.log(hii("roy"));

// var flag = true;
// for(var i=2; i*i<100; i++){
//   if(i % 2 == 0){
//     flag = false;
//     console.log("not a prime no");
//   }
// }

// if(flag){
//   console.log("prime no");
// }

// function binPow(a, b){
//   if(b == 0){
//     return 1;
//   }
//   var res = binPow(a, b / 2);
//   if(b % 2){
//     return res * res * a;
//   }else{
//     return res * res;
//   }
// }

// console.log(binPow(2, 10));

// function pow(a, b, m){
//   a %= a;
//   var res = 1;
//   while(b > 0){
//     if(b & 1){
//     res = res * a % m;
//   }
//   a = a * a % m;
//   b >>= 1;
// }
// return res;
// }


// console.log(pow(2, 2));

// var name = "rohit"; // string
// var age = 10; // number
// var info = {first : "rohit", last : "singh", age : 21}; //object
// var flag = false //boolean
// var list = [1, 2, 3, 4.5, 6, 7, 'rohit', 'singh']; //array
// var random; //undefined
// var nothing = null // null

// console.log(name + "\n" + age + "\n" + info.first + "\n" + flag + "\n" + list + "\n" + random + "\n" + nothing;

// Strings : =============================================================================================

// let fruits = 'mango \n apple \n guava \n orange';
// console.log(fruits.length);
// console.log(fruits.charAt(9));
// console.log(fruits[9]);
// console.log(fruits.toLocaleLowerCase());
// console.log(fruits.toLocaleUpperCase());
// console.log(fruits.toLowerCase());
// console.log(fruits.toUpperCase());
// console.log(fruits.split('')); // split by characters
// console.log(fruits.split(',')); // split by comma
// console.log(fruits.indexOf('p'));
// console.log(fruits.slice(2, 10));
// console.log(fruits.replace('mango', 8826147978));

// // Arrays : ====================================================================================================

// var list = ['banana', 'mango', 'kiwi', 'guava'];
// list = new Array('banana', 'mango', 'kiwi', 'guava');

// for(var i=0; i<list.length; i++){
//   console.log(list[i]);
// }

// console.log(list.fill(1));
// console.log(list.entries());
// console.log(list.join('-'));
// console.log(list.pop());
// console.log(list.push('pine-apple'));
// console.log(list.shift());
// console.log(list.unshift('black berries'));

// var list2 = ['hello', 'hiii', 'bye'];
// console.log(list.concat(list2));
// console.log(list.reverse());
// console.log(list.slice(1, 3));

// var list3 = new Array('zebra','zoo','banana', 'mango', 'kiwi', 'guava');
// var num = [1,3,5,2,9,5,6,7,11,10,34,22,65,56];
// console.log(list3.sort());
// console.log(num.sort(function(a, b){return a - b}));
// console.log(num.sort(function(a, b){return b - a}));

// let arr = new Array();
// for(let i=0; i<=20; i++){
//   arr.push(i);
// }

// console.log(arr);

// let arr1 = new Array();
// for(let i=0; i<12; i++){
//   arr1.push(i);
// }

// console.log(arr1);

// let student = {first : 'rohit',
//   last : 'singh',
//   age : 21, 
//   height : 170,
//   studentInfo : function(){
//                   return this.first + '\n' + this.last + '\n' + this.age + '\n' + this.height; 
//                 }
//   };

// console.log(student.first);
// console.log(student.last);
// console.log(student.age++);
// console.log(student.height*0.5);
// console.log(student.studentInfo());

// var age = prompt("what is your age");
// if((age >= 18) && (age <= 30)){
//   text = "this is your prime";
//   console.log(text);
// }
// else{
//   text = "keep it up man";
//   console.log(text);
// }

// var day = prompt("what is the day today?");

// switch(day){

//   case 0:
//     console.log("weekend");
  
//   case 5: 
//     console.log("weekend");

//   default:
//     console.log("workday");
// }

//==============================================================================================
function pow(a, b){
  if(b == 0){
    return 1;
  }
  var res = pow(a, b / 2);
  if(b % 2){
    res = res * res * a;
  }
  else{
    res = res * res;
  }

  return res;
}

console.log(pow(2, 8));




