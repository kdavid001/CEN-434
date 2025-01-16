function factiorial(n) {
  if (n == 0) {
    return 1;
  } else if (n < 0) {
    return "Invalid input";
  } else {
    return n * factiorial(n - 1);
  }
}

function combination(n, r) {
  if (n < r) {
    return factiorial(r) / (factiorial(n) * factiorial(r - n));
  }

  if (n == r) {
    return factiorial(r + 1) / (factiorial(n) * factiorial(r + 1 - n));
  }

  if (n > r) {
    return factiorial(n) / (factiorial(r) * factiorial(n - r));
  }
}

const result = combination(2, 3);
console.log(result);
