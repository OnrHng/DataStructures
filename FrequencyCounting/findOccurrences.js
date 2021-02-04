arr = [ 1, 3, 5, 5, 2, 1, 5 ]; 
//  1: 2
//  3: 1
//  5: 3
//  2: 1

// solution 1
var obj = {};
function findCount(arr) {
  
  for(i=0;i<arr.length;i++){
    if(obj[a[i]]) {
      obj[a[i]]++;
    }else {
      obj[a[i]] = 1;
    }
  } 
}
findCount(arr);
console.log(obj);

// solution 2
const map = arr.reduce((acc, e) => acc.set(e, (acc.get(e) || 0) + 1), new Map());
console.log(map);
