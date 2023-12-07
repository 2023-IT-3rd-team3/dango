let id = document.getElementById("id");
let idP = document.getElementById("id-p");

id.addEventListener("keyup", () => {
    if(id.value.length < 6) idP.style.display = "block";
    else idP.style.display = "none";
})

let password = document.getElementById("password");
let passwordP = document.getElementById("password-p");

password.addEventListener("keyup", () => {
    if(password.value.length < 8) passwordP.style.display = "block";
    else passwordP.style.display = "none";
})

let password2 = document.getElementById("password2");
let password2P = document.getElementById("password2-p");

password.addEventListener("keyup", () => {
    if(password.value === password2.value) password2P.style.display = "none";
    else password2P.style.display = "block";
})
password2.addEventListener("keyup", () => {
    if(password.value === password2.value) password2P.style.display = "none";
    else password2P.style.display = "block";
})