function convert () {
    let a = parseInt(document.getElementById("amount").value);
    let x = document.getElementById("select 1").value;
    let y = document.getElementById("select 2").value;
    let z;
    if (x == "VND"){
        if (y == "VND"){
            z = a * 1
        } else if (y == "USD") {
            z = a * 23000
        } else if (y == "AUD") {
            z = a * 17800
        } esle {
            z = a * 18000
        }
    }
}
document.getElementById("tien").innerText = z;