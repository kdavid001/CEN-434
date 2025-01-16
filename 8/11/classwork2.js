function factiorial(n) {
  if (n == 0) {
    return 1;
  } else if (n < 0) {
    return "Invalid input";
  } else {
    return n * factiorial(n - 1);
  }
}

const result = factiorial(31);
console.log(result);
