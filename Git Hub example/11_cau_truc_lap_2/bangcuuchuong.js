let i = 2;
let j = 1;
document.write("<table border=1 width=100%>");
for (j = 1; j <= 9; j++) {
  document.write("<tr>");
  for (i = 2; i <= 9; i++) {
    document.write("<td>" + i + "x" + j + "=" + i * j);
    document.write("</td>");
  }
}
document.write("</tr></table>");
