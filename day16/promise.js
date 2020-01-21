promise=new Promise(function(resolve,reject){
    setTimeout(resolve,5000)
})
promise.then(function(){
    console.log('This is done');
})
promise.then(function(){
console.log('This is also done');
})
promise.then(function(){
    console.log('Exit');
})