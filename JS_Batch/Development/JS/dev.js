function ageInDays(){
  var birthYear = prompt("what is your birthyear ?");
  var age = (2020 - birthYear) * 365;

  var h1 = document.createElement('h1');

  var textAns = document.createTextNode('you are ' + age + ' days old');

  h1.setAttribute('id', 'ageInDays');

  h1.appendChild(textAns);

  document.getElementById('flex-box-result').appendChild(h1); 
}

function reset(){
  document.getElementById("ageInDays").remove()
}