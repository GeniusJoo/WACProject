function validateInfo() {
  var uId = document.getElementById("id");
  var uPw = document.getElementById("password");
  var cPw = document.getElementById("confirmPassword");
  var userEmail = document.getElementById("email");

  if (validateUsername(uId, 6, 12))
  {
    if (validatePassword(uPw, 8, 16)) 
    {
      if (confirmPassword(uPw, cPw))
      { 
        if (validateEmail(userEmail, 64)) 
        {

        }
      }
    }
  }
}

function validateUsername(id, min, max) {
  var idLength = id.value.length;
  if (idLength < min || idLength > max) {
    alert(`아이디는 ${min}자 이상 ${max}자 이하입니다.`);
    id.focus();
    return false;
  }
  return true;
}

function validatePassword(pw, min, max) {
  var pwLength = pw.value.length;
  if (pwLength < min || pwLength > max) {
    alert(`비밀번호는 ${min}자 이상 ${max}자 이하입니다.`);
    pw.focus();
    return false;
  }
  return true;
}

function confirmPassword(pw, cpw) {
  var pwValue = pw.value;
  var cpwValue = cpw.value;

  if (pwValue !== cpwValue) {
    alert(`비밀번호 확인이 일치하지 않습니다.`);
    return false;
  } else {
    return true;
  }
}

function validateEmail(email, max) {
  var email = userEmail.value.length;
  if (email > max) {
    alert(`이메일은 ${max}자를 넘을 수 없습니다.`);
    return false;
  }
  return true;
}

function checkOnlyOne(element) {
  const checkboxes = document.getElementsByName("sex");
  checkboxes.forEach((cb) => {
    cb.checked = false;
  })
  element.checked = true;
}