let N = 2;
    function kiem_tra_snt(n) {
        var ketqua = true;
        if (n < N) {
            ketqua = false;
        } else if (n == N) {
            ketqua = true;
        } else if (n % N == 0) {
            ketqua = false;
        } 
            else {
            for (var i = 3; i <= Math.sqrt(n); i += 2) {
                if (n %  i == 0) {
                    ketqua = false;
                    break;
                }
            }
        }
        return ketqua;
    }  
    function click() {
        let num = parseInt(document.getElementById("number")).value;
        let count = 0;
            for (count = 0, count < num; count++ ) {
                if (kiem_tra_snt(n)){
                    count += i + "</br>";
                }
            }
            document.getElementById("result").innerHTML= count;
    }