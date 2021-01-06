const M = 3;
const N = 3;

const arr = [3,1,2,4,1,4,2,2,2];

let tempArr = [];
let min = 0;
arr.forEach((item, index) => {
    if(index > 0 && index % M === 0){    
        tempArr.sort(function(a,b){
            return a-b;
        });
        
        console.log(tempArr);

        const val = tempArr[0];

        if( val > min  ){
            min = val;
        }
        
        tempArr = [];
    }
    console.log(item);
    tempArr.push(item);
});

console.log(min);

