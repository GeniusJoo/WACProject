function validateInfo() {
    var uPw = document.getElementById("password");
    var userEmail = document.getElementById("email");
    if (validatePassword(uPw, 8, 16)) 
    {
        if (validateEmail(userEmail, 64)) 
        {
  
        }
    }
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
  
  function validateEmail(email, max) {
    var email = userEmail.value.length;
    if (email > max) {
      alert(`이메일은 ${max}자를 넘을 수 없습니다.`);
      return false;
    }
    return true;
}   