function average(a) {
  let sum = 0;
  for (let i = 0; i < a.length; i++) {
    sum += a[i];
    result = sum / a.length;
  }
  return result;
}

const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const result2 = average(numbers);
console.log(result2);
