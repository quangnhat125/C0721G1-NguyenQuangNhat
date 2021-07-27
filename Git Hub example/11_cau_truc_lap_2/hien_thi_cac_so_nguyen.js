let N = 2;
function kiem_tra_snt(n) {
  var ketqua = true;
  if (n < 2) {
    ketqua = false;
  } else if (n == 2) {
    ketqua = true;
  } else if (n % 2 == 0) {
    ketqua = false;
  } else {
    for (var i = 2; i <= Math.sqrt(n); i += 1) {
      if (n % i == 0) {
        ketqua = false;
        break;
      }
    }
  }
  return ketqua;
}
function print() {
  let n = 2;
  let num = parseInt(document.getElementById("number").value);
  let count = 0;
  while (count < num) {
    if (kiem_tra_snt(n)) {
      count += 1;
      console.log(n);
    }
    n++;
  }
  document.getElementById("result").innerHTML = count;
}
