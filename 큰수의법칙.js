//const arr = [2,4,5,4,6];

// const m = 8;
// const k = 3;

// let first = arr[0];
// let second;

// arr.forEach(item => {
//     if( item > first ){
//         second = first;
//         first = item;
//     }
// });

// let total = 0;

// for( let i = 1; i <=m; i++ ){
//     if( i % k === 0 ){
//         total += second;
//     } else {
//         total += first;
//     }
// }

const arr = [2,4,5,4,6];

const m = 8;
const k = 3;

arr.sort((a,b) => {
    return b-a;
});

const first = arr[0];
const second= arr[1];

let total = 0;

for( let i = 1; i <=m; i++ ){
    if( i % k === 0 ){
        total += second;
    } else {
        total += first;
    }
}

console.log( '합:', total );