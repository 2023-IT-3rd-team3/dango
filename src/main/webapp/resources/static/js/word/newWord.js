const okBtn = $(".ok-btn");
const wordJp = $(".word-jp");
const answer = $(".answer");

for(let i = 0; i < okBtn.length; i++) {
    okBtn[i].addEventListener("click", () =>{
        const data = {
            userId: userId,
            wordId: answer[i].value
        };
        if(wordJp[i].value !== answer[i].value) {
            alert("오답...");
            addWrong(data);
        }
        addEndWord(data);
    })
}

function addEndWord(data) {
    $.ajax({
        type: 'post',
        url: '/dango/endWord/add',
        data: {
            "userId": data.userId,
            "wordId": data.wordId
        },
        success: () =>{
            console.log("성공!");
        },
        error: () =>{
            console.log("에러");
        }
    })
}
function addWrong(data) {
    $.ajax({
        type: 'post',
        url: '/dango/wrong/add',
        data: {
            "userId": data.userId,
            "wordId": data.wordId
        },
        success: () =>{
            console.log("성공!");
        },
        error: () =>{
            console.log("에러");
        }
    })
}