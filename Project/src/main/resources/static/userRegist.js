function validateInfo() {
  var uId = document.getElementById("userId");
  var uPw = document.getElementById("userPassword");
  var cPw = document.getElementById("confirmPassword");
  var fName = document.getElementById("userFname");
  var lName = document.getElementById("userLname");
  var userEmail = document.getElementById("userEmail");
  var pNumber = document.getElementById("userPhoneNumber");
  var uAddress = document.getElementById("userAddress");

  if (validateUsername(uId, 6, 12)) {
    if (validateUsernameChar(uId)) {
      if (validatePassword(uPw, 8, 16)) {
        if (confirmPassword(uPw, cPw)) {
          if (validateFirstName(fName)) {
            if (validateLastName(lName)) {
              if (validateEmail(userEmail, 64)) {
                if (validatePhoneNumber(pNumber, 13)) {
                  if (validateAddress(uAddress, 128)) {
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}

function validateUsername(id, min, max) {
  var idLength = id.value.length;
  if (idLength < min || idLength > max) {
    alert(`Username should be between ${min} and ${max} letters.`);
    id.focus();
    return false;
  }
  return true;
}

function validateUsernameChar(name) {
  var letters = /^[A-Za-z0-9]+$/;
  if (name.value.match(letters)) {
    return true;
  }
  alert(`Username should contain Alphabet and Numbers only`);
  return false;
}

function validatePassword(pw, min, max) {
  var pwLength = pw.value.length;
  if (pwLength < min || pwLength > max) {
    alert(`Password should be between ${min} and ${max} letters.`);
    pw.focus();
    return false;
  }
  return true;
}

function confirmPassword(pw, cpw) {
  var pwValue = pw.value;
  var cpwValue = cpw.value;

  if (pwValue !== cpwValue) {
    alert(`Password does not match`);
    return false;
  } else {
    return true;
  }
}

function validateFirstName(name) {
  var letters = /^[A-Za-z]+$/;
  if (name.value.match(letters)) {
    return true;
  }
  alert(`First name should contain Alphabet characters only`);
  return false;
}

function validateLastName(name) {
  var letters = /^[A-Za-z]+$/;
  if (name.value.match(letters)) {
    return true;
  }
  alert(`Last name should contain Alphabet characters only`);
  return false;
}

function validateEmail(email, max) {
  var email = userEmail.value.length;
  if (email > max) {
    alert(`Email cannot contain 3 letters only`);
    return false;
  }
  return true;
}

function validatePhoneNumber(number, max) {
  var number = pNumber.value.length;
  if (number > max) {
    alert(`Phone number should contain 13 numbers only`);
    return false;
  }
  return true;
}

function addHyphen() {
  var input = document.getElementById("userPhoneNumber");
  if (input.value.length === 3 || input.value.length === 7) {
    input.value += "-";
  }
}

function validateAddress(address, max) {
  var address = userAddress.value.length;
  if (address > max) {
    alert(`address cannot contain 3 letters only`);
    return false;
  }
  return true;
}
