function fibonacci(num) {
    if (num == 1 || num == 2) {
        return 1;
    }
    return fibonacci(num - 1) + fibonacci(num - 2);
}
var sum = 0;
for (var i = 1; i <= 5; i++) {
    console.log(fibonacci(i));
    sum += fibonacci(i);
}
console.log("Sum:" + sum);
