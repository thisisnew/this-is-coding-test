const N = 5;
let count = 0;

for( let hour = 0; hour <= N; hour++ ){
    for( let minute = 0; minute < 60; minute++ ){
        for( let second = 0; second < 60; second++ ){
            const time = String( hour ) + String( minute ) + String( second );
            if(hasThree(time)){
                count++;
            }
        }
    }
}

function hasThree(time){
    if(time.indexOf('3') > -1){
        return true;
    }

    return false;
}