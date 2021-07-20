function do_something() {
  let x = parseInt(document.getElementById("number1").value);
  let y = parseInt(document.getElementById("number2").value);
  let z = x + y;
  document.getElementById("result").innerText = z;
}
function do_something1() {
  let x = document.getElementById("number1").value;
  let y = document.getElementById("number2").value;
  let z = x - y;
  document.getElementById("result").innerText = z;
}
function do_something2() {
  let x = document.getElementById("number1").value;
  let y = document.getElementById("number2").value;
  let z = x * y;
  document.getElementById("result").innerText = z;
}
function do_something3() {
  let x = document.getElementById("number1").value;
  let y = document.getElementById("number2").value;
  let z = x / y;
  document.getElementById("result").innerText = z;
}
