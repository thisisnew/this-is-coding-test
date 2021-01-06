const n = 5;
const plans = 'R R R U D D'.split(' ');
let x = 1;
let y = 1;

const dx = [0, 0, -1, 1];
const dy = [-1, 1, 0, 0];

const moveTypes = ['L', 'R', 'U', 'D'];

plans.forEach(plan => {
    let nx = -1;
    let ny = -1;

    moveTypes.forEach( (type, idx) => {
        if(plan === type){
            nx = x + dx[idx];
            ny = y + dy[idx];
        }
    });

    if( valid( nx, ny, n ) ){
        x = nx;
        y = ny;
    }
});

function valid(nx, ny, n){
    if( nx < 1 || ny < 1 || nx > n || ny > n ){
        return false;
    }

    return true;
}

console.log(x + ', ' + y);