// 체크 박스 name
const inputNames = ['skinColor','accessary','eyeColor','hairColor','sunlight'];


// 체크 박스 클릭 event 추가
inputNames.forEach((inputName) => {
    let checkBoxses = document.querySelectorAll(`input[name=${inputName}]`)
    checkBoxses.forEach((checkBox) => {
        checkBox.addEventListener('click', () => {
            initCheckBox(inputName);
            checkBox.checked = true;
        })
    })
})

// 체크 박스 초기화 함수
const initCheckBox = (inputName) => {
    let checkBoxses = document.querySelectorAll(`input[name=${inputName}]`)
    checkBoxses.forEach((checkBox) => {
        checkBox.checked = false;
    })
}

// 체크 박스 확인 함수
const checkCheckBox = () => {
    for (let i = 0; i < inputNames.length; i++) {
         if(document.querySelectorAll(`input[name=${inputNames[i]}]:checked`).length === 0){
            return false;
        }
        
    }
    return true;
}

// 체크 박스 계산 함수
const calCheckBox = () => {
    let warmCnt = 0, coolCnt = 0;

    for (let i = 0; i < inputNames.length; i++) {
        let checkInput = document.querySelectorAll(`input[name=${inputNames[i]}]:checked`)[0]
        if(checkInput === document.querySelector(`input[name=${inputNames[i]}]:nth-child(1)`)){
            warmCnt++;
        }else{
            coolCnt++;
        }
   }
   
   return warmCnt > coolCnt ? ["warm",warmCnt] : ["cold",coolCnt];
}


// 체크 박스 제출 함수
function submitBnt()
{
    if(checkCheckBox()){
        let result = calCheckBox()
        if (result[0] == "warm")
        {
            alert("당신의 퍼스널 컬러는 웜톤입니다.");
            return result[0];
        }
        else (result[0] == "cold")
        {
            alert("당신의 퍼스널 컬러는 쿨톤입니다.");
            return result[0];
        }
    } else{
        alert("체크박스를 모두 선택해주세요!");
    }
}



