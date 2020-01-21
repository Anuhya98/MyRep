const myPromise = new Promise((resolve, reject) => {
    if (Math.random() * 100 <= 50) {
        resolve('Hello, Promises!');
    }
    reject(new Error('In 10% of the cases, I fail. Miserably.'));
});
const onResolved=(resolvedValue) => console.log(resolvedValue);
const onRejected=(error) => console.log(error);
myPromise.then(onResolved,onRejected);