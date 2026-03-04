var users = [];
var inputUser = function () {
  var n = prompt("Enter name");
  var e = prompt("Enter email");
  var obj = {
    name: n,
    email: e,
  };
  users.push(obj);
};

function inputData() {
  for (i = 0; i < 3; i++) {
    inputUser();
  }
}

function display() {
  var htmlStr = `<table><tr><th>Name</th><th>Email</th></tr>`;
  for (i = 0; i < 3; i++) {
    htmlStr += `<tr>
                                <td>${users[i].name}</td>
                                <td>${users[i].email}</td>
                            </tr>`;
  }
  htmlStr += "</table>";
  document.write(htmlStr);
}

inputData();
display();
