const steps = [
    { horizon: -2, vertical : -1 },
    { horizon: -1, vertical : -2 },
    { horizon: 1, vertical : -2 },
    { horizon: 2, vertical : -1 },
    { horizon: 2, vertical : 1 },
    { horizon: 1, vertical : 2 },
    { horizon: -1, vertical : 2 },
    { horizon: -2, vertical : 1 }
];

const row = 1;
const col = 1;
let result = 0;

steps.forEach( step => {

    const nextRow = row + step.horizon;
    const nextCol = col + step.vertical;

    if( nextRow >= 1 && nextRow <= 8 && nextCol >= 1 && nextCol <= 8 ){
        result++;
    }
});

console.log(result);